package org.example.controle.dtos;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class StudentDTO {
    private String name;
    private String email;
    private Date dateNaissance;
}
