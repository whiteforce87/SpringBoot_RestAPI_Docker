package edu.sabanciuniv.restAPI.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	
	@GetMapping
	public List<User> findAllUsers(){
		User u1 = new User(123,"Abc","def");
		User u2 = new User(1233,"Abzc","dezf");
		ArrayList<User> users = new ArrayList<>();
		users.add(u2);
		users.add(u1);
		return users;
	}
	
	
	
	
	
	
	
	
	
	
	
//HTTP GET => localhost:8080/users
//     GET => ../users/{id}
//     POST => ../users
//     DELETE => ../users/{id}
}
