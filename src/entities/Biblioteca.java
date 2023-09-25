package entities;

import java.util.Arrays;

import entities.enums.GeneroLivro;

public class Biblioteca {
    // criar array para armazenar livros
    private Livro[] livros;

    public void adicionarLivro(Livro livro) {
        if (livros == null) {
            livros = new Livro[1];
            livros[0] = livro;
        } else {
            Livro[] novoArray = Arrays.copyOf(livros, livros.length + 1);
            novoArray[novoArray.length - 1] = livro;
            livros = novoArray;
        }
    }

    // criar método para listar todos os livros cadastrados
    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    // buscar livros pelo gênero
    public void buscarLivrosPorGenero(GeneroLivro genero) {
        for (Livro livro : livros) {
            if (livro.getGenero() == genero) {
                System.out.println(livro);
            }
        }
    }

}
