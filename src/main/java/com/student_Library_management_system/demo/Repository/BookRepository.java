package com.student_Library_management_system.demo.Repository;

import com.student_Library_management_system.demo.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository <Book, Integer > {

}
