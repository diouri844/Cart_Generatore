package com.example.ServerSide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServerSideApplication {

	public static void main(String[] args) {

		SpringApplication.run(ServerSideApplication.class, args);
	}
	@GetMapping("/simple-request")
	public String simpleRequest() {
		// In this case, we return the plain text response "ok"
		return "ok";
		}


}
