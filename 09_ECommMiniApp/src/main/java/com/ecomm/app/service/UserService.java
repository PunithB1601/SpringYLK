package com.ecomm.app.service;

import com.ecomm.app.entity.Role;
import com.ecomm.app.entity.User;
import com.ecomm.app.request.RoleCreationRequest;
import com.ecomm.app.request.UserRegisterRequest;

public interface UserService {

	public User createUser(UserRegisterRequest request);
	
	public Role createRole(RoleCreationRequest request);
	
	
	
}
