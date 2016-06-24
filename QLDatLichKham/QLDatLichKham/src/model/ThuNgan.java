package model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "THUNGAN")
public class ThuNgan {

	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USERNAME")
	private String userName;
	@Column(name = "PASSWORD")
	private String passWord;
	@Id
	@Column(name = "ID")
	private int ID;
	
	public ThuNgan() {
	}
	
	public ThuNgan(int iD, String userName, String passWord) {
		super();
		ID = iD;
		this.userName = userName;
		this.passWord = passWord;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
