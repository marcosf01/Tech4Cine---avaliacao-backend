package br.com.tech4me.cliente.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import br.com.tech4me.cliente.model.FormaDePagamento;
import br.com.tech4me.cliente.model.Sessao;

public class UsuarioDto {
    private String id;

    @NotBlank(message = "O nome deve possuir caracteres não brancos")
    @NotEmpty(message = "O nome deve ser preenchido")
    @Size(min = 5 ,message = "O nome deve ter, no mínimo, 5 caracteres")
    private String nome;
    private Sessao sessao;
    private FormaDePagamento pagamento;
    private String filme;
    
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Sessao getSessao() {
        return sessao;
    }
    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }
    public FormaDePagamento getPagamento() {
        return pagamento;
    }
    public void setPagamento(FormaDePagamento pagamento) {
        this.pagamento = pagamento;
    }
    public String getFilme() {
        return filme;
    }
    public void setFilme(String filme) {
        this.filme = filme;
    }
    
}
