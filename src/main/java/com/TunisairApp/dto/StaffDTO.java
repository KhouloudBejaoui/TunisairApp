package com.TunisairApp.dto;

import com.TunisairApp.entity.Aviateur;
import com.TunisairApp.entity.Employe;
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
public class StaffDTO {
    private int idStaff;
private transient List <Employe> employe;
    private transient List<Vol> vol;


}
