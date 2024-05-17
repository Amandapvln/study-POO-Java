package com.veiculo;

public class Main {
    public static void main(String[] args) {
        //Criando instâncias de Carro e Moto
        Veiculo carro = new Carro("Toyota", "Corolla", 2020, 4);
        Veiculo moto = new Moto("Harley-Daidson", "Street 750", 2019, true);

        //Exibindo detalhes dos veículos (Polimorfismo)
        carro.exibirDetalhes();
        moto.exibirDetalhes();
    }
}