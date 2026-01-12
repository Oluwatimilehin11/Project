package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {

    @Autowired
    StudentRepo sr;

    public void registration(Student s)
    {
        sr.save(s);        //Insert Query Directly
    }


}
