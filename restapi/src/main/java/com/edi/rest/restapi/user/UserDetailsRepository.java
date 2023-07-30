package com.edi.rest.restapi.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {
	
	public List<UserDetails> findByRole(String role);

}
