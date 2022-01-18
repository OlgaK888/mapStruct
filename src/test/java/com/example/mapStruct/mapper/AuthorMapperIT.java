package com.example.mapStruct.mapper;

import com.example.mapStruct.dto.AuthorDTO;
import com.example.mapStruct.model.Author;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AuthorMapperIT {

    /*private AuthorMapper mapper = Mappers.getMapper(AuthorMapper.class);
    //@Autowired
    //private AuthorMapper mapperTest;

    @Test
    public void givenAuthorToAuthorDTO_whenMaps_thenCorrect() {
        Author author = new Author();
        author.setId(1L);
        author.setName("Vasiliy Egorov");
        author.setAge(42);
        AuthorDTO authorDTO = mapper.authorToAuthorDTO(author);
        System.out.println("123");
        assertEquals(author.getId(), authorDTO.getId());
        assertEquals(author.getName(), authorDTO.getName());
        assertEquals(author.getAge(), authorDTO.getAge());
    }*/
}
