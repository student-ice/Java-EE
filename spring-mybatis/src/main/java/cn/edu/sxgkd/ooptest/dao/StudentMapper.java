package cn.edu.sxgkd.ooptest.dao;

import cn.edu.sxgkd.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudentMapper {
    Student selectByPrimaryKey(int stuNo);
    int insert(Student student);
    int deleteByPrimaryKey(int stuNo);
}
