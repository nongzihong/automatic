package com.example.automatic.controller;


import com.example.automatic.entity.Student;
import com.example.automatic.mapper.StudentMapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ZH
 * @since 2020-04-08
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentMapper studentMapper;


    @GetMapping("/test")
    @ApiOperation(value = "测试接口", notes = "测试")
    public List<Student> getStudent1(Student stu) {
        List<Student> lists = studentMapper.selectList(null);
        studentMapper.selectByMap();
        return lists;
    }

    @GetMapping("/count")
    @ApiOperation(value = "统计数量", notes = "测试")
    public int getCount(){
        return studentMapper.count();
    }

}

