package com.example.demo.model;

public class Song {
	private String title;
	private String year;
	private String performer;
	private String genre;
	private String author;
	
	
	
	public Song(String title, String year, String performer, String genre, String author) {
		super();
		this.title = title;
		this.year = year;
		this.performer = performer;
		this.genre = genre;
		this.author = author;
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
	public String getPerformer() {
		return performer;
	}
	public void setPerformer(String performer) {
		this.performer = performer;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
