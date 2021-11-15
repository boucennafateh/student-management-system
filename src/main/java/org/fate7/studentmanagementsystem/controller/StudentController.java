package org.fate7.studentmanagementsystem.controller;

import lombok.RequiredArgsConstructor;
import org.fate7.studentmanagementsystem.entity.Student;
import org.fate7.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("/students")
@RequiredArgsConstructor
@Controller
public class StudentController {

    private final StudentService studentService;

    @GetMapping(value = {"", "/"})
    public String getAll(Model model){
        List<Student> students = studentService.getAll();
        model.addAttribute("students", students);
        return "students";
    }

    @GetMapping("/new")
    public String createStudent(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "new-student";
    }

    @PostMapping(value = {"", "/"})
    public ModelAndView add(@ModelAttribute("student") Student student){
        studentService.save(student);
        return new ModelAndView("redirect:/students");
    }

}
