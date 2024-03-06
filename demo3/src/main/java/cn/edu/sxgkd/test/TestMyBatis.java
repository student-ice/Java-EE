package cn.edu.sxgkd.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import cn.edu.sxgkd.entity.IStudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.edu.sxgkd.entity.Student;

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

    public static void main(String[] args) throws IOException {
        testAdd();
        testDeleteByNo();
        testUpdate();
        testQueryByNoWithMapper();
        testQueryAll();
    }

}
