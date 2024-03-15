package cn.edu.sxgkd.entity;

public class Student {
    //学号
    private int stuNo;
    //姓名
    private String stuName;
    //年龄
    private int stuAge;
    //年级
    private String graName;

    public Student() {

    }

    public Student(int stuNo, String stuName, int stuAge, String graName) {
        super();
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.graName = graName;
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getGraName() {
        return graName;
    }

    public void setGraName(String graName) {
        this.graName = graName;
    }

    @Override
    public String toString() {
        return "学号:"+this.stuNo+"\t姓名:"+this.stuName
                +"\t年龄:"+this.stuAge+"\t年级:"+this.graName + "\n";
    }

    public Student(int stuNo) {
        this.stuNo = stuNo;
    }
}
