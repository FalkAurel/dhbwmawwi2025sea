package lecture.chapter9;

import java.util.ArrayList;
import java.util.List;

public class SortJavaList {
  public static void main(String[] args) {
    List<Student> students = new ArrayList<Student>();
    students.add(new Student(1000, 1000, "1000"));
    students.add(new Student(100, 100, "100"));

    students.sort(new SortStudentByAge());
    System.out.println(students);
  }

}
