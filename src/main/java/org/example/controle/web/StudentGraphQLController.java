package org.example.controle.web;

import lombok.AllArgsConstructor;
import org.example.controle.dtos.StudentDTO;
import org.example.controle.service.StudentService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;

@Controller
@AllArgsConstructor
public class StudentGraphQLController {
    private StudentService studentService;

    @MutationMapping
    public StudentDTO saveStudent(@Argument StudentDTO student){

        return studentService.saveStudent(student);
    }

    @QueryMapping
    public List<StudentDTO> getStudentByDateNaissance(@Argument Date model){

        return studentService.getStudentByDateNaissance(model);
    }
}
