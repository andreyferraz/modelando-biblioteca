package entities;

import java.time.LocalDate;
import java.util.Date;

import entities.enums.GeneroLivro;

public class Autor {
    private String nome;
    private LocalDate dataNascimento;
    private GeneroLivro genero;
    
    public Autor() {
    }
    
    public Autor(String nome, LocalDate dataNascimentoAutor1, GeneroLivro genero) {
        this.nome = nome;
        this.dataNascimento = dataNascimentoAutor1;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
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
