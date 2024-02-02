package pessoa;


public class TesteDePessoa {
  
  public static void main(String[] args) {
    // instanciando => inicializar  
    Pessoa pessoa1 = new Pessoa();

    pessoa1.setName("Vittor"); 
    pessoa1.setIdade(10);
    pessoa1.setCpf("3232132");

    System.out.println(pessoa1.imprimirDadosDaPessoa());

    Pessoa pessoa2 = new Pessoa();

    pessoa2.setName("Ramos"); 
    pessoa2.setIdade(10);
    pessoa2.setCpf("3232132");

    System.out.println(pessoa2.imprimirDadosDaPessoa());
  }
  
}