package cn.edu.sxgkd.service;

import cn.edu.sxgkd.entity.Student;
import cn.edu.sxgkd.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW,
            isolation= Isolation.READ_COMMITTED,
            rollbackFor= Exception.class)
    public boolean addStudent(Student student) {
        int count =studentMapper.insert(student);

        return (count ==1);
    }
    @Override
    public boolean deleteStudentByPrimaryKey(int stuNO) {
        int count =studentMapper.deleteByPrimaryKey(stuNO);
        return (count == 1 ? true : false);
    }
        @Override
    public boolean deleteStudentByNo(int stuNO) {
        int count = studentMapper.deleteByPrimaryKey(stuNO);
        return (count == 1 ? true : false);
    }

    public void setStudentMapper(StudentMapper stuDao) {
        this.studentMapper = stuDao;
    }
}
