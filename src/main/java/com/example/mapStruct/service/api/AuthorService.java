package com.example.mapStruct.service.api;

import com.example.mapStruct.dto.AuthorDTO;
import com.example.mapStruct.model.Author;

public interface AuthorService {

    AuthorDTO save(AuthorDTO authorDTO);

    Author findById(Long id);

}
