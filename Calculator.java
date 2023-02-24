import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator {
   private JFrame mainFrame;
   private JTextField inputField;
   private JButton buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonEquals, buttonClear;

   public Calculator() {
      prepareGUI();
   }

   public static void main(String[] args) {
      Calculator calculator = new Calculator();
      calculator.showEvent();
   }

   private void prepareGUI() {
      mainFrame = new JFrame("Calculator");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(5, 1));

      inputField = new JTextField(16);
      inputField.setEditable(true);

      buttonAdd = new JButton("+");
      buttonSubtract = new JButton("-");
      buttonMultiply = new JButton("*");
      buttonDivide = new JButton("/");
      buttonEquals = new JButton("=");
      buttonClear = new JButton("Clear");

      mainFrame.add(inputField);
      mainFrame.add(buttonAdd);
      mainFrame.add(buttonSubtract);
      mainFrame.add(buttonMultiply);
      mainFrame.add(buttonDivide);
      mainFrame.add(buttonEquals);
      mainFrame.add(buttonClear);

      mainFrame.setVisible(true);
   }

   private void showEvent() {
      buttonAdd.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // add logic here
         }
      });
      buttonSubtract.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // subtract logic here
         }
      });
      buttonMultiply.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // multiply logic here
         }
      });
      buttonDivide.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // divide logic here
         }
      });
      buttonEquals.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // equals logic here
         }
      });
      buttonClear.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // clear logic here
         }
      });
   }
}
