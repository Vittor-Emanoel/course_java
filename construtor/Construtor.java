package construtor;

/*
 *  INICIALIZAR A VARIAVEIS
 *  AS VEZES POSSO CRIAR PARA FAZER ALGUMA AÇÃO QUANDO A INSTANCIA FOR CRIADA, POR EXEMPLO
 * 
 */
public class Construtor {

  private int numero;

  public Construtor(int numero, String texto) {
    this.numero = numero;
  }  
  
  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }
}
