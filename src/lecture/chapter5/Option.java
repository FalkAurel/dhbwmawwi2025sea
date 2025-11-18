package lecture.chapter5;

public enum Option {
  NONE,
  SOME;

  private LicensePlateError carError;

  public static Option none() {
    return NONE;
  }

  public static Option some(LicensePlateError carError) {
    Option option = SOME;
    option.carError = carError;
    return option;
  }

  public boolean isSome() {
    return this == SOME;
  }

  public boolean isNone() {
    return this == NONE;
  }

  public LicensePlateError getValue() {
    if (isNone()) {
      throw new IllegalStateException("Cannot get value from None option");
    }
    return carError;
  }
}