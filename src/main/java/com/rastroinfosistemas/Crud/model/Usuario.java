package com.rastroinfosistemas.Crud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
//No Mongodb a tabela é chamada de colection e registro é chamado de documento
@Document()
public class Usuario {

@Id
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String endereço;
    private String telefone;
    private String perfil;



}
