package com.parking.Parking.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Date dateEntrée;
    private Date dateSortie;
    private Float prixTotale;



    @JsonIgnore
    @ManyToOne
    private Client client;

    @OneToOne
    @JoinColumn(name = "place_id")
    private Place place;
}
