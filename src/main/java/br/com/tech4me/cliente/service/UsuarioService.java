package br.com.tech4me.cliente.service;

import java.util.List;

import br.com.tech4me.cliente.dto.UsuarioDto;
import br.com.tech4me.cliente.dto.UsuarioDtoComInformacoes;

public interface UsuarioService {
    List<UsuarioDto> obterTodosOsUsuarios();
    UsuarioDtoComInformacoes obterPorId(String id);
    UsuarioDto cadastrarUsuario(UsuarioDto usuario);
    void excluirUsuario(String id);
    UsuarioDto alterarUsuario(String id, UsuarioDto usuario);
}
