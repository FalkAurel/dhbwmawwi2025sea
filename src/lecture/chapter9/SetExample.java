package lecture.chapter9;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {
  public static void main(String[] args) {
    Set<String> cities = new TreeSet<>();

    cities.add("London");
    cities.add("Paris");
    cities.add("New York");
    cities.add("San Francisco");
    cities.add("New York");

    for (String city : cities) {
      System.out.println(city);
    }

    System.out.println("=========== Students ===========");

    Set<Student> students = new TreeSet<Student>();

    students.add(new Student(0, 0, "Ha"));
    students.add(new Student(1, 1, "Gay"));
    students.add(new Student(2, 2, "!"));

    System.out.println(students.size());
    System.out.println(students.toString());

    Set<Student> studentsByAge = new TreeSet<Student>(new SortStudentByAge());

    studentsByAge.add(new Student(0, 0, "Ha"));
    studentsByAge.add(new Student(1, 1, "Gay"));
    studentsByAge.add(new Student(2, 2, "!"));

    System.out.println(students.size());
    for (Student student : studentsByAge) {
      System.out.println(student);
    }

  }
}
