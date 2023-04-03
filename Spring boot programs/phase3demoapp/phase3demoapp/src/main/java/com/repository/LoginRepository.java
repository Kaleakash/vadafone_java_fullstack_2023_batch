package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bean.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, String>{

	// JPQL (Java Persistence Query language )
	@Query("select l from Login l where l.emailid = :emailid and l.password = :password and l.typeofuser=:typeofuser")
	public Login signIn(@Param("emailid") String emailid, 
			@Param("password") String password, 
			@Param("typeofuser") String typeofuser);
	
	// Native Query 
	@Query(value="select * from login l where l.emailid = :emailid and l.password = :password and l.typeofuser=:typeofuser",nativeQuery = true)
	public Login signInWithNative(@Param("emailid") String emailid, 
			@Param("password") String password, 
			@Param("typeofuser") String typeofuser);
}
