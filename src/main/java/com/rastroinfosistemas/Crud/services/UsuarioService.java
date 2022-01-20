package com.rastroinfosistemas.Crud.services;

import com.rastroinfosistemas.Crud.model.Usuario;
import com.rastroinfosistemas.Crud.repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UsuarioService {

    @Autowired

    public List<UsuarioRepositorio> obterTodos();
    public Usuario obterPorCodigo(String codigo);
    public Usuario criar(Usuario usuario);


}
