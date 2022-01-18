package com.example.mapStruct.mapper;

import com.example.mapStruct.dto.AuthorDTO;
import com.example.mapStruct.model.Author;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthorMapper {

    AuthorDTO authorToAuthorDTO(Author author);
    Author authorDTOToAuthor(AuthorDTO authorDTO);

}
