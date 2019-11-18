package com.PerScholas_restcontroller.Config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.PerScholas_restcontroller.models.automobiles;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


@Configuration
@EnableWebMvc
@ComponentScan("com.PerScholas_restcontroller")
public class WebAppConfig implements WebMvcConfigurer {
	@Bean
	InternalResourceViewResolver viewResolver() {
		return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
	}
	@Bean
	ObjectMapper objectMapper() {
		// INDENT_OUTPUT allows for "pretty printing" of JSON data
		return new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
	}
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	// This bean creates a map which will emulate database records.
	@Bean
	Map<Integer, automobiles> AutoMap() {
		Map<Integer, automobiles> sMap = new HashMap<>();
		automobiles auto;
		// Create first student record
		auto = new automobiles(1, "2019", "HondaAccord", "Black");
		sMap.put(auto.getVehicleID(), auto);
		// Create second student record
		auto = new automobiles(2, "2018", "BMW", "Blue");
		sMap.put(auto.getVehicleID(), auto);
		// Create third student record
		auto = new automobiles(3, "2016", "NisanRogue", "Red");
		sMap.put(auto.getVehicleID(), auto);
		return sMap;
	}
}