package cn.edu.sxgkd.dao;

import cn.edu.sxgkd.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface IStudentMapper {
    Student selectByPrimaryKey(int stuNo);
    int addStudent(Student student);
    int deleteByPrimaryKey(int stuNo);
}
