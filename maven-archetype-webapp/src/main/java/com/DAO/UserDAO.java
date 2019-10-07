package com.DAO;

import com.model.Login;
import com.model.User;

public interface UserDAO {

	  void registerUser(User user);
	  User validateUser(Login login);
}
