package com.ecomm.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomm.app.entity.Profile;
import com.ecomm.app.entity.Role;
import com.ecomm.app.entity.User;
import com.ecomm.app.enums.RoleName;
import com.ecomm.app.repository.ProfileRepository;
import com.ecomm.app.repository.RoleRepository;
import com.ecomm.app.repository.UserRepository;
import com.ecomm.app.request.RoleCreationRequest;
import com.ecomm.app.request.UserRegisterRequest;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository urepo;
	
	@Autowired
	private RoleRepository rrepo;
	
	@Autowired
	private ProfileRepository prepo;
	
	@Override
	public User createUser(UserRegisterRequest request) {
		
		

		return null;
	}

	@Override
	public Role createRole(RoleCreationRequest request) {
		
		//Validate whether role with the same name is available or not available
		Role existingRole=rrepo.findByRoleName(request.getRoleName()).orElse(null);
		
		//creating empty role(entity) obj
		Role role=null;
		
		//If no existing role available with same name,
		if(existingRole==null) {
			role=new Role();
			//setting roleName for entity obj
			role.setRoleName(request.getRoleName());
			//saving it to DB
			role=rrepo.save(role);
		}
		
		return role;
	}

}
