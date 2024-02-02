public class Strings {
  public static void main(String[] args) {
    
    String original = "abcde FGHIJ ABC abc DEFG   ";

    String tudoMinusculo = original.toLowerCase();
    String tudoMaiusculo = original.toLowerCase();
    String removeEspacos = original.trim();
    String novaString = original.substring(2);
    String cortarString = original.substring(2, 9);
    String trocarUmaLetraPorOutra = original.replace("a", "x");
    String trocarUmaLetraPorOutraDeUmaSubStr = original.replace("abc", "xy");
    int primeiraPosicao = original.indexOf("bc");
    int ultimaPosicao = original.lastIndexOf("bc");
    String[] recortarEmVetor = original.split(" ");
    String parte1 = recortarEmVetor[0];
    String parte2 = recortarEmVetor[1];
    String parte3 = recortarEmVetor[2];


    System.out.println(tudoMinusculo);
    System.out.println(tudoMaiusculo);
    System.out.println(removeEspacos);
    System.out.println(novaString);
    System.out.println(cortarString);
    System.out.println(trocarUmaLetraPorOutra);
    System.out.println(trocarUmaLetraPorOutraDeUmaSubStr);
    System.out.println(primeiraPosicao);
    System.out.println(ultimaPosicao);
    System.out.println(parte1);
    System.out.println(parte2);
    System.out.println(parte3);

  }
}