package br.com.emanoel.livraria.produtos;

import br.com.emanoel.livraria.Autor;

public class MiniLivro extends Livro {

    public MiniLivro(Autor autor) {
        super(autor);
    }


    public boolean aplicaDescontoDe(double porcentagem) {
        return false;
    }

}
