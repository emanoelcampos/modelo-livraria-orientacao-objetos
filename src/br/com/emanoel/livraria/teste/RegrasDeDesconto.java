package br.com.emanoel.livraria.teste;

import br.com.emanoel.livraria.Autor;
import br.com.emanoel.livraria.produtos.Ebook;
import br.com.emanoel.livraria.produtos.Livro;
import br.com.emanoel.livraria.produtos.LivroFisico;
import br.com.emanoel.livraria.produtos.MiniLivro;

public class RegrasDeDesconto {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        Livro fisico = new LivroFisico(autor);
        fisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setValor(29.90);

        if (!ebook.aplicaDescontoDe(0.15)) {
            System.out.println("Desconto no ebook não pode ser maior que 15%");
        } else {
            System.out.println("Valor do ebook com desconto: " + ebook.getValor());
        }

        Livro miniLivro = new MiniLivro(autor);
        miniLivro.setValor(39.90);

    }
}
