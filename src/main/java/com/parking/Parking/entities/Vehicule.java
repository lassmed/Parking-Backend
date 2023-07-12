package com.parking.Parking.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Vehicule {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String matricule ;
    private String type ;


    @JsonIgnore
    @ManyToOne
    private User client;

    @OneToOne(mappedBy = "vehicule")
    private Reservation reservation;

}
