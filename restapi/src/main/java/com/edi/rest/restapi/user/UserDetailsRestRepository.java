package com.edi.rest.restapi.user;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserDetailsRestRepository extends PagingAndSortingRepository<UserDetails, Long> {

	public List<UserDetails> findByRole(String role);

}
