package com.TunisairApp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private Avion avion;
    @ManyToOne
    private Staff staff;
    @ManyToOne
    private Ense_Restauration ense_restauration;
    @ManyToMany(cascade = CascadeType.MERGE)
    private List <Aeroport> aeroport;
    //private Aeroport aeroportArrive;
    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vol")
    private List<Aviateur> aviateur;
    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vol")
    private List<Ense_Restauration> ense_restaurations;

    @ManyToMany(cascade = CascadeType.MERGE)
    private List<Passager> passager;




}
