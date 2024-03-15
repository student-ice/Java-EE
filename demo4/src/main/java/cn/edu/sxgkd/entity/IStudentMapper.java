package cn.edu.sxgkd.entity;

import java.util.List;

public interface IStudentMapper {
    Student queryStudentByNo (int stuNo);
    List<Student> getAllStudents();
    void addStudent(Student student);
    void deleteStudentByNo(int stuNo);
    void updateStudentByNo(Student student);
    List<Student> testQueryStudentByNoWithOGNL(Student stu);
}
