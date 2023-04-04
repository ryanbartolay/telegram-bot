package com.example.demo.rest;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.TelegramBot;

@RestController
@RequestMapping(path = "/message")
public class MessageCalculator {

	@Autowired
	private TelegramBot bot;
	
	@GetMapping(path = "/send")
	public void message() {
		String message = "Now is " + LocalDateTime.now() + " : " + UUID.randomUUID();
		bot.sendMessage(message);
	}
}
