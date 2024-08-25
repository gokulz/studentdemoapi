package com.gokulcodes;


import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class InMemoryStudentService implements StudentService{

    private final InMemoryStudentDao dao;

    public InMemoryStudentService(InMemoryStudentDao dao){
        this.dao = dao;
    }

    @Override
    public List<Student> findAllStudents() {
      
        return dao.findAllStudents();
    }

    @Override
    public void delete(String email) {
        dao.delete(email); 
    } 

    @Override
    public Student findByEmail(String email) {
       
        return dao.findByEmail(email);
    }

    @Override
    public Student save(Student theStudent) {
     
        return dao.save(theStudent);
    }

    @Override
    public Student updateStudent(Student theStudent) {
       
        return dao.update(theStudent);
    }
    
}
