package com.database.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import com.database.entity.Member;


@SpringBootApplication
public class MySqlConnectionApplication implements CommandLineRunner{
@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(MySqlConnectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql="INSERT INTO member(id,uname,password,email,phone) VALUES(?,?,?,?)";
		
		Member member=new Member(1,"kowsi", "koko@7", "kowsi@gmail.com",984738547);
        
       
            System.out.println("A new row has been inserted.");
		
				
		
	}

}

