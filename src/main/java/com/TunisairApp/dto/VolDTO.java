package com.TunisairApp.dto;

import com.TunisairApp.entity.Aeroport;
import com.TunisairApp.entity.Aviateur;
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
    private Aeroport aeroportDepart;
    private Aeroport aeroportArrive;
    private transient List<Aviateur> aviateur;
}
