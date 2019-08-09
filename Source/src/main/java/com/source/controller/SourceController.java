package com.source.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class SourceController {


	private RestTemplate restTemplate;
	
	@Autowired
	public SourceController(RestTemplate restTemplate) {		
		this.restTemplate = restTemplate;
	}
	
	@GetMapping("/findByNumber/{number}")
	public ResponseEntity<Object> findByNumber(@PathVariable("number") String number) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36(KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");

		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		
		return restTemplate.exchange("https://pokeapi.co/api/v2/pokemon/"+number, HttpMethod.GET, entity, Object.class);
		
		}
	

	
	
	
}
