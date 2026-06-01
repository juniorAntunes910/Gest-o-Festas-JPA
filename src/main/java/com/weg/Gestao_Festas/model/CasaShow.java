package com.weg.Gestao_Festas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "casa_show")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CasaShow {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull(message = "O nome não pode ser nulo")
    private String nome;

    @NotNull(message = "O endereço não pode ser nulo")
    private String endereco;

    @OneToMany(mappedBy = "casa_show")
    private List<Baile> bailes;

    @NotNull(message = "A capacidade não pode ser nula")
    private int capacidadeMaxima;

}
