package cn.edu.sxgkd.diinstance;

public class Course {
    private String name;
    private int hours;
    private Teacher teacher;

    public Course() {
    }

    public Course(String name, int hours, Teacher teacher) {
        this.name = name;
        this.hours = hours;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", hours=" + hours +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}
