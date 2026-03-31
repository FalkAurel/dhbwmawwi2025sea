package lecture.chapter9;

public class Student implements Comparable<Student> {
  private int id;
  private int age;
  private String name;

  public Student(int id, int age, String name) {
    this.id = id;
    this.age = age;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student [id=" + id + ", age=" + age + ", name=" + name + "]";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (o == null) {
      return false;
    }

    if (getClass() != o.getClass()) {
      return false;
    }

    Student student = (Student) o;
    if (id != student.id) {
      return false;
    }
    if (age != student.age) {
      return false;
    }

    return this.name.equals(student.name);
  }

  @Override
  public int compareTo(Student o) {
    if (!this.name.equals(o.name)) {
      return this.name.compareTo(o.name);
    }

    return this.age - o.age;
  }
}
