package com.springjpademo.jpapractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springjpademo.jpapractice.Repo.UserRepository;
import com.springjpademo.jpapractice.User.User;

@SpringBootApplication
public class JpapracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JpapracticeApplication.class, args);

		UserRepository repo = context.getBean(UserRepository.class);

		User user1 = new User();
		user1.setName("Ammu");
		user1.setStatus("Done");

		User user2 = repo.save(user1);
		System.out.println(user2);

	}

}
