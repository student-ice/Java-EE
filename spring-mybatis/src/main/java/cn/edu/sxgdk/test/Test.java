package cn.edu.sxgdk.test;

import cn.edu.sxgdk.entity.Student;
import cn.edu.sxgdk.ooptest.dao.StudentMapper;
import cn.edu.sxgdk.service.IStudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        IStudentService studentService = context.getBean("studentService", IStudentService.class);
//        Student student = new Student();
//        student.setStuAge(20);
//        student.setStuName("小明");
//        studentService.addStudent(student);
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IStudentService studentService = context.getBean("studentService", IStudentService.class);
        Student student = new Student();
        student.setStuNo(3);
        student.setStuName("小红");
        student.setStuAge(20);
        student.setGraName("就业班");
        studentService.addStudent(student);
    }
}
