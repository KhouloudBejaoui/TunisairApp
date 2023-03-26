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
public class PassagerDTO
{
    private long cin ;
    private String nom;
    private String prenom;
    private String numPassport;
    private String email;
    private int telephone;
    private transient List<Vol> vol;
}
