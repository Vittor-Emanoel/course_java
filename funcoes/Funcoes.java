package funcoes;

import java.util.Scanner;

/* RECEBE 3 VALORES E IMPRIME O MAIOR
 * 
 * 
 */
public class Funcoes {
  public static void main(String[] args) {
      
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter three numbers");
  int a = sc.nextInt();
  int b = sc.nextInt();
  int c = sc.nextInt();

  int higher = returnHigherNumber(a,b,c);
  showResult(higher);

  sc.close();
  }

  public static int returnHigherNumber(int a, int b, int c)  {
      int aux;

      if(a > b && a > c) {
         aux = a;
        }else if (b > c){
          aux = b;
        } else {
          aux = c;
        }

      return aux;
  }

  public static void showResult(int value) {
    System.out.println("Higher = " + value);
  }

}
