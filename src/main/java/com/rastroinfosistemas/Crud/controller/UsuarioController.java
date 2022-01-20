package com.rastroinfosistemas.Crud.controller;

import com.rastroinfosistemas.Crud.model.Usuario;
import com.rastroinfosistemas.Crud.repository.UsuarioRepositorio;
import com.rastroinfosistemas.Crud.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Usuarios")
public class UsuarioController {

@Autowired
private UsuarioService usuarioService;

    @GetMapping
    public List<UsuarioRepositorio> obterTodos(){

        return this.usuarioService.obterTodos();
    }
    @GetMapping("/{codigo}")
    public  Usuario obterPorCodigo(@PathVariable String codigo) {
        return this.usuarioService.obterPorCodigo(codigo);


    }
    @PostMapping
    public Usuario  criar(@RequestBody Usuario usuario){
return  this.usuarioService.criar(usuario);
    }


}
