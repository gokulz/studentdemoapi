package com.gokulcodes;

// import java.time.LocalDate;
import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
     //field injection
   // @Autowired
    private StudentService studentService;

    //constructor injection
    public StudentController(StudentService theStudentService){
        this.studentService = theStudentService;
    }
    
    @PostMapping("/create")
    public Student save(@RequestBody  Student theStudent){
        return studentService.save(theStudent);
    }
     
    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String email){
        return studentService.findByEmail(email);
    }
    
    @GetMapping("/all")
    public List<Student> findAllStudents(){
       return studentService.findAllStudents();
    }
    
}
