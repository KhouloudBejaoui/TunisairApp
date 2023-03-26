package com.TunisairApp.entity;

import com.TunisairApp.enummeration.ARole;
import com.TunisairApp.enummeration.ERole;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmp;

    private String nom;
    private String prenom;
    private float taille;
    private ERole role;
  @ManyToOne
    private Staff staff;

}
