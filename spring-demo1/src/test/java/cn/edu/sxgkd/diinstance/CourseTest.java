package cn.edu.sxgkd.diinstance;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CourseTest {

    @Test
    public void testSetter() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Course course = applicationContext.getBean("course-set",Course.class);
        System.out.println(course);
    }

    @Test
    public void testConstructorValue() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Course course = applicationContext.getBean("course-constructor-value",Course.class);
        System.out.println(course);
    }

    @Test
    public void testConstructorIndex() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Course course = applicationContext.getBean("course-constructor-index",Course.class);
        System.out.println(course);
    }

    @Test
    public void testConstructorName() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Course course = applicationContext.getBean("course-constructor-name",Course.class);
        System.out.println(course);
    }

    public static void main(String[] args) {

    }

}