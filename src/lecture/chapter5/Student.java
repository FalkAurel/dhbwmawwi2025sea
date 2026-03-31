package lecture.chapter5;

public class Student {
  private int id;
  private String name;
  private String firstName;


  public void drink(float amount) {
    IO.println(firstName + " drinks " + amount + " l");
  }


  public Student(int id, String name, String firstName) {
    this.id = id;
    this.name = name;
    this.firstName = firstName;
  }

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
}
