package ca.mcgill.ecse321.tutoringservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TutoringServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(TutoringServiceApplication.class, args);
	}

}
