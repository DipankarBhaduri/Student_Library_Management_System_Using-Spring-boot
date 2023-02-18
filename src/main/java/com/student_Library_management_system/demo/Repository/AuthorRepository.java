package com.student_Library_management_system.demo.Repository;
import com.student_Library_management_system.demo.Models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository <Author , Integer > {

}
