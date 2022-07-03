package br.com.tech4me.cliente.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.cliente.dto.UsuarioDto;
import br.com.tech4me.cliente.dto.UsuarioDtoComInformacoes;
import br.com.tech4me.cliente.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioService service;


    @GetMapping
    public List<UsuarioDto> obterUsuarios() {
        return service.obterTodosOsUsuarios();
    }

    @PostMapping
    public ResponseEntity<UsuarioDto> cadastrarUsuario(@RequestBody @Valid UsuarioDto usuario ) {
        return new ResponseEntity<>(service.cadastrarUsuario(usuario), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public UsuarioDtoComInformacoes obterPorId(@PathVariable String id) {
        return service.obterPorId(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioDto> alterarUsuario(@PathVariable String id, @RequestBody @Valid UsuarioDto usuario) {
        return new ResponseEntity<>(service.alterarUsuario(id, usuario), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void excluirUsuario(@PathVariable String id) {
        service.excluirUsuario(id);
    }

    
}
