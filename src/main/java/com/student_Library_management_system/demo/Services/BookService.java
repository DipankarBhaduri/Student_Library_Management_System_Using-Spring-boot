package com.student_Library_management_system.demo.Services;
import com.student_Library_management_system.demo.DTOs.BookRequestDto;
import com.student_Library_management_system.demo.Models.Author;
import com.student_Library_management_system.demo.Models.Book;
import com.student_Library_management_system.demo.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    AuthorRepository authorRepository ;

    public String addBook ( BookRequestDto bookRequestDto ){
        int author_id = bookRequestDto.getAuthorId() ;
        Author author = authorRepository.findById(author_id).get() ;

        Book book = new Book() ;

        book.setGenre(bookRequestDto.getGenre());
        book.setIssued(false);
        book.setName(bookRequestDto.getName());
        book.setPages(bookRequestDto.getPages());

        book.setAuthor(author);
        List<Book> currentBookWritten = author.getBookWritten() ;
        currentBookWritten.add(book) ;

        // now book is to be saved
        // author also to be saved

        authorRepository.save(author) ;
        return "book added" ;
    }
}
