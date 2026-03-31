package lecture.chapter9;

public class CompareAndEqualsAndHashCode {
  public static void main(String[] args) {
    Student s1 = new Student(0, 19, "Markus Söder");
    Student s2 = new Student(1, 19, "Alice Weidel");
    Student s3 = new Student(2, 19, "Bob Smith");
    Student s4 = s1;

    System.out.println("compareTo - Vergleich:");
    System.out.println("S1 compareTo S2: " + s1.compareTo(s2));
    System.out.println("S1 compareTo S3: " + s1.compareTo(s3));
    System.out.println("S1 compareTo S4: " + s1.compareTo(s4));

    System.out.println("equals - Vergleich:");
    System.out.println("S1 equals S2: " + s1.equals(s2));
    System.out.println("S1 equals S3: " + s1.equals(s3));
    System.out.println("S1 equals S4: " + s1.equals(s4));

    String string1 = "Ha";
    String string2 = "Alice";

    System.out.println(string1.equals(string2));

  }
}
