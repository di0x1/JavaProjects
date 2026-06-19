package Oo.DesafioHeranca;

public class Carro {

    int carro;

    void Acelerar() {

        carro += 5;

    }

    void frear() {

        if (carro >= 5) {

            carro -= 5;
        }else{

            carro = 0;
        }

    }

    public String toString() {
        return "Velocidade do carro atual: " + carro;
    }

}