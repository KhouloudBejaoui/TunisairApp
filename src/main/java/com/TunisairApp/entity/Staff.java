package com.TunisairApp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "staff")
    private List<Employe> employe;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "staff")
    private List<Vol> vol;
}
