package com.example.demo.service;

import com.example.demo.dao.StudentMapper;
import com.example.demo.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    @Override
    public int deleteStudent(int id) {
        return studentMapper.deleteStudent(id);
    }

    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    @Override
    public Student selectStudentById(int id) {
        return studentMapper.selectStudentById(id);
    }

    @Override
    public List<Student> selectAllStudent() {
        return studentMapper.selectAllStudent();
    }

    @Override
    public List<Student> selectStudentByName(String name) {
        return studentMapper.selectStudentByName(name);
    }

    @Override
    public int deleteIdInChoose(List<Integer> ids) {
        return studentMapper.deleteIdInChoose(ids);
    }

}
