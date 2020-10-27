package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.domain.group;
import com.thoughtworks.capability.gtb.entrancequiz.domain.student;
import com.thoughtworks.capability.gtb.entrancequiz.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class studentController {
    private studentService studentService;

    @Autowired
    public studentController(studentService studentService) {
        this.studentService = studentService;
    }

    @CrossOrigin
    @GetMapping("/studentList")
    public ResponseEntity getStudentList() {
        List<student> studentList = studentService.getStudentList();
        return ResponseEntity.ok(studentList);
    }

    @CrossOrigin
    @GetMapping("/groupList")
    public ResponseEntity getGroupList() {
        List<group> groupList = studentService.getGroupList();
        return ResponseEntity.ok(groupList);
    }
}