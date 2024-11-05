package com.luansantos.tecnologiaweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luansantos.tecnologiaweb.models.Usuario;
import com.luansantos.tecnologiaweb.services.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

     @GetMapping
    public List<Usuario> obterTodosOsUsuarios() {
        return usuarioService.obterTodosOsUsuarios();
    }
}
