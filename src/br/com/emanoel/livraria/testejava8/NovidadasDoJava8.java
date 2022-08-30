package br.com.emanoel.livraria.testejava8;

import br.com.emanoel.livraria.Autor;
import br.com.emanoel.livraria.produtos.Livro;
import br.com.emanoel.livraria.produtos.LivroFisico;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

public class NovidadasDoJava8 {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        Livro java8 = new LivroFisico(autor);
        java8.setNome("Java 8 Prático");

        Livro javaoo = new LivroFisico(autor);
        javaoo.setNome("Java O.O.");

        Livro ruby = new LivroFisico(autor);
        ruby.setNome("Livro de Ruby");

        List<Livro> livros = Arrays.asList(ruby, javaoo, java8);

        /*Simplificando comparação substituindo a classe CompararPorNome que
        implementava a interface Comparator com classes anônimas, lambda e
        method reference:

        Collections.sort(livros, new CompararPorNome());

        Collections.sort(livros, new Comparator<Livro>() {
            @Override
            public int compare(Livro l1, Livro l2) {
                return l1.getNome().compareTo(l2.getNome());
            }
        });

        livros.sort(new Comparator<Livro>() {
            @Override
            public int compare(Livro l1, Livro l2) {
                return l1.getNome().compareTo(l2.getNome());
            }
        });

        livros.sort((Livro l1, Livro l2) -> {
           return l1.getNome().compareTo(l2.getNome());
        });

        livros.sort((l1, l2) -> l1.getNome().compareTo(l2.getNome()));


        livros.sort(comparing(l -> l.getNome()));*/

        livros.sort(comparing(Livro::getNome));

        for (Livro livro : livros) {
            System.out.println(livro.getNome());
        }
        //livros.forEach(l -> System.out.println(l.getNome()));

        System.out.println("--");

        /*Simplificando com Stream:
        List<Livro> filtrados = new ArrayList<>();

        for(Livro livro :livros) {
            if (livro.getNome().contains("Java")) {
                filtrados.add(livro);
            }
        }
        for (Livro livro: filtrados) {
            System.out.println(livro.getNome());
        }

        Stream<Livro> stream = livros.stream();
        livros.stream().filter(l -> l.getNome().contains("Java"));*/

        livros.stream()
                .filter(l -> l.getNome().contains("Java"))
                .forEach(l -> System.out.println(l.getNome()));

    }
}
