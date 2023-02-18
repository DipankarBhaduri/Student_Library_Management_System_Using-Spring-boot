package com.student_Library_management_system.demo.Services;
import com.student_Library_management_system.demo.DTOs.AuthorEntryDto;
import com.student_Library_management_system.demo.Models.Author;
import com.student_Library_management_system.demo.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository ;

    public String createAuthor (AuthorEntryDto authorDto ){
        Author author = new Author() ;
        author.setName((authorDto.getName()));
        author.setAge(authorDto.getAge());
        author.setCountry(authorDto.getCountry());
        author.setRating(authorDto.getRating());
        authorRepository.save(author);
        return "author added " ;
    }
}
