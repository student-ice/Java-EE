package cn.edu.sxgkd.entity;

import java.util.List;

public interface IStudentMapper {
    public abstract Student queryStudentByNo (int stuNo);
    public abstract List<Student> getAllStudents();
    public abstract void addStudent(Student student);
    public abstract void deleteStudentByNo(int stuNo);
    public abstract void updateStudentByNo(Student student);
}
