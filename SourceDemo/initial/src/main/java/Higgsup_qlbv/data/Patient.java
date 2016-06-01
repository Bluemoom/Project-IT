package Higgsup_qlbv.data;

import javax.persistence.*;

@Entity
@Table(name="patient")
public class Patient {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private  String name;

    public Patient(){}

    public Patient(String name){
        this.name = name;
    }
    public long getId() {
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

}
