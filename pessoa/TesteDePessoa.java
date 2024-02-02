package pessoa;


public class TesteDePessoa {
  
  public static void main(String[] args) {
    // instanciando => inicializar  
    Pessoa pessoa1 = new Pessoa();

    pessoa1.name = "vittor";
    pessoa1.idade = 10;
    pessoa1.cpf = "3232132";

    System.out.println(pessoa1.imprimirDadosDaPessoa());

    Pessoa pessoa2 = new Pessoa();

    pessoa2.name = "ramos";
    pessoa2.idade = 10;
    pessoa2.cpf = "3232132";

    System.out.println(pessoa2.imprimirDadosDaPessoa());
  }
  
}