package com.example.inf1013.controllers;

import com.example.inf1013.dto.StudentDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/student")
public class StudentController {
    @GetMapping("/get/{id}")
    public StudentDTO get(@PathVariable(name="id") String studentId){

        StudentDTO s= new StudentDTO(
                "KUibia",
                "Jordan",
                "+1-819-999-9999" + studentId
        );

        return s;
    }
}
