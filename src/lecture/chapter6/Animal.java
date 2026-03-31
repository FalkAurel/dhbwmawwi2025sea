package lecture.chapter6;

public class Animal {
  private float weight;
  private float size;
  private String description;


  public Animal(float weight, float size, String description) {
    setWeight(weight);
    setSize(size);
    setDescription(description);
  }


  public void breath() {
    IO.println("Das Tier " + description + " atmet");
  }

  public void eat() {
    IO.println("Das Tier " + description + " isst");
  }

  public void move() {
    IO.println("Das Tier " + description + " bewegt sich");
  }

  public void setWeight(float weight) {
    this.weight = weight;
  }

  public void setSize(float size) {
    this.size = size;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
}
