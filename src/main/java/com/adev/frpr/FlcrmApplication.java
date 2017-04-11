package com.adev.frpr;

import com.adev.frpr.dao.UserDao;
import com.adev.frpr.dao.UserDaoImpl;
import com.adev.frpr.model.User;
import com.adev.frpr.service.UserService;
import com.adev.frpr.service.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class FlcrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlcrmApplication.class, args);


		UserService userService = new UserServiceImpl();
		for (User user: userService.listUsers())
		{
			System.out.println(user);
		}

	}
}