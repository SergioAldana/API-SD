package com.example.dororo.backend.modelDAO;

import com.example.dororo.backend.modelEntity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

}
