package br.com.tech4me.cliente.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.cliente.client.FilmeFeingClient;
import br.com.tech4me.cliente.dto.UsuarioDto;
import br.com.tech4me.cliente.dto.UsuarioDtoComInformacoes;
import br.com.tech4me.cliente.model.Usuario;
import br.com.tech4me.cliente.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    
    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private FilmeFeingClient feingClient;

    private ModelMapper mapper = new ModelMapper();

    @Override
    public List<UsuarioDto> obterTodosOsUsuarios() {
        List<Usuario> usuarios = repository.findAll();

        return usuarios.stream()
        .map(us -> mapper.map(us, UsuarioDto.class))
        .collect(Collectors.toList());
    
    }

    @Override
    public UsuarioDtoComInformacoes obterPorId(String id) {
        Optional<Usuario> usuario = repository.findById(id);

        if (usuario.isPresent()) {
            UsuarioDtoComInformacoes usuarioComDetalhes = mapper.map(usuario, UsuarioDtoComInformacoes.class);
            usuarioComDetalhes.setDetalhes(feingClient.obterFilmePorId(usuario.get().getFilme()));
            return usuarioComDetalhes;
        }
        return null;
    }

    @Override
    public UsuarioDto cadastrarUsuario(UsuarioDto usuario) {
        Usuario salvarUsuario = mapper.map(usuario, Usuario.class);
        repository.save(salvarUsuario);
        return mapper.map(salvarUsuario, UsuarioDto.class);
    }

    @Override
    public void excluirUsuario(String id) {
        repository.deleteById(id);
        
    }

    @Override
    public UsuarioDto alterarUsuario(String id, UsuarioDto usuario) {
        Optional<Usuario> usuarioBuscar = repository.findById(id);

        if (usuarioBuscar.isPresent()) {
            Usuario usuarioAlterar = mapper.map(usuario, Usuario.class);
            usuarioAlterar.setId(id);
            usuarioAlterar = repository.save(usuarioAlterar);
            return mapper.map(usuarioAlterar, UsuarioDto.class);
        }
        return null;
    }
    
    
}
