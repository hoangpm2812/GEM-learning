package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "class")
public class Classm {
    @Id @GeneratedValue
    private int id;
    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "cateId")
    private Cate cate;

    @Column
    private int studentQuantity;

    @OneToOne
    @JoinColumn(name = "teacherId")
    private Teacher teacher;

    @Column
    private int firstYear;
    @Column
    private int lastYear;

    @OneToMany(mappedBy = "classm", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Student> students;

    public Classm() {
    }

    public Classm(String name, Cate cate, int studentQuantity, Teacher teacher, int firstYear, int lastYear) {
        this.name = name;
        this.cate = cate;
        this.studentQuantity = studentQuantity;
        this.teacher = teacher;
        this.firstYear = firstYear;
        this.lastYear = lastYear;
    }

    public Classm(String name, Cate cate, int studentQuantity, Teacher teacher, int firstYear, int lastYear, List<Student> students) {
        this.name = name;
        this.cate = cate;
        this.studentQuantity = studentQuantity;
        this.teacher = teacher;
        this.firstYear = firstYear;
        this.lastYear = lastYear;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cate getCate() {
        return cate;
    }

    public void setCate(Cate cate) {
        this.cate = cate;
    }

    public int getStudentQuantity() {
        return studentQuantity;
    }

    public void setStudentQuantity(int studentQuantity) {
        this.studentQuantity = studentQuantity;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getFirstYear() {
        return firstYear;
    }

    public void setFirstYear(int firstYear) {
        this.firstYear = firstYear;
    }

    public int getLastYear() {
        return lastYear;
    }

    public void setLastYear(int lastYear) {
        this.lastYear = lastYear;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
