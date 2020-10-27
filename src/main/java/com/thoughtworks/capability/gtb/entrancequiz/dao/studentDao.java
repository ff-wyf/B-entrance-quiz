package com.thoughtworks.capability.gtb.entrancequiz.dao;

import com.thoughtworks.capability.gtb.entrancequiz.domain.student;

import java.util.ArrayList;
import java.util.List;

public class studentDao {
    public static List<student> studentList = new ArrayList<student>(){
        {
            add(new student(1, "成吉思汗"));
            add(new student(2, "鲁班七号"));
            add(new student(3, "太乙真人"));
            add(new student(4, "钟无艳"));
            add(new student(5, "花木兰"));
            add(new student(6, "雅典娜"));
            add(new student(7, "芈月"));
            add(new student(8, "白起"));
            add(new student(9, "刘禅"));
            add(new student(10, "庄周"));
            add(new student(11, "马超"));
            add(new student(12, "刘备"));
            add(new student(13, "哪吒"));
            add(new student(14, "大乔"));
            add(new student(15, "蔡文姬"));
        }
    };
}
