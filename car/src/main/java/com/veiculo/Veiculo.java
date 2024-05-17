package com.veiculo;
abstract class Veiculo {
    private String marca;
    private String modelo;
    protected int ano;

    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    //Getters e Setters (Encapsulamento)

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    //Método abstrato que será implemenmtado pelas subclasses
    public abstract void exibirDetalhes();
}
