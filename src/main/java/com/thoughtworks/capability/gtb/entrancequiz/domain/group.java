package com.thoughtworks.capability.gtb.entrancequiz.domain;

import java.util.List;

public class group {
    private int groupId;
    private List<student> studentList;

    public group(int groupId, List<student> studentList) {
        this.groupId = groupId;
        this.studentList = studentList;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public List<student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<student> studentList) {
        this.studentList = studentList;
    }
}
