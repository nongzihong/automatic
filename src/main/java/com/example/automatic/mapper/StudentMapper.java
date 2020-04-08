package com.example.automatic.mapper;

import com.example.automatic.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author ZH
 * @since 2020-04-08
 */
public interface StudentMapper extends BaseMapper<Student> {

    List<Student> selectByMap();

    int count();

}
