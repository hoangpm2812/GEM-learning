package models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Student {
    @Id @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private String gender;
    @Column
    private Date birth;
    @Column
    private String address;
    @Column
    private int phone;
    @Column
    private String image;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classId")
    private Classm classm;

    public Student() {
    }

    public Student(String name, String gender, Date birth, String address, int phone, String image, Classm classm) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.address = address;
        this.phone = phone;
        this.image = image;
        this.classm = classm;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Classm getClassm() {
        return classm;
    }

    public void setClassm(Classm classm) {
        this.classm = classm;
    }
}
