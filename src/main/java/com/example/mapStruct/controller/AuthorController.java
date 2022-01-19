package com.example.mapStruct.controller;

import com.example.mapStruct.dto.AuthorDTO;
import com.example.mapStruct.mapper.AuthorMapper;
import com.example.mapStruct.model.Author;
import com.example.mapStruct.service.api.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorMapper mapper;
    private final AuthorService authorService;

    @PostMapping(value = "/entity")
    public Author getAuthorFromAuthorDTO (@RequestBody AuthorDTO authorDTO){

        return mapper.authorDTOToAuthor(authorService.save(authorDTO));
    }

    @GetMapping(value = "/dto/{id}")
    public AuthorDTO getByIdAuthor (@PathVariable Long id){

        return mapper.authorToAuthorDTO(authorService.findById(id));
    }

}
