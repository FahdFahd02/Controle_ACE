package org.example.controle;

import org.example.controle.dtos.StudentDTO;
import org.example.controle.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class ControleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleApplication.class, args);
    }


    @Bean
    CommandLineRunner start(StudentService studentService) {
        return args -> {
            studentService.saveStudents(
                    List.of(
                            StudentDTO.builder().name("fahd").email("fahd@gmail.com").dateNaissance(new Date(2003,2,27)).build(),
                            StudentDTO.builder().name("mohamed").email("mohamed@gmail.com").dateNaissance(new Date(1998,5,23)).build(),
                            StudentDTO.builder().name("younes").email("younes@gmail.com").dateNaissance(new Date(1999,9,20)).build(),
                            StudentDTO.builder().name("hassan").email("hassan@gmail.com").dateNaissance(new Date(1995,6,19)).build()
                    )

            );
        };
    }
}
