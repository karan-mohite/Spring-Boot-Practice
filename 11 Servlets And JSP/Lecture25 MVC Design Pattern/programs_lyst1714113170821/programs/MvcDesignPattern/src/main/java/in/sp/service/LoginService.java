package in.sp.service;

import in.sp.dao.LoginDao;
import in.sp.model.User;

public class LoginService 
{
	public User loginService(String email, String pass)
	{
		LoginDao logDao = new LoginDao();
		User user = logDao.loginDao(email, pass);
		
		return user;
	}
}
