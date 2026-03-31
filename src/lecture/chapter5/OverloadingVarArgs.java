package lecture.chapter5;

public class OverloadingVarArgs {
  public static void main(String[] args) {
    IO.println(sum(1, 2, 3));
  }

  public static int sum(int... numbers) {
    int cum_sum = 0;

    for (int number : numbers) {
      cum_sum += number;
    }

    return cum_sum;
  }
}
