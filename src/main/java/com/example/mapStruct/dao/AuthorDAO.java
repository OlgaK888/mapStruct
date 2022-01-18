package com.example.mapStruct.dao;

import com.example.mapStruct.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorDAO extends CrudRepository<Author, Long> {
}
