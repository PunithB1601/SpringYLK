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
import com.ecomm.app.request.LoginRequest;
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
		
		//First validate user with his email ID
		User existing=urepo.findByEmail(request.getEmail()).orElse(null);
		
		//Validate RoleName (CUSTOMER).
		Role existingRole=rrepo.findByRoleName(RoleName.CUSTOMER).orElse(null);
		
		//Create two variable, one is user and profile.
		User user=null;
		Profile profile=null;
		
		//store email & pwd in user
		if(existing==null) {
			user=new User();
			user.setEmail(request.getEmail());
			user.setPassword(request.getPassword());
		
		//store the fetched role inside user obj.
			user.setRole(existingRole);
			
		//store fname, lname and password in profile
			profile=new Profile();
			profile.setFirstName(request.getFirstName());
			profile.setLastName(request.getLastName());
			profile.setPhone(request.getPhone());
			
		//Save user first
			user=urepo.save(user);
			
		//while storing profile, add user obj to profile
			profile.setUser(user);
		//save profile.
			profile=prepo.save(profile);
		//return the user.
		
		
		}

		return user;
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

	@Override
	public User login(LoginRequest request) {
		
		//First, validate the user by using email.
		
		//Verify his password (req.getPass()=exis.getPass())
		
		//if role of user is admin, call Admin.admin()
		
		//if role is user, call User.user()
		
		//return user ob
		
		return null;
	}

}
