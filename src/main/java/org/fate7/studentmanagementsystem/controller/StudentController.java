package org.fate7.studentmanagementsystem.controller;

import lombok.RequiredArgsConstructor;
import org.fate7.studentmanagementsystem.entity.Student;
import org.fate7.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
