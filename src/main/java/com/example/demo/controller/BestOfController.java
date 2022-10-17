package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Movie;
import com.example.demo.model.Song;

@RestController
@RequestMapping("/bestof")
public class BestOfController {
	
	@GetMapping("/movie")
	public Movie bestMovie(@RequestParam(name = "prova", required = false) String titolo) {
		return new Movie("Harry Potter", "1998", "Chris Columbus", new String[]{"Daniel Radcliffe","Emma Watson", "Rupert Grint"});
	}
	
	@GetMapping("/song")
	public Song bestSong(@RequestParam(name = "prova", required = false) String titolo) {
		return new Song("Io vengo dalla luna", "2017", "Maneskin", "Rock", "Caparezza");
	}

	
	
}
