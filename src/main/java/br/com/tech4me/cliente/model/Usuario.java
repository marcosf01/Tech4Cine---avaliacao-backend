package br.com.tech4me.cliente.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("usuarios")
public class Usuario {
    @Id
    private String id;
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
