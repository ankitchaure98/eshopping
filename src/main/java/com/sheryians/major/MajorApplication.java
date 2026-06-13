package com.sheryians.major;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class MajorApplication {
	
//	Dotenv dotenv = Dotenv.load();
//
//    // Set environment variables manually
//    System.setProperty("GOOGLE_CLIENT_ID", dotenv.get("GOOGLE_CLIENT_ID"));
//    System.setProperty("GOOGLE_CLIENT_SECRET", dotenv.get("GOOGLE_CLIENT_SECRET"));

	public static void main(String[] args) {
		
		//Dotenv dotenv = Dotenv.load();
		Dotenv dotenv = Dotenv.configure()
        .ignoreIfMissing()
        .load();

	    // Set environment variables manually
	    System.setProperty("GOOGLE_CLIENT_ID", dotenv.get("GOOGLE_CLIENT_ID"));
	    System.setProperty("GOOGLE_CLIENT_SECRET", dotenv.get("GOOGLE_CLIENT_SECRET"));
		
		SpringApplication.run(MajorApplication.class, args);
	}

}

/* insert into roles(id, name) values (1,'ROLE_ADMIN'),(2,'ROLE_USER');
 * 
 * insert into user_role(user_id, role_id) values (1,1),(1,2);
 * 
 * insert into user (id,email,password,firstName,lastName) values (1,'admin@gmail.com','12345','Admin','khan')
 * 
 * admin is admin email
 * password is = 123456
 * 
 * user is pranay email
 * password is = 123456
 * 
 * 
 * */
