package com.example.demo.service;

import com.example.demo.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);
    int deleteStudent(int id);
    int updateStudent(Student student);
    Student selectStudentById(int id);
    List<Student> selectAllStudent();
    List<Student> selectStudentByName(String name);
    int deleteIdInChoose(List<Integer> ids);
}
