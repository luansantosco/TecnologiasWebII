package com.luansantos.tecnologiaweb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luansantos.tecnologiaweb.models.Usuario;
import com.luansantos.tecnologiaweb.repositories.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> obterTodosUsuarios() {
        return usuarioRepository.findAll();
    }

    public List<Usuario> obterTodosOsUsuarios() {
        return usuarioRepository.findAll();
    }


    
}
