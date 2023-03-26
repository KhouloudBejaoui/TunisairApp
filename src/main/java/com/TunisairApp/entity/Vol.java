package com.TunisairApp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private long id;

    private Date dateDepart;
    private Date dateArrivee;

    @ManyToOne
    private Avion avion;

    @ManyToOne
    private Staff staff;

    @ManyToMany(cascade = CascadeType.MERGE)
    private List <Aeroport> aeroport;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vol")
    private List<Aviateur> aviateur;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vol")
    private List<EntrepriseRestauration> entrepriseRestaurations;

    @ManyToMany(cascade = CascadeType.MERGE)
    private List<Passager> passager;




}
