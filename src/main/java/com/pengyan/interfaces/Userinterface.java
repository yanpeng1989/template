package com.pengyan.interfaces;

import com.pengyan.model.User;
import java.util.List;

public interface Userinterface {
	public User queryById(int id);

	public void save(User u);

	public void update(User u);

	public void delete(Integer id);

	public List<User> queryAll();
}
