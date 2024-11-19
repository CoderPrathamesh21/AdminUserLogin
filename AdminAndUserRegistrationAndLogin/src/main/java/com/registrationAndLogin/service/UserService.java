package com.registrationAndLogin.service;

import com.registrationAndLogin.dto.UserDTO;
import com.registrationAndLogin.entity.User;

public interface UserService {
	
	User save (UserDTO userDto);

}
