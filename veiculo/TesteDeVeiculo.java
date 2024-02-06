package veiculo;

public class TesteDeVeiculo {
    public static void main(String[] args) {
        Veiculo moto = new Moto();
        Veiculo carro = new Carro();

        carro.acelerar();
        carro.frear();

        moto.acelerar();
        moto.frear();
    }
}
