package onkyarity.app.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppBackendMain {

	public static void main(String[] args) {
		SpringApplication.run(AppBackendMain.class, args);
	}

	@RequestMapping("/")
	public String welcome() {
		return "Welcome";
	}
}
