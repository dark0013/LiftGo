package com.darkorss.LiftGo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ClientsDto {

    private Long clientId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String passwordHash;
    private LocalDate dateOfBirth;
    private String gender;
    private String profilePicture;
    private LocalDateTime registrationDate;
    private String status;
    private String lastLocation;
    private Double rating;

}
