package com.TunisairApp.dto;

import com.TunisairApp.entity.Aviateur;
import com.TunisairApp.entity.Employe;
import com.TunisairApp.entity.Vol;
import com.TunisairApp.enummeration.ARole;
import com.TunisairApp.enummeration.URole;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class userDTO {
    private long id;
    private String email;
    private String password;
    private URole role;

}
