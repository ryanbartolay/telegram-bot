package com.example.demo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import jakarta.annotation.PostConstruct;

@Service
public class TelegramBot {

	@Value(value = "${telegram.token}")
	private String token;
	private String botUrl = "https://api.telegram.org/bot" + token;
	private RestTemplate restTemplate = new RestTemplate();
	
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		restTemplate.get
	}

}
