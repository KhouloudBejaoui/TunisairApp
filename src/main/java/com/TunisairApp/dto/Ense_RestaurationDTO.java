package com.TunisairApp.dto;

import com.TunisairApp.entity.Aviateur;
import com.TunisairApp.entity.Menu;
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
public class Ense_RestaurationDTO {
    private int idEse;

    private String nom;
    private String adresse;
    private float tel;
    private transient List<Menu> menu;
private transient Vol vol;

}
