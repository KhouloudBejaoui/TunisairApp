package com.TunisairApp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Passager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cin ;

    private String nom;
    private String prenom;
    private String numPassport;
    private String email;
    private int telephone;

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.MERGE, mappedBy = "passager")
    private List<Vol> vol;


}
