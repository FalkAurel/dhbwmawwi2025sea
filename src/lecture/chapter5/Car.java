package lecture.chapter5;


public class Car {
  protected String colour;
  private int horsePower;
  private double currentSpeed;
  private String licensePlate;

  // Konstruktoren
  public Car(String colour, int pHorsePower) {
    this.colour = colour;
    horsePower = pHorsePower;
  }

  double accelerate(double acceleration) {
    currentSpeed += acceleration;

    return currentSpeed;
  }

  void brake() {
    currentSpeed -= 10.0;
  }

  void fullBrake() {
    while (currentSpeed > 0.0) {
      brake();
    }
  }

  public String getColour() {
    return colour;
  }

  public int getHorsePower() {
    return horsePower;
  }

  public double getCurrentSpeed() {
    return currentSpeed;
  }


  public void setHorsePower(int horsePower) {
    if (horsePower < 0) {
      this.horsePower = horsePower;
    } else {
      this.horsePower = horsePower;
    }
  }


  private static boolean isAlpahbetic(char c) {
    return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
  }


  private static boolean isNumeric(char c) {
    return c >= '0' && c <= '9';
  }

  private static String stripString(String input) {
    if (input == null) {
      return null;
    }


    StringBuilder result = new StringBuilder();
    for (char c: input.toCharArray()) {
      if (c == ' ') {
        continue;
      }

      result.append(Character.toString(c));
    }

    return result.toString();
  }

  /// @param licensePlate String
  /// @return boolean true on success, false on error
  public Option setLicensePlate(String licensePlate) {
    licensePlate = stripString(licensePlate);

    // Max license plate length is AAA BB CCCC --> 9

    // AAA = Verwaltungsbezirk
    // BB = Erkennungsnummer (alphabetischer Teil)
    // CCCC = Erkennungsnummer (numerischer Teil)

    if (licensePlate == null || licensePlate.isEmpty()|| licensePlate.length() > 9) {
      return Option.some(LicensePlateError.INVALID_LENGTH);
    }

    int buchstabenCounter = 0;

    for (int i = 0; i < licensePlate.length(); i++) {
      char c = licensePlate.charAt(i);

      if  (isAlpahbetic(c) && buchstabenCounter <= 5) {
        buchstabenCounter++;
      } else {
        break;
      }
    }

    if (buchstabenCounter < 2) {
      return Option.some(LicensePlateError.TOO_FEW_CHARACTERS);
    }

    if (buchstabenCounter > 5) {
      return Option.some(LicensePlateError.TOO_MANY_CHARACTERS);
    }

    int difference = licensePlate.length() - buchstabenCounter;

    if (difference > 4) {
      return Option.some(LicensePlateError.TOO_MANY_NUMBERS);
    }

    for (int i = 0; i < difference; i++) {
      char c = licensePlate.charAt(i + buchstabenCounter);

      if (!isNumeric(c)) {
        return Option.some(LicensePlateError.TOO_FEW_NUMBERS);
      }
    }

    this.licensePlate = licensePlate;
    return Option.none();
  }




  public void setColour(String colour) {
    // Plausibilitätsprüfung


    if (colour.equals("Black") || colour.equals("White")) {
      this.colour = colour;
    } else {
      this.colour = "Schwarz";
    }
  }

}
