package com.henriqueholz.demo.service;

import com.henriqueholz.demo.dao.StudentDao;
import com.henriqueholz.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

// Class responsible to perform some business logic about our application
@Service // To springboot initialize for us
public class StudentService {

    // reference to fakeDao
    private final StudentDao studentDao;

    @Autowired // Inject or Autowire the fakeStudentdDaoImpl interface into this studentDao
    public StudentService(@Qualifier("fakeDao") StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public int insertNewStudent(UUID studentId, Student student) {
        UUID studentUid = studentId == null ?  UUID.randomUUID() : studentId;
        return studentDao.insertNewStudent(studentUid, student);
    }

    public Student getStudentById(UUID studentId) {
        return studentDao.selectStudentById(studentId);
    }

    public List<Student> getAllStudents() {
        return studentDao.selectAllStudents();
    }

    public int updateStudentById(UUID studentId, Student studentUpdate) {
        return studentDao.updateStudentById(studentId, studentUpdate);
    }

    public int deleteStudentById(UUID studentId) {
        return studentDao.deleteStudentById(studentId);
    }

    public int persistNewStudent(UUID studentId, Student student) {
        UUID studentUid = studentId == null ? UUID.randomUUID() : studentId;
        student.setID(studentUid);
        return studentDao.insertNewStudent(studentId, student);
    }
}
