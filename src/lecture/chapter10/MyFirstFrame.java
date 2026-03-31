package lecture.chapter10;

import javax.swing.*;

public class MyFirstFrame {
  public static void main(String[] args) {
    JFrame frame = new JFrame();

    frame.add(new JLabel("Hello World!"));
    frame.add(new JButton("Aus"));

    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
