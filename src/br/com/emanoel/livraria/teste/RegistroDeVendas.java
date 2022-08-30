package br.com.emanoel.livraria.teste;

import br.com.emanoel.livraria.Autor;
import br.com.emanoel.livraria.produtos.Ebook;
import br.com.emanoel.livraria.produtos.LivroFisico;
import br.com.emanoel.livraria.produtos.Produto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RegistroDeVendas {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);

        List<Produto> produtos = Arrays.asList(fisico, ebook);
        Collections.sort(produtos);

        for (Produto produto : produtos) {
            System.out.println(produto.getValor());
        }
    }
}
