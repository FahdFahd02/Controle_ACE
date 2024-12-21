package org.example.controle.service;

import lombok.AllArgsConstructor;
import org.example.controle.dao.entities.Student;
import org.example.controle.dao.repositories.StudentRepository;
import org.example.controle.dtos.StudentDTO;
import org.example.controle.mappers.StudentMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentManager implements StudentService {

    private StudentRepository studentRepository;
    private StudentMapper studentMapper;

    @Override
    public StudentDTO saveStudent(StudentDTO studentDTO) {
        Student student = studentMapper.fromStudentDTOToStudent(studentDTO);
        student = studentRepository.save(student);
        studentDTO = studentMapper.fromStudentToStudentDTO(student);
        return studentDTO;
    }

    @Override
    public List<StudentDTO> saveStudents(List<StudentDTO> studentDTOS) {

        List<Student> students = new ArrayList<>();
        for (StudentDTO studentDTO : studentDTOS) {
            students.add(studentMapper.fromStudentDTOToStudent(studentDTO));
        }

        students = studentRepository.saveAll(students);

        studentDTOS = new ArrayList<>();
        for (Student student : students) {
            studentDTOS.add(studentMapper.fromStudentToStudentDTO(student));
        }
        return studentDTOS;
    }

    @Override
    public List<StudentDTO> getStudentByDateNaissance(Date date) {
        List<Student> students = studentRepository.findByDateNaissance(date);
        List<StudentDTO> studentDTOS = new ArrayList<>();
        for (Student student : students) {
            studentDTOS.add(studentMapper.fromStudentToStudentDTO(student));
        }
        return studentDTOS;
    }
}
