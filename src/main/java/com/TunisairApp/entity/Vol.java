package com.TunisairApp.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Vol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date dateDepart;
    private Date dateArrivee;
    @ManyToOne
    private Aeroport aeroportDepart;
    private Aeroport aeroportArrive;
    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vol")
    private List<Aviateur> aviateur;




}
