package com.example.demo.model;

public class Movie {
	private String title;
	private String year;
	private String director;
	private String[] cast;
	
	public Movie(String title, String year, String director, String[] cast) {
		super();
		this.title = title;
		this.year = year;
		this.director = director;
		this.cast = cast;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String[] getCast() {
		return cast;
	}
	public void setCast(String[] cast) {
		this.cast = cast;
	}
	
	
}
