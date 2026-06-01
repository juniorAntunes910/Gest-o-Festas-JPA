package com.weg.Gestao_Festas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "bailes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Baile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull(message = "O nome do baile não pode ser nulo")
    private String nome;

    @NotNull(message = "A data do evento não pode ser nula")
    private LocalDateTime dataEvento;

    @NotNull(message = "A capacidade não pode ser nula")
    private int capacidade;

    @NotNull(message = "A idade Minima não pode ser nula")
    private int idadeMinima;

    @ManyToOne
    @JoinColumn(name = "organizador_id")
    private Organizador organizador;

    @ManyToMany
    @JoinColumn(name = "casa_show_id")
    private CasaShow casaShow;

    @ManyToMany
    @JoinTable(
            name = "baile_mc",
            joinColumns = @JoinColumn(name = "baile_id"),
            inverseJoinColumns = @JoinColumn(name = "mc_id")
    )
    private List<Mc> mcs;

    @OneToMany(mappedBy = "baile")
    private List<Ingresso> ingressos;
}
