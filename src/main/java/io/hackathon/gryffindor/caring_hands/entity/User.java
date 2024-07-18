package io.hackathon.gryffindor.caring_hands.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Entity
@Data
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email;

    @NotBlank
    private String password;

    @Min(18)
    private int age;

    @Min(0)
    private int yearsOfExperience;

    @NotBlank
    private String specialization;

    private String qualifications;

    private String training;

    private String gender;

    private String relationship;

    private String availability;

    private String servicesOffered;






    /*@Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private Relationship relationship;

    @Enumerated(EnumType.STRING)
    private Availability availability;*/


}
