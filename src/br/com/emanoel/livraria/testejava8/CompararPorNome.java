package br.com.emanoel.livraria.testejava8;

import br.com.emanoel.livraria.produtos.Livro;

import java.util.Comparator;

//classe substituida por classe anônima
public class CompararPorNome implements Comparator<Livro> {
    @Override
    public int compare(Livro l1, Livro l2) {
        return l1.getNome().compareTo(l2.getNome());
    }
}
