package com.apartmentFinder.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.apartmentFinder.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query("SELECT u FROM User u WHERE u.username = :username")
	public User getUserByUsername(@Param("username") String username);

	@Query("SELECT u FROM User u WHERE u.userid = :userid")
	public User getOne(@Param("userid") int userid);

	@Transactional
	@Modifying
	@Query("UPDATE User u SET u.password = :password, u.contactno=:contactno, u.emailaddress=:emailaddress WHERE u.userid = :userid")
	public void update(@Param("userid") int userid, @Param("password") String password,
			@Param("contactno") String contactno, @Param("emailaddress") String emailaddress);
}
