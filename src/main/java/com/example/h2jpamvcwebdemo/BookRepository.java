package com.example.h2jpamvcwebdemo;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository <Book, Integer>{

}