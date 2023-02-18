package com.student_Library_management_system.demo.Controller;
import com.student_Library_management_system.demo.DTOs.StudentUpdateMobRequestDto;
import com.student_Library_management_system.demo.Models.Student;
import com.student_Library_management_system.demo.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService studentService ;

    @PostMapping("/add")
    public String createStudent (@RequestBody Student student){
        studentService.createStudent(student);
        return student.getName() + " added successfully" ;
    }

    @GetMapping("/get_user")
    public String getNameByEmail ( @RequestParam("email") String email){
       return studentService.getNameByEmail(email);
    }

    @PutMapping("/update_mob")
    public String updateMob ( @RequestBody StudentUpdateMobRequestDto studentDto ){
        return studentService.updateMob(studentDto) ;
    }



}
