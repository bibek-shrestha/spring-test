package com.darkhorse.parkmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.darkhorse.parkmanager.config.RsaKeyProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class ParkManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkManagerApplication.class, args);
	}

}
