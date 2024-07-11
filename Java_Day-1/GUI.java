import java.util.*;

import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args) {
        
        // Name {or} String Type Input

        String name = JOptionPane.showInputDialog("Enter Name: ");
        JOptionPane.showMessageDialog(null, "Hello: " +name);

        // Age

        String age = JOptionPane.showInputDialog("Enter Age: ");
        JOptionPane.showMessageDialog(null, "Hello: " +age);

        // {or}

        int stu_age = Integer.parseInt(JOptionPane.showInputDialog("Enter the Age :"));
        JOptionPane.showMessageDialog(null,"You are : "+stu_age+" Years Old");
    }
}
