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
@DiscriminatorValue("client")


public class Client extends User {


    private Long cin;
    private Long matricule;
    private Long telephone;

    @OneToMany(mappedBy = "client" ,cascade = CascadeType.ALL)
    private Set<Reservation> Reservations;

}
