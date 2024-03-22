package cn.edu.sxgkd.entity;

import java.util.List;

public class StudentClass {
    private int classId;
    private String className;
    private List<Student> students;

    public StudentClass(int classId, String className) {
        this.classId = classId;
        this.className = className;
    }

    public StudentClass() {
    }

    public int getClassId() {
        return classId;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void printStudents() {
        System.out.println("班级ID: " + this.getClassId() +"\t班级: " + this.getClassName());
        for(int i =0 ;i <this.students.size();i++){
            System.out.println(students.get(i));
        }
    }
}
