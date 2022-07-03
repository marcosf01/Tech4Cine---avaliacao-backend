package br.com.tech4me.cliente.client;

public class Filme {
    //private String id;
    private String titulo;
    private Integer ano;
    private GeneroFilme genero;
    private double avaliacaoImdb;
    private String sinopse;
    
    public double getAvaliacaoImdb() {
        return avaliacaoImdb;
    }
    public void setAvaliacaoImdb(double avaliacaoImdb) {
        this.avaliacaoImdb = avaliacaoImdb;
    }
    /*public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }*/
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Integer getAno() {
        return ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }
    public GeneroFilme getGenero() {
        return genero;
    }
    public void setGenero(GeneroFilme genero) {
        this.genero = genero;
    }
    public String getSinopse() {
        return sinopse;
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

}
