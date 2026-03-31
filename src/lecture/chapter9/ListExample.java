package lecture.chapter9;
import java.util.ArrayList;
import java.util.Iterator;


public class ListExample {
  public static void main(String[] args) {
    ArrayList<String> fruits = new ArrayList<>();

    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");
    fruits.add(1, "Watermelon");
    fruits.add("Pear");
    fruits.add("Strawberry");

    for (String current_fruit : fruits) {
      System.out.println(current_fruit);
    }

    Iterator<String> iterator = fruits.iterator();

    while (iterator.hasNext()) {
      String current_fruit = iterator.next();
      System.out.println(current_fruit);
    }
  }
}
