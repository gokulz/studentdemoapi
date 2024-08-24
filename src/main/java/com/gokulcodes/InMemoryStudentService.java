package com.gokulcodes;


import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class InMemoryStudentService implements StudentService{

    @Override
    public List<Student> findAllStudents() {
      
        return null;
    }

    @Override
    public void delete(String email) {
       
    }

    @Override
    public Student findByEmail(String email) {
       
        return null;
    }

    @Override
    public Student save(Student theStudent) {
     
        return null;
    }

    @Override
    public Student updateStudent(Student theStudent) {
       
        return null;
    }
    
}
