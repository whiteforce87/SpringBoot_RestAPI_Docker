package edu.sabanciuniv.restAPI.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDao {

	private List<User> users = new ArrayList<>();

	public UserDao() {
		User user1 = new User(1L,"Ahmet","1234");
		User user2 = new User(2L,"Batuhan","1234");
		users.add(user1);
		users.add(user2);
		System.out.println("Userdao calisti!");
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User findUserById(long id) {
		for (User user : users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}
	
	
}
