package lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExampleFrame extends JFrame  {
  public GridLayoutExampleFrame() {
    super("GridLayoutExampleFrame");

    this.setLayout(new GridLayout(0, 3));

    this.add(new JLabel("Bitte den Namen eingeben: "));
    this.add(new JTextField(20));
    this.add(new JButton("OK"));
    this.add(new JButton("OK"));
    this.add(new JButton("OK"));
    this.add(new JButton("OK"));
    this.add(new JButton("OK"));
    this.add(new JButton("OK"));
    this.add(new JButton("OK"));
    this.add(new JButton("OK"));
    this.add(new JButton("OK"));
    this.add(new JButton("OK"));
    this.add(new JButton("OK"));
    this.add(new JButton("OK"));
    this.add(new JButton("OK"));
    this.add(new JButton("OK"));
    this.add(new JButton("OK"));
    this.add(new JButton("OK"));
    this.add(new JButton("OK"));
    this.add(new JButton("OK"));
    this.add(new JButton("OK"));
    this.add(new JButton("OK"));
    this.add(new JButton("OK"));
    this.add(new JButton("OK"));
    this.add(new JButton("OK"));
    this.add(new JButton("OK"));
    this.add(new JButton("OK"));

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {new GridLayoutExampleFrame();});
  }
}
