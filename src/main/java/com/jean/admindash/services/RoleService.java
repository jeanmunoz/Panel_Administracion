package com.jean.admindash.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jean.admindash.models.Role;
import com.jean.admindash.repositories.RoleRepository;

@Service
public class RoleService {
	private RoleRepository roleRepository;
	
	public RoleService(RoleRepository roleRepository)     {
        this.roleRepository = roleRepository;
    }
    public Role findByName(String name) {
        return roleRepository.findByName(name);
    }
}
