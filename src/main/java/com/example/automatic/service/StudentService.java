package com.example.automatic.service;

import com.example.automatic.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author ZH
 * @since 2020-04-08
 */
public interface StudentService extends IService<Student> {

    //统计数量的方法
    int count();

    //增加方法
    int insert(Student student);

    //删除方法
    int del(int id);

    //修改方法
    int update(Student student);

}
