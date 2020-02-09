package com.example.h2jpamvcwebdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreService {
	
	@Autowired
    GenreRepository genreRepository;
	
    public List<Genre> getAllBooks() {
        List<Genre> genres = new ArrayList<Genre>();
        genreRepository.findAll().forEach(genre -> genres.add(genre));
        return genres;
    }

    public Genre getGenreById(int id) {
        return genreRepository.findById(id).get();
    }

    public void saveOrUpdate(Genre genre) {
    	genreRepository.save(genre);
    }

    public void delete(int id) {
    	genreRepository.deleteById(id);
    }
}
