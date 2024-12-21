package org.example.controle.mappers;

import org.example.controle.dao.entities.Student;
import org.example.controle.dtos.StudentDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    private final ModelMapper mapper = new ModelMapper();

    public Student fromStudentDTOToStudent(StudentDTO studentDTO){
        return mapper.map(studentDTO, Student.class);
    }

    public StudentDTO fromStudentToStudentDTO(Student student){
        return mapper.map(student, StudentDTO.class);
    }
}
