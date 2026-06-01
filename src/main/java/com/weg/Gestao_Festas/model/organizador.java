package com.weg.Gestao_Festas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
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
public class organizador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;

    private String telefone;

    @Email(message = "Insira um email válido")
    private String email;

    @OneToMany(mappedBy = "organizador")
    private List<Baile> bailes;
}
