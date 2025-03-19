package com.jandemasmo.CadastroDeNinjas.Ninjas;

import com.jandemasmo.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name ="tb_cadastro_de_ninjas")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    private int idade;

    /*   @ManyToOne - Muitos ninjas para 1 missão    */
    @ManyToOne
    @JoinColumn(name = "missoes_id") //foreing key (chave estrangeira)
    private MissoesModel missoes;



}
