package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.User;

public interface UserDao {

	public User saveUser(User user);

	public User validateUser(String email, String password);

	public User updateUserById(int id, User user);

	public boolean deleteUserById(int id);

	public List<User> getAllUsers();

	public User getUserByName(String name);

	public User getUserByRole(String role);

}
