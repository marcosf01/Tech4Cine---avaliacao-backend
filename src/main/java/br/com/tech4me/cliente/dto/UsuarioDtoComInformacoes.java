package br.com.tech4me.cliente.dto;

import br.com.tech4me.cliente.client.Filme;

public class UsuarioDtoComInformacoes extends UsuarioDto {
    private Filme detalhes;

    public Filme getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(Filme detalhes) {
        this.detalhes = detalhes;
    }
    
}
