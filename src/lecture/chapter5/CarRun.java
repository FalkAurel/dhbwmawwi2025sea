package lecture.chapter5;

public class CarRun {
  public static void main(String[] args) {

    String newColour = "Violet";
    Car car = new Car(newColour, 200);
    Car yourCar = new Car("yellow", 500);


    // call by reference
    newColour = "Red";

    if (50 < car.accelerate(1000.0)) {
      System.out.println("Your accelerate is too fast. This should not be possible xD");
    }
    car.fullBrake();


    if (car.setLicensePlate("SAW F 265").isSome()) {
      System.out.println("Failure");
    } else {
      System.out.println("Success");
    }
    System.out.println(yourCar.getColour());
    System.out.println(car.colour);
  }
}
