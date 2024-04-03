package cn.edu.sxgdk.service;

import cn.edu.sxgdk.entity.Student;

public interface IStudentService {
    //增加学生
    boolean addStudent(Student student);
    boolean deleteStudentByPrimaryKey(int stuNo);
    //删除学生
    boolean deleteStudentByNo(int stuNO);
}
