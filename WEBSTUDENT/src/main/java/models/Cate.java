package models;


import javax.persistence.*;
import java.util.List;

@Entity
public class Cate {
    @Id
    private int id;
    @Column
    private String name;
    @Column
    private int classQuantity;

    @OneToMany(mappedBy = "cate", cascade = CascadeType.ALL)
    private List<Classm> classms;

    public Cate() {
    }

    public Cate(int id, String name, int classQuantity) {
        this.id = id;
        this.name = name;
        this.classQuantity = classQuantity;
    }

    public Cate(int id, String name, int classQuantity, List<Classm> classms) {
        this.id = id;
        this.name = name;
        this.classQuantity = classQuantity;
        this.classms = classms;
    }

    public List<Classm> getClassms() {
        return classms;
    }

    public void setClassms(List<Classm> classms) {
        this.classms = classms;
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

    public int getClassQuantity() {
        return classQuantity;
    }

    public void setClassQuantity(int classQuantity) {
        this.classQuantity = classQuantity;
    }
}
