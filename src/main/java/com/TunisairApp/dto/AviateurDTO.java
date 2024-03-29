package com.TunisairApp.dto;

import com.TunisairApp.entity.Vol;
import com.TunisairApp.enummeration.ARole;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AviateurDTO {
    private long id;
    private int cin;
    private String nom;
    private String prenom;
    private float taille;
    private int age;
    private String nationalite;
    private int telephone;
    private ARole role;
    private transient Vol vol;
}
