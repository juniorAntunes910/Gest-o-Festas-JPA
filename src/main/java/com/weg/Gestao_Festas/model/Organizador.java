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
@Table(name = "organizador")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Organizador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull(message = "O nome não pode ser nulo")
    private String nome;

    @NotNull(message = "O telefone não pode ser nulo")
    private String telefone;

    @Email(message = "Insira um email válido")
    private String email;

    @OneToMany(mappedBy = "organizador")
    private List<Baile> bailes;
}
