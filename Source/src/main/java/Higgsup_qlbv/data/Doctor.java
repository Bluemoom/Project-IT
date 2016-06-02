package Higgsup_qlbv.data;

import javax.persistence.*;

@Entity
@Table(name="doctor")
public class Doctor {
    @Id
    private long id;
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    @Column(name="status")
    private int status;

    public Doctor() {
    }

    public Doctor(String username, String password, int status) {
        this.username = username;
        this.password = password;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
