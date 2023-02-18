package com.student_Library_management_system.demo.Repository;
import com.student_Library_management_system.demo.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository <Card, Integer >  {

}
