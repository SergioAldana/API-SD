package com.example.dororo.backend.service;

import com.example.dororo.backend.modelEntity.Usuario;

import java.util.List;

public interface IUsuarioService {

    List<Usuario> findAll();

    Usuario findById(Long id);

    Usuario save(Usuario usuario);

    void remove(Long id);

}
