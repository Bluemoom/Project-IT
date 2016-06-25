package dao;

import model.ThuNgan;

public interface ThuNganDAO {
	
	ThuNgan checkLogin(String userName, String passWord);	
}
