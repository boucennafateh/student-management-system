package org.fate7.studentmanagementsystem;

import org.fate7.studentmanagementsystem.entity.Student;
import org.fate7.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class StudentManagementSystemApplication {


    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(StudentRepository studentRepository){
        return args -> {
            System.out.println("loading table ...");
            Student student = new Student("Fateh", "Boucenna", "fboucenna@gmail.com");
            studentRepository.save(student);
        };

    }

}
