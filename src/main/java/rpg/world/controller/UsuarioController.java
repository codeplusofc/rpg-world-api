package rpg.world.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rpg.world.model.Usuario;
import rpg.world.repository.UsuarioRepository;
import rpg.world.service.UsuarioService;

import java.util.List;

//CONTROLADOR DE REQUISIÇÕES
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario){
      return usuarioService.criarUsuario(usuario);
    }
}
