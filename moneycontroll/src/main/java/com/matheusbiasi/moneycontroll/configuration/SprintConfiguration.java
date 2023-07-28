package com.matheusbiasi.moneycontroll.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SprintConfiguration {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
