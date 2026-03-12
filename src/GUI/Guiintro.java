package GUI;

import javax.swing.JOptionPane;
public class Guiintro {

    public static void main (String []args){
        String name = JOptionPane.showInputDialog("Enter a name ");
        JOptionPane.showMessageDialog(null,"You're name is "+ name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter you're age"));
        JOptionPane.showMessageDialog(null,"You are "+age+ " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height"));
        JOptionPane.showMessageDialog(null,"You are" + height+ "cm Tall");

        String name2 = JOptionPane.showInputDialog("Enter your address");
        JOptionPane.showMessageDialog(null,"Your Address is "+ name2);




    }
}
