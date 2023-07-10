package com.parking.Parking.entities;


import jakarta.persistence.*;
import lombok.*;


import java.util.Set;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id")
@DiscriminatorValue("admin")


public class Admin extends User {


    private String nom;
    private  String prenom;


    @OneToMany(cascade = CascadeType.ALL)
    private Set<Parking> parkings;

}


