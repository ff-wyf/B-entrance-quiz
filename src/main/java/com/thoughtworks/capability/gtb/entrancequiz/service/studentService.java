package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.dao.studentDao;
import com.thoughtworks.capability.gtb.entrancequiz.domain.group;
import com.thoughtworks.capability.gtb.entrancequiz.domain.student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class studentService {
    public List<student> getStudentList() {
        return studentDao.studentList;
    }

    public List<group> getGroupList() {
        List<group> groupList = new ArrayList<group>();
        for(int i = 0; i < 6; ++i) {
            group group = new group(i, new ArrayList<student>());
            groupList.add(group);
        }
        List<student> stuList = new ArrayList<student>();
        for(int i = 0; i < studentDao.studentList.size(); ++i) {
            student stu = new student(studentDao.studentList.get(i).getId(), studentDao.studentList.get(i).getName());
            stuList.add(stu);
        }
        Collections.shuffle(stuList);
        for (int i = 0; i < studentDao.studentList.size(); ++i) {
            groupList.get(i % 6).getStudentList().add(stuList.get(i));
        }
        return groupList;
    }
}
