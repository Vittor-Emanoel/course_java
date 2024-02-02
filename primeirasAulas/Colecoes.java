package primeirasAulas;
import java.util.HashMap;
import java.util.Map;

public class Colecoes {
  
  public static void main(String[] args) {
    Map<String, Integer> notas = new HashMap<>();

    notas.put("Vittor", 10);
    notas.put("Emanoel", 10);
    notas.put("Ramos", 10);

    for(Map.Entry<String, Integer> entry : notas.entrySet()) {
      String nome = entry.getKey();
      Integer nota = entry.getValue();

      System.out.println("O aluno(a) "+ nome + " tirou: " +  nota);
    }


  }

}
