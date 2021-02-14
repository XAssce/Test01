package com.example.demo.controller;

import com.example.demo.pojo.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private StudentService studentService;

    //显示所有学生
    @RequestMapping("/index")
    public String hello(Model model){
        List<Student> list = studentService.selectAllStudent();
        model.addAttribute("list",list);
        return "index";
    }

    //跳转到一个新增学生界面
    @RequestMapping("/toAddStudent")
    public String toAddStudentPage(){
        return "addStudent";
    }

    //新增一个学生
    @RequestMapping("/addStudent")
    public String addStudent(Student student){
        studentService.addStudent(student);
        return "redirect:/index";
    }

    //删除一个学生数据
    @RequestMapping("/deleteStudent/{ID}")
    public String deleteStudent(@PathVariable("ID") int id){
        studentService.deleteStudent(id);
        return "redirect:/index";
    }

    //跳转到修改学生信息界面
    @RequestMapping("/toUpdateStudent/{ID}")
    public String toUpdateStudentPage(@PathVariable("ID") int id,Model model){
        Student student = studentService.selectStudentById(id);
        model.addAttribute("NewStudent",student);
        return "updateStudent";
    }

    @RequestMapping("/updateStudent")
    public String updateStudent(Student student){
        studentService.updateStudent(student);
        return "redirect:/index";
    }

    //根据名字查询
    @RequestMapping("/selectStudentByName")
    public String selectStudentByName(String name,Model model){
        List<Student> students = studentService.selectStudentByName(name);
        List<Student> list = new ArrayList<>();
        for (Student student : students) {
            list.add(student);
        }
        if (students == null){
            list = studentService.selectAllStudent();
            model.addAttribute("error","未查到");
        }
        model.addAttribute("list",list);
        return "index";
    }


    //批量删除
    @RequestMapping("/deleteChoosedId")
    public String deleteChoosedId(List<Integer> ids){
        studentService.deleteIdInChoose(ids);
        return "redirect:/index";
    }
}
