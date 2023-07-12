package com.parking.Parking.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description ;
    private String titre ;


    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;






}
