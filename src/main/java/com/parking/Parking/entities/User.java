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
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "role")


public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    private String login;
    private String pwd ;
    private String userName;





    @OneToMany(mappedBy = "client" ,cascade = CascadeType.ALL)
    private Set<Vehicule> vehicules;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Role role;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Parking> parkings;



}
