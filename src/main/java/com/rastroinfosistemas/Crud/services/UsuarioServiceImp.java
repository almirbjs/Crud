package com.rastroinfosistemas.Crud.services;

import com.rastroinfosistemas.Crud.model.Usuario;
import com.rastroinfosistemas.Crud.repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImp implements UsuarioService{

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;


    @Override
    public List<UsuarioRepositorio> obterTodos() {
        return this.usuarioRepositorio.findAll();
    }

    @Override
    public Usuario obterPorCodigo(String codigo) {
        return (Usuario) this.usuarioRepositorio.
                findById(codigo).
                orElseThrow(() -> new IllegalArgumentException("Usuario não existe."));
    }

    @Override
    public Usuario criar(Usuario usuario) {
        return (Usuario) this.usuarioRepositorio.save(usuarioRepositorio);
    }


}
