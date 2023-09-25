package entities;

import entities.enums.GeneroLivro;

public class Livro {
    private String titulo;
    private Autor autor;
    private GeneroLivro genero;
    private int anoLancamento;

    public Livro() {
    }

    public Livro(String titulo, Autor autor, GeneroLivro genero, int anoLancamento) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public GeneroLivro getGenero() {
        return genero;
    }

    public void setGenero(GeneroLivro genero) {
        this.genero = genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "Livro [anoLancamento=" + anoLancamento + ", autor=" + autor + ", genero=" + genero + ", titulo="
                + titulo
                + "]";
    }

}
