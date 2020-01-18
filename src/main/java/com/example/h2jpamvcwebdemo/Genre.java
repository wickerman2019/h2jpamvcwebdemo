package com.example.h2jpamvcwebdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Genre {
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String genrename;

    public Genre() {};

    public Genre(String genrename){
        this.genrename = genrename;
    }
    
    public String getGenrename(){
        return genrename;
    }

}