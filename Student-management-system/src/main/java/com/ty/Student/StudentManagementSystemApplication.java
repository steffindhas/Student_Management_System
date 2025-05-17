package com.ty.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.ty.Student.entity.Student;
import com.ty.Student.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;
    
    @Override
    public void run(String... args) throws Exception {
       /* Student student1 = new Student("Ramesh", "Fadatare", "ramesh@gmail.com");
        studentRepository.save(student1);
        
        Student student2 = new Student("Sanjay", "Jadhav", "sanjay@gmail.com");
        studentRepository.save(student2);
        
        Student student3 = new Student("Tony", "Stark", "tony@gmail.com");
        studentRepository.save(student3);*/
    }
}
