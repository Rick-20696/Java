package com.ricardo.spring;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Toda classe que é um controller deve ser marcada com @...Controller.
 * 
 * Os endpoints devem ser maracado com @RequestMapping, que pode ser configurada com os parâmetros
 * Automáticamente se você não passar nada, o método HTTP será GET para a rota padrão: localhost:porta/
 */

@RestController
public class UserController {
	@RequestMapping()
	public String getUser() {
		return "User: Ricardo\nEmail: ricarosousa83@gmail.com";
	}
}
