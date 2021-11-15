package org.fate7.studentmanagementsystem.service.impl;

import lombok.RequiredArgsConstructor;
import org.fate7.studentmanagementsystem.entity.Student;
import org.fate7.studentmanagementsystem.repository.StudentRepository;
import org.fate7.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentServerImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public List<Student> getAll() {
        List<Student> students = studentRepository.findAll();
        return students;
    }

    @Override
    public Student save(Student student) {
        Student s = studentRepository.save(student);
        return s;
    }
}
