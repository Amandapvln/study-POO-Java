package com.veiculo;
//Classe Carro que herda de Veiculo (Herança)

public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas){
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    //Getters e Setters (Encapsulamento)
    public int getNumeroDePortas() {
        return this.numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }
    
    //Implementação do mmétodo abstrato (Polimorfismo)
    @Override
    public void exibirDetalhes(){
        System.out.println("Carro: " + getMarca() + " " + getModelo() + " " + getAno() + " com " + numeroDePortas + " portas.");
    }
}