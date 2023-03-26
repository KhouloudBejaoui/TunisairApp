package com.TunisairApp.dto;

import com.TunisairApp.entity.Aviateur;
import com.TunisairApp.entity.Ense_Restauration;
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
public class MenuDTO {
    private int idMenu;

    private transient Ense_Restauration ense_restauration;


}
