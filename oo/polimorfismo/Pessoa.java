package oo.polimorfismo;

public class Pessoa {
//Peso em Kg
    private double peso = 0;

    public  Pessoa(double pesoInicial){
        this.peso = pesoInicial;
    }

    public double getPeso(){
        return peso;
    }

    public  void comer(Comida comida){
        this.peso += comida.getPeso();
    }

}
