package com.student_Library_management_system.demo.Models;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    private String name ;
    private int age ;
    private String country;

    private double rating ;

    @OneToMany ( mappedBy = "author" , cascade = CascadeType.ALL)
    List< Book > bookWritten ;

    public Author() {
        bookWritten = new ArrayList<>() ;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<Book> getBookWritten() {
        return bookWritten;
    }

    public void setBookWritten(List<Book> bookWritten) {
        this.bookWritten = bookWritten;
    }
}
