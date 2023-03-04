package com.TunisairApp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CopiloteDTO {

    private long id;

    private String nom;
    private String prenom;

    private String nationalite;
    private int age;
    private float taille;
    private String telephone;
    private String cin;
}
