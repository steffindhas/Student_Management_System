package com.ty.Student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ty.Student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
   
}
