package Higgsup_qlbv.data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="Patient")
public class Patient {
    @Id
    private long id;
    @Column(name="fullname")
    private String fullName;
    @Column(name="username")
    private String userName;
    @Column(name="password")
    private String password;
    @Column(name="address")
    private String address;
    @Column(name="phonenumber")
    private String phoneNumber;
    @Column(name="email")
    private String email;
    @Column(name="sex")
    private int sex;
    @Column(name="status")
    private int status;
    @Column(name="Type")
    private int userType;

    public Patient() {
    }

    public Patient(String fullName, String userName, String password, String address, String phoneNumber, String email, int sex, int status, int userType) {
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.sex = sex;
        this.status = status;
        this.userType = userType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }
}
