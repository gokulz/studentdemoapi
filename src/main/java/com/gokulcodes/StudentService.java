package com.gokulcodes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
     public List<Student> findAllStudents(){
        return List.of(new Student("Gokula", 
        "kannan", LocalDate.now(), "gk@gmail.com",23 ),
        new Student("Timo", "werne", LocalDate.now(), "timo7@gmail.com", 25)
        
        );
    }
}
