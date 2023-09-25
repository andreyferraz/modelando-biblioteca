import java.time.LocalDate;
import java.util.Date;

import entities.Autor;
import entities.Biblioteca;
import entities.Livro;
import entities.enums.GeneroLivro;
public class App {
    public static void main(String[] args) throws Exception {
        LocalDate dataNascimentoAutor1 = LocalDate.of(1991, 6, 19);
        LocalDate dataNascimentoAutor2 = LocalDate.of(1980, 4, 10);
        LocalDate dataNascimentoAutor3 = LocalDate.of(1988, 6, 20);

        Autor autor1 = new Autor("Andrêy Martins Ferraz", dataNascimentoAutor1, GeneroLivro.AVENTURA);
        Autor autor2 = new Autor("Andrés Felipe", dataNascimentoAutor2, GeneroLivro.DRAMA);
        Autor autor3 = new Autor("João Fonseca", dataNascimentoAutor3, GeneroLivro.TERROR);

        //criar alguns livros para serem adicionados na Biblioteca
        Livro livro1 = new Livro("O Poder do Hábito", autor1, GeneroLivro.AVENTURA, 1991);
        Livro livro2 = new Livro("O Senhor Dos Aneis", autor1, GeneroLivro.AVENTURA, 1994);
        Livro livro3 = new Livro("A Morte do Demônio", autor2, GeneroLivro.TERROR, 2000);
        Livro livro4 = new Livro("O Hobbit", autor3, GeneroLivro.FANTASIA, 1999);
        
        //criar uma biblioteca
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        System.out.println("Livros da Biblioteca: ");
        biblioteca.listarLivros();
        System.out.println();
        System.out.println("Livros pela categoria: ");
        biblioteca.buscarLivrosPorGenero(GeneroLivro.TERROR);

    }
}
