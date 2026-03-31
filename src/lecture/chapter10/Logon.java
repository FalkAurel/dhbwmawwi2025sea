package lecture.chapter10;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.text.ParseException;

public class Logon extends JFrame {
  Logon() {
    super("Logon");

    JPanel top  = new JPanel(new FlowLayout());

    JPanel topLeft = new JPanel(new GridLayout(0, 1));
    JPanel topRight = new JPanel(new GridLayout(0, 1));


    topLeft.add(createInputPanel("User", 10));
    topLeft.add(createInputPanel("Password", 10));
    topLeft.add(createInputPanel("Host", 10));
    topLeft.add(createDropDownPanel("Art", "Item 1",  "Item 2", "Item 3", "Item 4", "Item 5"));
    topLeft.add(createNumericInputPanel("Port"));


    topRight.add(createInputPanel("Ziel", 10));
    topRight.add(createInputPanel("Quelle", 10));


    topLeft.setBorder(new TitledBorder("Verbindung"));
    topRight.setBorder(new TitledBorder("Dateien"));


    top.add(topLeft);
    top.add(topRight);

    JPanel bottom = new JPanel(new FlowLayout());

    bottom.add(new Button("OK"));
    bottom.add(new Button("Cancel"));

    this.add(top, BorderLayout.NORTH);
    this.add(bottom, BorderLayout.SOUTH);

    this.pack();
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setVisible(true);
  }

  static JPanel createInputPanel(String fieldName, int columns) {
    JPanel inputPanel = new JPanel(new GridLayout(0, 2));

    JPanel cellPanel1 = new JPanel();
    cellPanel1.setLayout(new FlowLayout(FlowLayout.CENTER));
    cellPanel1.add(new JLabel(fieldName + ": "));

    JPanel cellPanel2 = new JPanel();
    cellPanel2.setLayout(new FlowLayout(FlowLayout.CENTER));
    cellPanel2.add(new TextField(columns));

    inputPanel.add(cellPanel1);
    inputPanel.add(cellPanel2);
    return inputPanel;
  }


  static JPanel createNumericInputPanel(String fieldName) {
    JPanel inputPanel = new JPanel(new GridLayout(0, 2));

    JPanel cellPanel1 = new JPanel();
    cellPanel1.setLayout(new FlowLayout(FlowLayout.CENTER));
    cellPanel1.add(new JLabel(fieldName + ": "));

    JPanel cellPanel2 = new JPanel();
    cellPanel2.setLayout(new FlowLayout(FlowLayout.CENTER));


    try {
      MaskFormatter mask = new MaskFormatter("#####");

      JFormattedTextField field = new JFormattedTextField(mask);
      field.setColumns(5);

      cellPanel2.add(field);
    } catch (ParseException e) {
      e.printStackTrace();
    }


    inputPanel.add(cellPanel1);
    inputPanel.add(cellPanel2);
    return inputPanel;
  }

  static JPanel createDropDownPanel(String fieldName, String... fields) {
    JPanel inputPanel = new JPanel(new GridLayout(0, 2));

    JPanel cellPanel1 = new JPanel();
    cellPanel1.setLayout(new FlowLayout(FlowLayout.CENTER));
    cellPanel1.add(new JLabel(fieldName + ": "));

    JPanel cellPanel2 = new JPanel();

    JComboBox<String> comboBox = new JComboBox<String>();

    for (String field: fields) {
      comboBox.addItem(field);
    }

    cellPanel2.setLayout(new FlowLayout(FlowLayout.CENTER));
    cellPanel2.add(comboBox);

    inputPanel.add(cellPanel1);
    inputPanel.add(cellPanel2);
    return inputPanel;
  }
  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      new Logon();
    });
  }
}
