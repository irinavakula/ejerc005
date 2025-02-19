package es.santander.ascender.ejerc005;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Ejerc005Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejerc005Application.class, args);
	}

}
