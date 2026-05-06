package htw.webtech.pickmymovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ProjektnameApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjektnameApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate() {

		return new RestTemplate();
	}

}
