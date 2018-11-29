package com.example.demo.repos;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.User;

@Repository
public interface UserRepos extends PagingAndSortingRepository<User, Long> {
	User findById(User user);

	List<User> findAll(User user);

	void delete(User user);
	
	User save(User user);

}
