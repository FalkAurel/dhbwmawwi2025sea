package lecture.excursion;

public class Outerclass {
  private static final int STATIC_ID = 42;
  private final String instanceID;

  Outerclass(String instanceID) {
    this.instanceID = instanceID;
  }


  static class StaticInnerClass {
    public static void printStaticID() {
      System.out.println("Message from Static Inner Class: " + STATIC_ID);
    }

    public void printMessage(String message) {
      System.out.println("Message from Static Inner Class: " + message + getClass());
    }
  }

  // Innere Element Klasse
  public class InnerElementClass {
    public void printMessage(String message) {
      System.out.println("Message from InnerElementClass: " + message  + " - " + instanceID + getClass());
    }
  }

  // Inner Local Class
  public void printFromInnerLocalClass(String message) {
    class InnerLocalClass {
      public void printMessage(String message) {
        System.out.println("Message from InnerLocalClass: " + message + " - " + instanceID + getClass());
      }
    }

    InnerLocalClass innerLocalClass = new InnerLocalClass();
    innerLocalClass.printMessage(message);
  }

  // InnereAnonymeKlasse
  @FunctionalInterface
  static interface Printable {
    void printMessage(String message);
  }

  public void printMessageFromInnerAnonymousClass(String message) {
    Printable printable = new Printable() {
      public void printMessage(String message) {
        System.out.println("Message from InnerAnonymousClass: " + message + " - " + instanceID + STATIC_ID + getClass());
      }
    };
    printable.printMessage(message);
  }

  public void printPrintableUsingLambda(String message) {
    Printable lambda_printable = (String print_message) -> System.out.println("Printing using a Lambda function: " + print_message + " - " + getClass().getName());

    lambda_printable.printMessage(message);
  }

  public static void main(String[] args) {
    StaticInnerClass.printStaticID();

    Outerclass.StaticInnerClass innerClass = new Outerclass.StaticInnerClass();
    innerClass.printMessage("Gay");

    // Braucht den Kontext der Instanz
    Outerclass outerclass = new Outerclass("100");
    InnerElementClass innerElementClass = outerclass.new InnerElementClass();
    innerElementClass.printMessage("Hay");
    outerclass.printFromInnerLocalClass("Jay");
    outerclass.printMessageFromInnerAnonymousClass("Nay");
    outerclass.printPrintableUsingLambda("Zesty");

  }
}
