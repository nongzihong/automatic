package com.example.automatic.service.impl;

import com.example.automatic.entity.Student;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
class StudentServiceImplTest {

    @Autowired
    StudentServiceImpl imp;

    @Test
    void insert() {
        Student student = new Student();
        student.setId(4);
        student.setAge(23);
        student.setName("王五");
        System.out.println(imp.insert(student));
    }

    @Test
    void del() {
        System.out.println(imp.del(4));
    }

    @Test
    void update() {
        Student student = new Student();
        student.setId(2);
        student.setAge(20);
        student.setName("张三");
        System.out.println(imp.update(student));
    }
}