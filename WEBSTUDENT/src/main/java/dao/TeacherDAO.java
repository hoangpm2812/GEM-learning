package dao;

import models.Teacher;

import java.util.List;

public interface TeacherDAO {
    List<Teacher> getAllTeachers();
    Teacher getTeacherById(int id);
    void addTeacher(Teacher teacher);
    void updateTeacher(Teacher teacher);
    void deleteTeacher(int id);
}
