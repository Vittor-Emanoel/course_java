package pessoa;

public class Professor extends Pessoa {

  private double salario;

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  String imprimirDadosDaPessoa() {
    return "você é professor e recebe: "  + salario;
  }
  
}
