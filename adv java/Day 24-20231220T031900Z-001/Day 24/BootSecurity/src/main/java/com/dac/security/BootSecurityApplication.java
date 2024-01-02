package com.dac.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.dac.security.model.User;
import com.dac.security.repository.UserRepository;

@SpringBootApplication
public class BootSecurityApplication implements CommandLineRunner{
	@Autowired
	BCryptPasswordEncoder encoder;
	
	@Autowired
	UserRepository repo;
	public static void main(String[] args) {
		SpringApplication.run(BootSecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User u1=new User("ramesh", encoder.encode("ramesh"), "ram@gamil.com", "ROLE_ADMIN");
		User u2=new User("bhavesh", encoder.encode("bhavesh"), "bhav@gamil.com", "ROLE_NORMAL");
		repo.save(u1);
		repo.save(u2);
	}

}
