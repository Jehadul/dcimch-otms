package com.nazdaq.otms.service;

import java.util.List;

import com.nazdaq.otms.model.User;




/**
 * @author abu.taleb
 *
 */
public interface UserService {
	
	public void addUser(User user);

	public List<User> listUser();
	
	public User getUser(int id);
	
	public void deleteUser(User user);
	
	public User getUser(String username);
	
	public String getUserNameById(int uId);
	
	public boolean isExistsUser(String username);
	
	public User getUserByEmpId(Short empId);
}
