package lecture.chapter6;

public class MyLittleFarm {
  public static void main(String[] args) {
    Animal animal = new Animal(10.0f, 15.5f, "Jannes");

    animal.eat();
    animal.breath();
    animal.move();


    Dog dog = new Dog(76, 23.0f, "Bello", "Schäferhund");

    dog.eat();
    dog.breath();

    dog.eat(100);

    dog.move();

    dog.barke();

     byte test = 120;
     byte test2 = 15;

     for (int i = 0; i < test2; i++) {
       test++;
     }

    // 127 + 128 = (127 + 1) + 127 = -128 + 127 = -1
    IO.println(test);
  }
}
