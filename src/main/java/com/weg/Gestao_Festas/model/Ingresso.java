package com.weg.Gestao_Festas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "ingressos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ingresso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull(message = "O tipo não pode ser nulo")
    private String tipo;

    @NotNull(message = "O preco não pode ser nulo")
    private BigDecimal preco;

    @NotNull(message = "O lote não pode ser nulo")
    private  int lote;

    @ManyToOne
    @JoinColumn(name = "baile_id")
    private Baile baile;

}
