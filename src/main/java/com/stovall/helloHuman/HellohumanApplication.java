package com.stovall.helloHuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HellohumanApplication {
    public static void main(String[] args) {
        SpringApplication.run(HellohumanApplication.class, args);
    }
		@RequestMapping("/")
		public String index(@RequestParam(value = "n", required =false) String searchQuery) {
			if(searchQuery == null) {
				return "Hello: Human" + " " + "Welcome to SpringBoot!";
			} else {
				return "Hello:" + " " +  searchQuery + " " + "Welcome to SpringBoot!";
			}
		}
}
