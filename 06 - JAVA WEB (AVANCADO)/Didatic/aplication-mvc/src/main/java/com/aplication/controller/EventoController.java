package com.aplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoController {

	@RequestMapping("/cadastroEvento")
	public String form() {
		return "evento/formeEvento";
	}
}
