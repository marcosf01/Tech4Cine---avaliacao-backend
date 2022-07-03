package br.com.tech4me.cliente.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4me.cliente.model.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    
}
