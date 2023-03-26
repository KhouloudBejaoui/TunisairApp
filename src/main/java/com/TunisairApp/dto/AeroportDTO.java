package com.TunisairApp.dto;

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
public class AeroportDTO {
    private int id;

    private String nom;
    private String adresse;
    private transient List<Vol> vols;
}
