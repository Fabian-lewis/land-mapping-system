package com.landmapping.land_mapping_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LandMappingSystemApplication {

	public static void main(String[] args) {
		//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class});

		SpringApplication.run(LandMappingSystemApplication.class, args);
	}

}
