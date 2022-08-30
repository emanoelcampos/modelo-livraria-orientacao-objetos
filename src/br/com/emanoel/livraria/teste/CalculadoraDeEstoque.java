package br.com.emanoel.livraria.teste;

public class CalculadoraDeEstoque {
    public static void main(String[] args) {

        double soma = 0;

        for (int cont = 0; cont < 35; cont++){
            soma += 59.90;
        }

        System.out.println("O total em estoque é: " +soma);

        if (soma < 150 ) {
            System.out.println("Seu estoque está muito baixo!");
        } else if (soma >= 2000) {
            System.out.println("Seu estoque está muito alto!");
        } else {
            System.out.println("Seu estoque está bom.");
        }
    }
}
