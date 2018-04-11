package services;

import models.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(int id);
    boolean addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(int id);
}
