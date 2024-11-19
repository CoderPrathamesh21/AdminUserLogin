package com.registrationAndLogin.service;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.registrationAndLogin.entity.User;

public class CustomUserDetails implements UserDetails {

	private User user;
	
	public CustomUserDetails(User user) {
		super();
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return List.of( () -> user.getRole());
	}

	public String getFullName() {
		return user.getFullName();
	}
	
	@Override
	public String getPassword() {
		
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		
		return user.getEmail();
	}
	
	@Override
	public boolean isAccountNonLocked() {
		
		return true;
	}
	
	@Override
	public boolean isAccountNonExpired() {
		
		return true;
	}
	
	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}
	
	@Override
	public boolean isEnabled() {
		
		return true;
	}
	
	

}
