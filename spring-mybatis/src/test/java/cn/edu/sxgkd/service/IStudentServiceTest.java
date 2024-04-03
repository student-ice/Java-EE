package cn.edu.sxgkd.service;

import cn.edu.sxgkd.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IStudentServiceTest {

    @Test
    public void addStudent() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IStudentService studentService = context.getBean("studentServiceImpl", IStudentService.class);
        Student student = new Student();
        student.setStuNo(39);
        student.setStuName("小红");
        student.setStuAge(20);
        student.setGraName("就业班");
        studentService.addStudent(student);
    }

}