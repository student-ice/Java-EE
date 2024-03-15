package cn.edu.sxgkd.test;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import cn.edu.sxgkd.entity.Grade;
import cn.edu.sxgkd.entity.IStudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.edu.sxgkd.entity.Student;

import javax.swing.*;

public class TestMyBatis {

    public static void testAdd() throws IOException {
        String resource = "conf.xml";
        //加载MyBatis的配置文件
        Reader reader = Resources.getResourceAsReader(resource);
        //创建SqlSession的工厂
        SqlSessionFactory sessionFactory
                = new SqlSessionFactoryBuilder().build(reader);
        //创建能够执行SQL映射文件中SQL语句的SqlSession对象
        SqlSession session = sessionFactory.openSession();
        IStudentMapper studentMapper = session.getMapper(IStudentMapper.class);
        Student stu = new Student(7,"路人甲",22,"一年级");
        studentMapper.addStudent(stu);
        session.commit();
        session.close();
    }

    public static void testDeleteByNo() throws IOException {
        String resource = "conf.xml";
        //加载MyBatis的配置文件
        Reader reader = Resources.getResourceAsReader(resource);
        //创建SqlSession的工厂
        SqlSessionFactory sessionFactory
                = new SqlSessionFactoryBuilder().build(reader);
        //创建能够执行SQL映射文件中SQL语句的SqlSession对象
        SqlSession session = sessionFactory.openSession();
        IStudentMapper studentMapper = session.getMapper(IStudentMapper.class);
        studentMapper.deleteStudentByNo(7);
        session.commit();
        session.close();
    }

    public static void testUpdate() throws IOException {
        String resource = "conf.xml";
        //加载MyBatis的配置文件
        Reader reader = Resources.getResourceAsReader(resource);
        //创建SqlSession的工厂
        SqlSessionFactory sessionFactory
                = new SqlSessionFactoryBuilder().build(reader);
        //创建能够执行SQL映射文件中SQL语句的SqlSession对象
        SqlSession session = sessionFactory.openSession();
        IStudentMapper studentMapper = session.getMapper(IStudentMapper.class);
        Student stu = new Student(7,"路人乙",33,"二年级");
        studentMapper.updateStudentByNo(stu);
        session.commit();
        session.close();
    }

    public static void testQueryByNoWithMapper() throws IOException {
        String resource = "conf.xml";
        //加载MyBatis的配置文件
        Reader reader = Resources.getResourceAsReader(resource);
        //创建SqlSession的工厂
        SqlSessionFactory sessionFactory
                = new SqlSessionFactoryBuilder().build(reader);
        //创建能够执行SQL映射文件中SQL语句的SqlSession对象
        SqlSession session = sessionFactory.openSession();
        IStudentMapper studentMapper = session.getMapper(IStudentMapper.class);

        Student student = studentMapper.queryStudentByNo(32);
        System.out.println(student);
        session.close();
    }
    public static void testQueryAll() throws IOException {

        String resource = "conf.xml";
        //加载MyBatis的配置文件
        Reader reader = Resources.getResourceAsReader(resource);
        //创建SqlSession的工厂
        SqlSessionFactory sessionFactory
                = new SqlSessionFactoryBuilder().build(reader);
        //创建能够执行SQL映射文件中SQL语句的SqlSession对象
        SqlSession session = sessionFactory.openSession();
        //指定SQL语句对应的标识字符串：namespace+id
        IStudentMapper studentMapper = session.getMapper(IStudentMapper.class);
        //执行查询，返回一个学号为32的Student对象
        List<Student> students = studentMapper.getAllStudents();
        System.out.println(students);
        session.close();
    }

    public static void testQueryStudentByNoWithOGNL() throws IOException {
        String resource = "conf.xml";
        //加载MyBatis的配置文件
        Reader reader = Resources.getResourceAsReader(resource);
        //创建SqlSession的工厂
        SqlSessionFactory sessionFactory
                = new SqlSessionFactoryBuilder().build(reader);
        //创建能够执行SQL映射文件中SQL语句的SqlSession对象
        SqlSession session = sessionFactory.openSession();
        //指定SQL语句对应的标识字符串：namespace+id
        IStudentMapper studentMapper = session.getMapper(IStudentMapper.class);
        Student stu = new Student();
        stu.setGraName("就业班");
        stu.setStuAge(23);

        List<Student> students = studentMapper.testQueryStudentByNoWithOGNL(stu);
        System.out.println(students);
        session.close();
    }

