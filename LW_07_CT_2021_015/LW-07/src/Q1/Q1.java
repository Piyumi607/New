package Q1;

import javax.swing.*;

public class Q1 {
    public static void main(String[] args) {
       String input1= JOptionPane.showInputDialog("Enter the first no:");
       int Num1=Integer.parseInt(input1);

        String input2= JOptionPane.showInputDialog("Enter the Second no:");
        int Num2=Integer.parseInt(input2);

        String input3= JOptionPane.showInputDialog("Enter the Third no:");
        int Num3=Integer.parseInt(input3);

        int sum=Num1 + Num2 + Num3;
        JOptionPane.showMessageDialog(null,"The sum of the three integer is: "+sum);
    }
}
