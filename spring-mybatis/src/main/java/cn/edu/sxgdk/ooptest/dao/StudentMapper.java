package cn.edu.sxgdk.ooptest.dao;

import cn.edu.sxgdk.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
    Student selectByPrimaryKey(int stuNo);
    int insert(Student student);
    int deleteByPrimaryKey(int stuNo);
}
