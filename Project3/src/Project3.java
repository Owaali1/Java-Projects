
import javax.swing.*;
import java.util.*;

public class Project3 {

    public static float getFloat() {
        return Float.parseFloat(JOptionPane.showInputDialog("Enter 3 real numbers"));
    }

    public static void main(String[] args) {

        //String s = JOptionPane.showInputDialog("Enter 1st Real number");
        float x = getFloat();
        //s = JOptionPane.showInputDialog("Enter 2nd real number");
        float y = getFloat();
        // s = JOptionPane.showInputDialog("Enter 3rd real number");
        float z = getFloat();
        //prints sum
        if (x > 0 && y > 0 && z > 0) {
            JOptionPane.showMessageDialog(null, "All Three Numbers Are Positve Sum: " + (x + y + z));
        } else // prints product a single number is negative
        {
            if (x > 0 && y > 0 && z < 0) {
                JOptionPane.showMessageDialog(null, "First number is positive, second is positive, third is not Q: " + (x * y));
            } else if (x > 0 && y < 0 && z > 0) {
                JOptionPane.showMessageDialog(null, "First number is positive, second is not, third is positive Q: " + (x * z));
            } else if (x < 0 && y > 0 && z > 0) {
                JOptionPane.showMessageDialog(null, "First number is not, second is positive, third is positive Q: " + (y * z));
            }
        }
        //prints qout. in the console if both the numbers are negative
        Scanner input = new Scanner(System.in);
        System.out.println("Emter 2 real Numbers");
        float x1 = input.nextFloat();
        float y1 = input.nextFloat();
        if (x1 < 0 && y1 < 0) {
            System.out.printf("Both Numbers are Negative Qoutent: " + x1 / y1 + "\n");
        }
        {
            System.exit(0);
        }
    }

}

/*
  if(x>0&&y>0&&z>0)JOptionPane.showMessageDialog(null, "All Three Numbers Are Positve Sum: "+(x+y+z));{
  if(x>0 && y>0 && z<0)JOptionPane.showMessageDialog(null, "First Number was positve, Second was positive Third was not, Product:\n"+(x*y));
  else{
   JOptionPane.showMessageDialog(null,"First Number was Negative, Scond and Third were not, Product:\n "+(y*z));
 */
//}
//}


//if (x>0 && y>0 && z<0||x<0 && y>0 && z>0 || x>0 && y<0 && z>0) 
