package com.student_Library_management_system.demo.Services;
import com.student_Library_management_system.demo.DTOs.StudentUpdateMobRequestDto;
import com.student_Library_management_system.demo.Enums.CardStatus;
import com.student_Library_management_system.demo.Models.Card;
import com.student_Library_management_system.demo.Models.Student;
import com.student_Library_management_system.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository ;

    public String createStudent (Student student){
        Card card = new Card() ;
        card.setCardStatus(CardStatus.ACTIVATED);
        // set for foreign key attribute also
        card.setStudentVariableName(student);
        student.setCard(card);
        // If there was a unidirectional mapping : we had to save both of them
        studentRepository.save(student) ; //  by cascading  effect child will automatically saved
        return "" ;
    }

    public String getNameByEmail ( String email){
        Student student = studentRepository.findByEmail(email);
        return student.getName();
    }

    public String updateMob ( StudentUpdateMobRequestDto newStudent ){

         Student originalStudent = studentRepository.findById(newStudent.getId()).get() ;
         originalStudent.setMobileNo(newStudent.getMobNo());
         studentRepository.save(originalStudent) ;
         return "Mobile Number Updated for "+originalStudent.getName() ;
    }

}






















