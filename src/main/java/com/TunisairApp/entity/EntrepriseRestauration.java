package com.TunisairApp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class EntrepriseRestauration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom;
    private String adresse;
    private float tel;

    @ManyToOne
    private Vol vol;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "entrepriseRestauration")
    private List<Menu> menu;

}
