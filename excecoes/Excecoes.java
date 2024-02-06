package excecoes;

import pessoa.Pessoa;

/* CHECKED = VERIFICADAS
 *  UNCHECKED =  NÃO VERIFICADAS
 *  Throws Exception = JOGA PARA A CLASSE DE CIMA 
 */ 


public class Excecoes {
  public static void main(String[] args) throws Exception {
    // try {
    //   validarNumero();
    // } catch (Exception e) {
    //   System.out.println("Deu ruim");
    //   e.printStackTrace();
    // }

    Pessoa p = null;
    p.getCpf();
    
  }
  
  public static void validarNumero() throws Exception {
    int numero = 10;
    if(numero < 100) {
      throw new Exception("O número é menor que 100!");
    }
  }
}
