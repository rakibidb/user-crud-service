package com.mshr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mshr.model.User;

@RepositoryRestResource
@CrossOrigin("*")
public interface UserRepo extends JpaRepository<User, Integer> {

	User findByName(@Param("name") String name);

	User findByAge(@Param("age") String age);

	User findByPass(@Param("pass") String pass);


}
