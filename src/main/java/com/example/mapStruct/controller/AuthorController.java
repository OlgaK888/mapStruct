package com.example.mapStruct.controller;

import com.example.mapStruct.dto.AuthorDTO;
import com.example.mapStruct.mapper.AuthorMapper;
import com.example.mapStruct.model.Author;
import com.example.mapStruct.service.api.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorMapper mapper;
    private final AuthorService authorService;

    @GetMapping(value = "/dto/{id}")
    public AuthorDTO getByIdAuthor (@PathVariable Long id){

        return mapper.authorToAuthorDTO(authorService.findById(id));
    }

    @GetMapping(value = "/entity/{id}")
    public Author getByIdAuthorDTO (@PathVariable Long id){

        AuthorDTO nextAuthor = mapper.authorToAuthorDTO(authorService.findById(id));
        return mapper.authorDTOToAuthor(nextAuthor);
    }
}
