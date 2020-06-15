package br.com.zup.dtp.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CheckstyleDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckstyleDemoApplication.class, args);
	}

}
