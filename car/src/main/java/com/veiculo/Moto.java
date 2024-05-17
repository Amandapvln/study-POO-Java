package com.veiculo;
// Classe Moto que herda de Veiculo (Herança)
class Moto extends Veiculo{
    private boolean temSidecar;

    public Moto(String marca, String modelo, int ano, boolean temSidecar){
        super(marca, modelo, ano);
        this.temSidecar = temSidecar;
    }

    //Getters e Setters (Encapsulamento)
    public boolean isTemSidecar() {
        return this.temSidecar;
    }

    public boolean getTemSidecar() {
        return this.temSidecar;
    }

    public void setTemSidecar(boolean temSidecar) {
        this.temSidecar = temSidecar;
    }

    //Iplementação do método abstrato (Poliorfismo)
    @Override
    public void exibirDetalhes(){
        System.out.println("Moto: " + getMarca() + " " + getModelo() + " "  + getAno() + (temSidecar ? " com sidecar." : " sem sidecar."));
    }

}
