
import java.util.*;
import javax.swing.*;

public class Project2 {
    public static void main(String srgs[]) {
        String s = JOptionPane.showInputDialog("Enter 1st number");
        s = JOptionPane.showInputDialog("Enter 2nd number");
        int x = Integer.parseInt(s);
        int y = Integer.parseInt(s);
        //show the answer in the message box
        JOptionPane.showMessageDialog(null, "Sum : " + (x+y)
                + "\nDiff : " + (x - y) + "\nProd : " + (x*y) + "\nQuot : " + (x/y)
                + "\nMod : " + (x % y));
        System.out.printf("Sum :%d \nDiff : %d \nProd :%d \nQuot :%d \nMod : %d ", x+y, x-y, x, x*y, x/y, x%y);
        System.out.println("\nEnter 2 real numbers");
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        System.out.printf("\nSum:%7.2f\nDiff:%7.2f\nProd:%7.2f\n"
                + "Quot:%7.2f\nMod:%7.2f \n ", a + b, a - b, a * b, a / b, a % b);
    }

}
