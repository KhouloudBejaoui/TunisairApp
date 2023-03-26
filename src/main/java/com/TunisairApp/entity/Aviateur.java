package com.TunisairApp.entity;

import com.TunisairApp.enummeration.ARole;
import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Aviateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cin;
    private String nom;
    private String prenom;
    private float taille;
    private int age;
    private String nationalite;
    private int telephone;
    private ARole role;
    @ManyToOne
    private Vol vol;

}
