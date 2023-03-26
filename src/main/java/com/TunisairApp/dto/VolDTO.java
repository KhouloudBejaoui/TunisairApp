package com.TunisairApp.dto;

import com.TunisairApp.entity.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class VolDTO {
    private int id;

    private Date dateDepart;
    private Date dateArrivee;
    private transient Aeroport aeroport;
    private transient Staff staff;
    private transient List <Ense_Restauration> ense_restauration;

    private transient Avion avion;
    //private Aeroport aeroportArrive;
    private transient List<Aviateur> aviateur;
    private transient List<Passager> passager;
}
