package com.TunisairApp.dto;

import com.TunisairApp.entity.Aviateur;
import com.TunisairApp.entity.Staff;
import com.TunisairApp.entity.Vol;
import com.TunisairApp.enummeration.ARole;
import com.TunisairApp.enummeration.ERole;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeDTO {
    private long id;

    private String nom;
    private String prenom;
    private float taille;
    private ERole role;
    private transient Staff staff;

}
