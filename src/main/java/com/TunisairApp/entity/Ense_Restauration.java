package com.TunisairApp.entity;

import com.TunisairApp.enummeration.ARole;
import com.TunisairApp.enummeration.ERole;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Ense_Restauration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEse;
    @ManyToOne
    private Vol vol;

    private String nom;
    private String adresse;
    private float tel;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ense_restauration")
    private List<Menu> menu;

}
