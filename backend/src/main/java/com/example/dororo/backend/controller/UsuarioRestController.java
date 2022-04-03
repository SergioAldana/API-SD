package com.example.dororo.backend.controller;

import com.example.dororo.backend.modelEntity.Cuerpo;
import com.example.dororo.backend.modelEntity.Usuario;
import com.example.dororo.backend.service.CuerpoService;
import com.example.dororo.backend.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class UsuarioRestController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuario")
    public List<Usuario> findAll() {
        return usuarioService.findAll();
    }

    @GetMapping("/usuario/{id}")
    public Usuario findById(@PathVariable Long id) {
        return usuarioService.findById(id);
    }

    @PostMapping("/usuario")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario save(@RequestBody Usuario usuario) {
        return usuarioService.save(usuario);
    }

    @DeleteMapping("/usuario/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remove(@PathVariable Long id) {
        usuarioService.remove(id);
    }

    //Verificar este metodo
    /***
    @PutMapping("/cuerpo/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Cuerpo update(@PathVariable Long id, @RequestBody Cuerpo cuerpo) {
        Cuerpo actualizado = cuerpoService.findById(id);
        actualizado.setParte(cuerpo.getParte());
        actualizado.setEstado(cuerpo.getEstado());
        return cuerpoService.save(cuerpo);
    }
    */

}
