package com.codepipeline.demo.apirest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("awspipeline")
@RestController
public class ApiController {
	
	@RequestMapping("/saludo")
	public String hello(){
		return "Hola este es un servicio de ejemplo";
	}

}
