package cn.edu.sxgkd.entity;

import java.util.List;

public interface IStudentMapper {
    Student queryStudentByNo (int stuNo);
    List<Student> getAllStudents();
    void addStudent(Student student);
    void deleteStudentByNo(int stuNo);
    void updateStudentByNo(Student student);
    List<Student> testQueryStudentByNoWithOGNL(Student stu);

    List<Student> queryStudentWithForeach(Grade grade);

    List<Student> queryStudentWithForeachAndList(List<Integer> stuNos);

    List<Student> queryStudentWithForeachAndArray(int[] stuNos);

    List<Student> queryStudentWithForeachAndObjectArray(Object[] stus);
}
