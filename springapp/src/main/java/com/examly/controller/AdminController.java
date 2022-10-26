package com.examly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.dao.IUser;
import com.examly.model.User;

@RestController
public class AdminController {
	@Autowired
	IUser user;
	
	@GetMapping("/")
	public String welcome() {
		return "welcome spring boot application";
	}
	
	@GetMapping("findall")
	public List<User> findAll() {
		return user.findAll();
	}
}