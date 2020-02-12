package com.example;

import java.util.ArrayList;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.example.Entity.Student;

@SpringBootApplication
public class SpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAppApplication.class, args);
		
		System.out.println("ffff");
		
		
		
		 final String uri = "http://localhost:8080/deleteStudent/1";
	     
		 RestTemplate restTemplate=new RestTemplate();
		 String result=restTemplate.getForObject(uri,String.class);
		System.out.println(result);
	}

}