    public static void queryStudentWithForeach() throws IOException {
        String resource = "conf.xml";
        //加载MyBatis的配置文件
        Reader reader = Resources.getResourceAsReader(resource);
        //创建SqlSession的工厂
        SqlSessionFactory sessionFactory
                = new SqlSessionFactoryBuilder().build(reader);
        //创建能够执行SQL映射文件中SQL语句的SqlSession对象
        SqlSession session = sessionFactory.openSession();
        //指定SQL语句对应的标识字符串：namespace+id
        IStudentMapper studentMapper = session.getMapper(IStudentMapper.class);
        List<Integer> stuNos = new ArrayList<Integer>();
        stuNos.add(31);
        stuNos.add(32);
        stuNos.add(33);

        Grade grade = new Grade();
        grade.setStuNos(stuNos);
        List<Student> students = studentMapper.queryStudentWithForeach(grade);
        System.out.println(students);
        session.close();
    }

    public static void queryStudentWithForeachAndList() throws IOException {
        String resource = "conf.xml";
        //加载MyBatis的配置文件
        Reader reader = Resources.getResourceAsReader(resource);
        //创建SqlSession的工厂
        SqlSessionFactory sessionFactory
                = new SqlSessionFactoryBuilder().build(reader);
        //创建能够执行SQL映射文件中SQL语句的SqlSession对象
        SqlSession session = sessionFactory.openSession();
        //指定SQL语句对应的标识字符串：namespace+id
        IStudentMapper studentMapper = session.getMapper(IStudentMapper.class);
        List<Integer> stuNos = new ArrayList<Integer>();
        stuNos.add(31);
        stuNos.add(32);
        stuNos.add(33);
        List<Student> students = studentMapper.queryStudentWithForeachAndList(stuNos);
        System.out.println(students);
        session.close();
    }

    public static void queryStudentWithForeachAndArray() throws IOException {
        String resource = "conf.xml";
        //加载MyBatis的配置文件
        Reader reader = Resources.getResourceAsReader(resource);
        //创建SqlSession的工厂
        SqlSessionFactory sessionFactory
                = new SqlSessionFactoryBuilder().build(reader);
        //创建能够执行SQL映射文件中SQL语句的SqlSession对象
        SqlSession session = sessionFactory.openSession();
        //指定SQL语句对应的标识字符串：namespace+id
        IStudentMapper studentMapper = session.getMapper(IStudentMapper.class);
        int[] stuNos = { 31,32,33};
        List<Student> students = studentMapper.queryStudentWithForeachAndArray(stuNos);
        System.out.println(students);
        session.close();
    }

    public static void queryStudentWithForeachAndObjectArray() throws IOException {
        String resource = "conf.xml";
        //加载MyBatis的配置文件
        Reader reader = Resources.getResourceAsReader(resource);
        //创建SqlSession的工厂
        SqlSessionFactory sessionFactory
                = new SqlSessionFactoryBuilder().build(reader);
        //创建能够执行SQL映射文件中SQL语句的SqlSession对象
        SqlSession session = sessionFactory.openSession();
        //指定SQL语句对应的标识字符串：namespace+id
        IStudentMapper studentMapper = session.getMapper(IStudentMapper.class);
        Student[] stus = new Student[3];
        stus[0] = new Student(31);
        stus[1] = new Student(32);
        stus[2] = new Student(33);
        List<Student> students = studentMapper.queryStudentWithForeachAndObjectArray(stus);
        System.out.println(students);
        session.close();
    }

    public static void main(String[] args) throws IOException {
//        testAdd();
//        testDeleteByNo();
//        testUpdate();
//        testQueryByNoWithMapper();
//        testQueryAll();
//        testQueryStudentByNoWithOGNL();
//        queryStudentWithForeach();
//        queryStudentWithForeachAndList();
//        queryStudentWithForeachAndArray();
        queryStudentWithForeachAndObjectArray();
    }

}
