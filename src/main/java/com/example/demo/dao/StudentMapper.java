package com.example.demo.dao;

import com.example.demo.pojo.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {
    int addStudent(Student student);

    int deleteStudent(@Param("ID") int id);

    int updateStudent(Student student);

    Student selectStudentById(@Param("ID") int id);

    List<Student> selectAllStudent();

    List<Student> selectStudentByName(String name);

    //批量删除
    int deleteIdInChoose(List<Integer> ids);
}
