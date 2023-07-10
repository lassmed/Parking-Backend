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
public class Parking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    private Boolean full;
    private String position ;

    @OneToMany(mappedBy = "parking" ,cascade = CascadeType.ALL)
    private Set<Place> places;


    @ManyToOne(cascade = CascadeType.ALL)
    private Admin admin;

}
