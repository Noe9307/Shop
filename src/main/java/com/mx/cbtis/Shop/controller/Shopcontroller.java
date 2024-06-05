package com.mx.cbtis.Shop.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.mx.cbtis.Shop.modelo.Productos;

@Controller
public class Shopcontroller {
	
	@GetMapping("/")
	public String getInicio() {
		return "index";
	}
	
	@GetMapping("/cart")
	public String getCart() {		
		return "cart";
	}

	@GetMapping("/login")
	public String getLogin() {		
		return "login";
	}
	
	@GetMapping("/hardw")
	public String getHardw() {		
		return "hardware";
	}
	
	@GetMapping("/videogms")
	public String getVideogms() {		
		return "videojuegos";
	}
	
	@GetMapping("/sobrensts")
	public String getSobrensts() {		
		return "sobrensts";
	}
	
	@GetMapping("/contactanos")
	public String getContactanos() {		
		return "contactanos";
	}
	
	/*@GetMapping("/productos")
	public String getProdus() {		
		return "productos";
	}*/
	
	@GetMapping("/productos")
	public String getProdus(Model modelo) {		
		RestTemplate template = new RestTemplate();
		String urlservicebd = "http://localhost:8081/mostrarProductos";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		Productos[] response = template.postForObject(urlservicebd,headers,Productos[].class);		
		List<Productos> productos = Arrays.asList(response);
		modelo.addAttribute("listaProductos", productos);	
		
		return "productos";
	}
}


