package com.jandemasmo.CadastroDeNinjas.Missoes;

import com.jandemasmo.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    /*    @OneToMany - Uma missão para muitos ninjas  */
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;

}
