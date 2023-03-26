package com.TunisairApp.dto;

import com.TunisairApp.entity.Aviateur;
import com.TunisairApp.entity.Vol;
import com.TunisairApp.enummeration.ARole;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AvionDTO {
    private long id;
    private String etat;
    private int capacite;
    private String company;
    private String modele;
    private transient List<Vol> vol;


}
