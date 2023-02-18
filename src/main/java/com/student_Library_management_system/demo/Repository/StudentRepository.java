package com.student_Library_management_system.demo.Repository;
import com.student_Library_management_system.demo.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository <Student , Integer > {

    Student findByEmail (String email);

    // select * from student where country =India ;
    // List<Student> findByCountry ( String country);

}
