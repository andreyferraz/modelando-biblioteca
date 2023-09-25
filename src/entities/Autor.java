package entities;

import java.util.Date;

import entities.enums.GeneroLivro;

public class Autor {
    private String nome;
    private Date dataNascimento;
    private GeneroLivro genero;
    
    public Autor() {
    }
    
    public Autor(String nome, Date dataNascimento, GeneroLivro genero) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public GeneroLivro getGenero() {
        return genero;
    }

    public void setGenero(GeneroLivro genero) {
        this.genero = genero;
    }
    
    @Override
    public String toString() {
        return "Autor [dataNascimento=" + dataNascimento + ", genero=" + genero + ", nome=" + nome + "]";
    }
}
