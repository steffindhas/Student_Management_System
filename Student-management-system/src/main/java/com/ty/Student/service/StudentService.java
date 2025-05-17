package com.ty.Student.service;

import java.util.List;
import com.ty.Student.entity.Student;

public interface StudentService {
    
    /*
     * Retrieve all students from the database.
     * @return a list of all students
     */
    List<Student> getAllStudents();
    
    /*
     * Save a new student to the database.
     * @param student - the student to save
     * @return the saved student
     */
    Student saveStudent(Student student);
    
    /*
     * Retrieve a student by its ID.
     * @param id - the ID of the student
     * @return the student with the specified ID
     */
    Student getStudentById(Long id);
    
    /*
     * Update an existing student in the database. 
     * @param student - the student with updated information
     * @return the updated student
     */
    Student updateStudent(Student student);
    
    /*
     * Delete a student by its ID.
     * 
     * @param id - the ID of the student to delete
     */
    void deleteStudentById(Long id);
}
