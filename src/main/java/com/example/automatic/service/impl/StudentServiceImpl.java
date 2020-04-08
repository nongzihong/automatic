package com.example.automatic.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import com.example.automatic.entity.Student;
import com.example.automatic.mapper.StudentMapper;
import com.example.automatic.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ZH
 * @since 2020-04-08
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

    @Autowired
    private StudentMapper mapper;


    /*
    查询数量的方法
     */
    @Override
    public int count() {
        return mapper.count();
    }

    /*
    添加数据
     */
    @Override
    public int insert(Student student) {
        return mapper.insert(student);
    }

    /*
    删除数据
     */
    @Override
    public int del(int id) {
        return mapper.deleteById(id);
    }


    /*
    修改数据
     */
    @Override
    public int update(Student student) {
        /*
        条件构造器queryWrapper
        不懂可以参考官网文档 http://mp.baomidou.com/guide/wrapper.html#abstractwrapper
         */

        QueryWrapper<Student> queryWrapper = new QueryWrapper<Student>();
        queryWrapper.eq("id","1");//不写条件 修改所有数据
        return mapper.update(student, queryWrapper);
    }


}
