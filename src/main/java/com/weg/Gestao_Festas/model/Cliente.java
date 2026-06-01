package com.weg.Gestao_Festas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "clientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull(message = "O nome não pode ser nulo")
    private String nome;

    @Email(message = "Insira um Email válido")
    private String email;

    @NotNull(message = "A idade não pode ser nula")
    private int idade;

    @OneToMany(mappedBy = "cliente")
    private List<Venda> vendas;
}
