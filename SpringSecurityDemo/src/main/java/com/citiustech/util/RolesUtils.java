package com.citiustech.util;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.citiustech.repo.UserRepository;
/*
import com.citiustech.model.ERole;
import com.citiustech.model.Role;
import com.citiustech.repo.RoleRepository;
import com.citiustech.repo.UserRepository;
*/
@Component
public class RolesUtils {
	
	@Autowired
	private UserRepository repository;
	
	/*public void mapRoles(String usrRoles, Set<Role> dbRoles) {
		if(usrRoles == null || usrRoles.isEmpty()) {
			Role userRole = repository.findByRole(usrRoles).orElseThrow(()->new RuntimeException("Error : Role is not found"));
			dbRoles.add(userRole);		
			}else {
				
					switch(usrRoles) {
					case "admin":
						Role adminRole = repository.findByName(ERole.ROLE_ADMIN).orElseThrow(()->new RuntimeException("Error: Role is not found"));
						dbRoles.add(adminRole);
						break;
						
						default:
							Role userRole = repository.findByName(ERole.ROLE_USER).orElseThrow(()->new RuntimeException("Error: Role is not found"));
							dbRoles.add(userRole);
							break;
						}
				
				
			}
	}*/
}
