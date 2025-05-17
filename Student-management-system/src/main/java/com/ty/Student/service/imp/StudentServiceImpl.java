package com.ty.Student.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ty.Student.entity.Student;
import com.ty.Student.repository.StudentRepository;
import com.ty.Student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()) {
            return student.get();
        } else {
            throw new RuntimeException("Student not found with id: " + id); // Handle not found case appropriately
        }
    }

    @Override
    public Student updateStudent(Student student) {
        if (student.getId() != null && studentRepository.existsById(student.getId())) {
            return studentRepository.save(student);
        } else {
            throw new RuntimeException("Student not found with id: " + student.getId()); // Handle not found case appropriately
        }
    }

    @Override
    public void deleteStudentById(Long id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
        } else {
            throw new RuntimeException("Student not found with id: " + id); // Handle not found case appropriately
        }
    }
}
