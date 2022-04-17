package com.example.api;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.api.model.MovimentacaoUsuario;



@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(ApiApplication.class, args);
		
		
	
	}

}
