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
public class Avion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String etat;
    private int capacite;
    private String company;
    private String modele;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "avion")
    private List<Vol> vol;
}
