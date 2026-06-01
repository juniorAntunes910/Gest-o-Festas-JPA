package com.weg.Gestao_Festas.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "mcs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mc {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull(message = "O nome não pode ser nulo")
    private String nome;

    @NotNull(message = "O genero musical não pode ser nulo")
    private String generoMusical;

    @ManyToMany(mappedBy = "mcs")
    private List<Baile> bailes;
}
