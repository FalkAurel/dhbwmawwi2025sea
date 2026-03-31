package lecture.chapter9;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapExample {
  public static void main(String[] args) {
    Map<Integer, String> cities = new HashMap<Integer, String>();

    cities.put(69190, "Walldorf");
    cities.put(47051, "Duisburg");
    cities.put(12359, "Neu-Köln");

    System.out.println(cities.get(69190));
    System.out.println(cities.containsKey(12359));

    cities.remove(69190);

    cities.put(12359, "Overwritten Neu-Köln");

    Set<Integer> keys = cities.keySet();
    for (Integer key : keys) {
      System.out.println(key + " " + cities.get(key));
    }
  }
}
