package lecture.chapter6;

public class Dog extends Animal {
  private String breed;

  public Dog(float weight, float size, String description, String breed) {
    super(weight, size, description);
    setBreed(breed);
  }


  public void barke() {
    IO.println("Der Hund: " + this.getDescription() + " bellt! *wauwau*");
  }

  public void eat() {
    IO.println("Der Hund: " + this.getDescription() + " isst fleisch");
  }

  public void eat(float amount) {
    eat();
    IO.println("Der Hund: " + amount + " isst fleisch");
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public String getBreed() {
    return breed;
  }
}
