package models;

import javax.persistence.*;

@Entity
@Table(name = "group")
public class Group {
    @Id @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private int num;

    public Group() {
    }

    public Group(String name, int num) {
        this.name = name;
        this.num = num;
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
