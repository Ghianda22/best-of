package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Movie;

@RestController
@RequestMapping("/bestof")
public class BestOfController {
	
	@GetMapping("/movie")
	public Movie bestMovie(@RequestParam(name = "prova", required = false)) {
		return new Movie();
	}
	
	@GetMapping("/song")
	public void bestSong(@RequestParam(name = "prova", required = false)) {
		return new Song();
	}

	
	
}
