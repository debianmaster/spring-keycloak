package com.example.demoauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Demoauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demoauth2Application.class, args);
	}
}



@RestController
class Demoauth2Controller {

  @RequestMapping("/products")
   public String products(){
      return "authed service";
   }
}
