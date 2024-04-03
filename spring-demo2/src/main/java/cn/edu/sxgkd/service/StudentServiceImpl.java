package cn.edu.sxgkd.service;

import cn.edu.sxgkd.dao.IStudentDao;
import cn.edu.sxgkd.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private IStudentDao studentDao;
    @Override
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }
}
