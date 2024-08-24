package com.gokulcodes;


import java.util.List;




public interface StudentService {
    
    List<Student> findAllStudents();

    Student save(Student theStudent);

    Student findByEmail(String email);

    Student updateStudent(Student theStudent);

    void delete(String email);

     
    
}
