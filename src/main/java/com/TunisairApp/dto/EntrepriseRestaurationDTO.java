package com.TunisairApp.dto;

import com.TunisairApp.entity.Menu;
import com.TunisairApp.entity.Vol;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EntrepriseRestaurationDTO {
    private long id;

    private String nom;
    private String adresse;
    private float tel;
    private transient Vol vol;
    private transient List<Menu> menu;


}
