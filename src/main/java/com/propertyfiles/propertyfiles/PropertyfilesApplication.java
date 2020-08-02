package com.propertyfiles.propertyfiles;

import com.propertyfiles.propertyfiles.properties.ComplexProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class PropertyfilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertyfilesApplication.class, args);
	}

}
