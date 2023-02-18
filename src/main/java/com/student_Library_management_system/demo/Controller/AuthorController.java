package com.student_Library_management_system.demo.Controller;

import com.student_Library_management_system.demo.DTOs.AuthorEntryDto;
import com.student_Library_management_system.demo.Models.Author;
import com.student_Library_management_system.demo.Services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("author")
public class AuthorController {

    @Autowired
    AuthorService authorService ;

    @PostMapping("/add")
    public String addAuthor (@RequestBody AuthorEntryDto author){
        return authorService.createAuthor(author) ;
    }

}
