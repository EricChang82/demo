package com.demo.rest;

import com.demo.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public List<Student> queryStudents(Student student) {
        return studentDao.queryStudents(student);
    }

    public void insertStudent(Student student) {
        studentDao.insertStudent(student);
    }

    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    public List<Student> delelteStudent(Student student) {
        return studentDao.delelteStudent(student);
    }

}
