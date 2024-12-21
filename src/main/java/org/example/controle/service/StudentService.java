package org.example.controle.service;

import org.example.controle.dtos.StudentDTO;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface StudentService {
    public StudentDTO saveStudent(StudentDTO studentDTO);

    public List<StudentDTO> saveStudents(List<StudentDTO> studentDTOS);

    public List<StudentDTO> getStudentByDateNaissance(Date date);
}
