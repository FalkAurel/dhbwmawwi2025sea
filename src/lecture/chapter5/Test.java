package lecture.chapter5;

public enum Test {
  MERCEDES("$$$"),
  BMW("$$$"),
  FORD("$"),
  TESLA("$$");

  private final String value;

  // Konstruktor (muss private sein oder weggelassen werden → dann automatisch private)
  Test(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}
