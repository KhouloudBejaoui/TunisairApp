package com.TunisairApp.dto;

import com.TunisairApp.entity.EntrepriseRestauration;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MenuDTO {
    private long id;

    private transient EntrepriseRestauration entrepriseRestauration;


}
