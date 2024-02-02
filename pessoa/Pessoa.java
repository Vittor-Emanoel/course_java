 package pessoa;

 public class Pessoa {
   private String nome;
   private int idade;
   private String cpf;

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }
  public int getIdade() {
    return idade;
  }
  public void setName(String nome) {
    this.nome = nome;
  }
  public String getName() {
    return nome;
  }

  String imprimirDadosDaPessoa() {
    return "O nome da pessoa é "  + nome;
  }
}