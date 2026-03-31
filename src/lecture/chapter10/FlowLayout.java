package lecture.chapter10;

import javax.swing.*;

public class FlowLayout extends JFrame {
  public FlowLayout() {
    super("FlowLayout");

    this.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 5));

    this.add(new JLabel("Bitte den Namen eingeben: "));
    this.add(new JTextField(20));
    this.add(new JButton("OK"));

    this.pack();
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setVisible(true);
  }


  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      new FlowLayout();
    });
  }
}
