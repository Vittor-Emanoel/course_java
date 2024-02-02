import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {
      //Lista
      List<String> nomes = new ArrayList<>();

      nomes.add("Vittor");
      nomes.add("Emanoel");
      nomes.add("Ramos");
      nomes.add("Silva");

      System.out.println(nomes.get(2));
      
      //percorrer - tipo um map?? (lembrando que não estou falando do funcionamento por debaixo dos panos)
      // for(String nome : nomes) {
      //   System.out.println("nome é :" + nome);
      // }


      //percorrer 
      nomes.forEach(nome -> System.out.println("forEach" + nome));

      //mais concisa = met de ref
      nomes.forEach(System.out::println);


    }
}
