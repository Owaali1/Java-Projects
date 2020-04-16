package util;//IO

import java.util.*;
import javax.swing.*;//JOtptionPane / JTextArea

public class Program4 {

    public static void main(String[] args) {
        // Message
        Scanner input = IO.getInput("Enter 2 Integears");
        int x = input.nextInt();
        int y = input.nextInt();
        if (x > 0 && y > 0) {
            // sum
            IO.showMessage(String.format("The sum is %2d ", (x + y)));
        }

        Scanner real = IO.getInput("Enter 2 Real Numbers");

        double a = real.nextFloat();
        double b = real.nextFloat();
	// prod. and quo.
        if (a < 0 && b > 0) {
            IO.showMessage(String.format("The prod. is%7.2f", (a * b)));
        } else if (a > 0 && b < 0) {
            IO.showMessage(String.format("The prod. is%7.2f", (a * b)));
        } else if (a < 0 && b < 0) {
            IO.showMessage(String.format("The Qout. is%7.2f", (a / b)));
        }
        System.exit(0);
    }

    /*
        Scanner input = IO.getInput("Enter 2 numbers");
        int x = input.nextInt();
        int y = input.nextInt();
        Scanner real = IO.getInput("Enter 2 real numbers");
        float a = real.nextFloat();
        float b = real.nextFloat();
        if (x > 0 && y > 0) {
            IO.showMessage(String.format("The sum. is%7.2f", (x + y)));
            if (a < 0 && b > 0) {
                IO.showMessage(String.format("The prod. is%7.2f", (a * b)));
            } else if (a > 0 && b < 0) {
                IO.showMessage(String.format("The prod. is%7.2f", (a * b)));
            } else if (a < 0 && b < 0) {
                IO.showMessage(String.format("The Qout. is%7.2f", (a / b)));
            }
            System.exit(0);
        }
     */
}
