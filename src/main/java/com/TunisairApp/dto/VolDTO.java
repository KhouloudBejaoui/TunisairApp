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
    private long id;

    private Date dateDepart;
    private Date dateArrivee;
    private transient Aeroport aeroport;
    private transient Staff staff;
    private transient Avion avion;
    private transient List<Aviateur> aviateur;
    private transient List<EntrepriseRestauration> entrepriseRestaurations;
    private transient List<Passager> passager;
}
