package cn.edu.sxgkd.dao;

import cn.edu.sxgkd.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements IStudentDao{
    @Override
    public void addStudent(Student student) {
        System.out.println("模拟增加学生操作...");
    }
}
