package conta;

public class TesteContaBancaria {
  public static void main(String[] args) {
    ContaBancaria conta1 = new ContaBancaria();

    // conta1.numero = "312312ADWAD";
    // conta1.titular =  "Vittor";
    // conta1.saldo = 100;

    conta1.setTitular("Vittor");
    conta1.setNumero("312312ADWAD");
    // conta1.setSaldo(500);

    conta1.depositar(500);
    conta1.sacar(300);

  }
}
