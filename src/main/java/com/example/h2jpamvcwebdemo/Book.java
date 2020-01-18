package com.example.h2jpamvcwebdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	private  int id;
	  private String name;
	  private String author;
	  private String publisher;
      private short year;
      private short genre;
	  
	  Book () {};
	  
	  public Book(String name, String author, String publisher, short year, short genre) {
		    this.name = name;
		    this.author = author;
		    this.publisher = publisher;
            this.year = year;
            this.genre = genre;
	  }
	  
	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public short getYear() {
		return year;
    }
    
    public short getGenre() {
		return genre;
	}

}