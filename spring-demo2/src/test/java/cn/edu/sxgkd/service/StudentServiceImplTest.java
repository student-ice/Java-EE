package cn.edu.sxgkd.service;

import cn.edu.sxgkd.entity.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentServiceImplTest {

    @Test
    public void testAddStudent() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IStudentService studentService = applicationContext.getBean("studentService",IStudentService.class);
        studentService.addStudent(new Student());
        applicationContext.close();
    }
  
}