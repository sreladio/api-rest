package com.eladio.pedidos.app;

import com.eladio.pedidos.config.SwaggerConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({"com.eladio.pedidos.model"})
@EnableJpaRepositories({"com.eladio.pedidos.repository"})
@ComponentScan({"com.eladio.pedidos.service", "com.eladio.pedidos.rest"})
@Import(SwaggerConfig.class)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
