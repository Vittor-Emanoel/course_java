import java.util.HashSet;

public class ColecaoHashSet {
  public static void main(String[] args) {
    //array ?????
    HashSet<Integer> numbers = new HashSet<>();

    numbers.add(10);
    numbers.add(11);
    numbers.add(12);
    numbers.add(13);

    for(Integer element : numbers ) {
      System.out.println(element);
    }

    //hasOwnProperty ??
    System.out.println(numbers.contains(10));

    //lenght???? que começa no 1 != do obj
    System.out.println(numbers.size());




  }
}