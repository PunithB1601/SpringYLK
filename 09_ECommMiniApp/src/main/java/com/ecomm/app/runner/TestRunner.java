package com.ecomm.app.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ecomm.app.enums.RoleName;
import com.ecomm.app.request.RoleCreationRequest;
import com.ecomm.app.request.UserRegisterRequest;
import com.ecomm.app.service.UserService;

@Component
public class TestRunner implements CommandLineRunner{

	@Autowired
	private UserService uservice;


	@Override
	public void run(String... args) throws Exception {
		Scanner sc=new Scanner(System.in);

		int choice=0;
		do {
			System.out.println("WELCOME TO ECOMM-APP");
			System.out.println("1. CREATE ROLE");
			System.out.println("2. CREATE USER");
			System.out.println("3. EXIT");
			choice=sc.nextInt();
			switch(choice) {

			case 1: {
				RoleCreationRequest request=new RoleCreationRequest();
				request.setRoleName(RoleName.CUSTOMER);
				uservice.createRole(request);
				break;
			}
			case 2: {
				UserRegisterRequest request=new UserRegisterRequest();
				System.out.println("Enter the email");
				request.setEmail(sc.next());
				System.out.println("Enter the password");
				request.setPassword(sc.next());
				System.out.println("Enter the firstName");
				request.setFirstName(sc.next());
				System.out.println("Enter the lastName");
				request.setLastName(sc.next());
				System.out.println("Enter the phone");
				request.setPhone(sc.next());
				uservice.createUser(request);
				break;
			}
			case 3: {
				System.out.println("Application closed");
				break;
			}
			default: {
				System.out.println("Invalid option");
			}
			}

		}while(choice!=3);
	}

}
