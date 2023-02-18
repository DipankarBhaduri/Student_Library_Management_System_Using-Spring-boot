package com.student_Library_management_system.demo.DTOs;
import com.student_Library_management_system.demo.Enums.Genre;

public class BookRequestDto {

    private String name ;
    private int pages;
    private Genre genre ;
    private int authorId ;

    public BookRequestDto() {

    }

    public BookRequestDto(String name, int pages, Genre genre, int authorId) {
        this.name = name;
        this.pages = pages;
        this.genre = genre;
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
}