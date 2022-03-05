package com.mooddle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

	@GetMapping(path = {"/ola", "/contato"})
	public String ola() {
		return "Olá adsasdas";
	}
}
