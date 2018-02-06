package com.mr.mapper;

import com.mr.entity.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer stuId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer stuId);

    Student selectByStuName(String name);
    
    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}