package com.codepipeline.demo.apirest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	@RequestMapping("/hola")
	public String hello(){
		return "Hola este es un servicio de ejemplo";
	}

}
