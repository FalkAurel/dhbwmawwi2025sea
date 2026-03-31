package lecture.excursion;

public class Neighbour {
  static void main() {
    Outerclass.StaticInnerClass innerClass = new Outerclass.StaticInnerClass();
    Outerclass outerclass = new Outerclass("EFN");

    outerclass.printMessageFromInnerAnonymousClass("EFN");
  }
}
