package veiculo;


//todo contrato temos que implementar
//por isso não extend
public class Carro implements Veiculo {

  @Override
  public void acelerar() {
    System.out.println("Acelerando o Carro");
    
  }
  @Override
  public void frear() {
    System.out.println("Freando o Carro");
  }

} 
