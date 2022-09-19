package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.Response;
import com.example.demo.model.User;


@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;

	public Response saveUSer(User user)
	{
		repository.save(user);
		return new Response("saved user with id" + user.getId(), Boolean.TRUE);
	}
	
	public Response getAllUsers()
	{
		List<User> users = repository.findAll();
		return new Response("number of User:"+ users.size(), Boolean.TRUE);
	}
}