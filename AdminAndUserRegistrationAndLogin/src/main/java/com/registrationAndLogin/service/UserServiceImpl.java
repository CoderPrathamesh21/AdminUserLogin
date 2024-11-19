package com.registrationAndLogin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.registrationAndLogin.dto.UserDTO;
import com.registrationAndLogin.entity.User;
import com.registrationAndLogin.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User save(UserDTO userDto) {
		
		User user = new User(userDto.getEmail(), passwordEncoder.encode(userDto.getPassword()), userDto.getRole(), userDto.getFullName());
		return userRepository.save(user);
		
	}

}
