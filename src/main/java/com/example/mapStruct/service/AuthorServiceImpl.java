package com.example.mapStruct.service;

import com.example.mapStruct.dao.AuthorDAO;
import com.example.mapStruct.dto.AuthorDTO;
import com.example.mapStruct.exception.NotFoundDataException;
import com.example.mapStruct.model.Author;
import com.example.mapStruct.service.api.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorDAO authorDAO;

    @Override
    public Author findById(Long id) throws NotFoundDataException{
        final Author author = authorDAO.findById(id)
                .orElseThrow(() -> new NotFoundDataException("Author with id = " + id + " is not found"));
        return author;
    }
}
