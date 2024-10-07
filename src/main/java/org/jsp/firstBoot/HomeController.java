package org.jsp.firstBoot;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/hi")
	
	public String hi() {
		System.out.println("Hii From HomeController");
		return "Hii From HomeController";
	}

	@RequestMapping("/hello")
	public String hello() {

		return "Hello From HomeController";
	}

	@RequestMapping("/save")
	public User save(@RequestBody User user) {

		return user;

	}

	@RequestMapping("/login")
	public String login(@RequestParam String user,
			@RequestParam String password) {
		
		System.out.println(user);
		System.out.println(password);
		
		return "login Sucessfull";
	}

	@RequestMapping("/findall")
	public String findAllUsers() {

		return "All Users Found SucessFully";
	}
	
	@RequestMapping("/find")
	
	public Person findPerson(@RequestBody Person p) {
		
		return p;
		
	}
}
