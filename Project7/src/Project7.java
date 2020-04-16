
import util.IO;
import javax.swing.*;
import java.util.*;

public class Project7 {
    // avg

    public static float getAvg(int x[]) {
        float sum = 0.0f;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum / x.length;
    }
// array

    public static String showArray(String names[], int x[]) {
        String result = "";
        for (int i = 0; i < x.length; i++) {
            result += names[i] + "    " + x[i] + "\n";
        }
        return result;
    }
// hightest

    public static int getHighest(int x[]) {
        int hi = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] > hi) {
                hi = x[i];
            }
        }
        return hi;
    }
//lowest

    public static int getLowest(int x[]) {
        int Low = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] < Low) {
                Low = x[i];
            }
        }
        return Low;
    }
// print the data in the string

    public static int[] getData(String input) {
        String[] data = input.split("\\s+");
        int[] x = new int[data.length / 2];
        for (int i = 0; i < x.length; i++) {
            try {
                x[i] = Integer.parseInt(data[2 * i + 1]);
            } catch (NumberFormatException nfe) {
                x[i] = 0;
                System.err.println("invalid input");
                System.err.println(nfe.getMessage());
            }
        }
        return x;

    }

    public static String[] getNames(String input) {
        String[] data = input.split("\\s+");
        String[] x = new String[data.length / 2];
        for (int i = 0; i < x.length; i++) {
            x[i] = (data[2 * i]);

        }
        return x;

    }

    public static int[] getGrades(String input) {
        String[] data = input.split("\\s+");
        int[] x = new int[data.length / 2];
        for (int i = 0; i < x.length; i++) {
            try {
                x[i] = Integer.parseInt(data[2 * i + 1]);
            } catch (NumberFormatException nfe) {
                x[i] = 0;
                System.err.println("invalid input");
                System.err.println(nfe.getMessage());
            }
        }
        return x;

    }

//prints the grades in desending order
    public static void sortBubbleGrades(int[] grades) {
        for (int i = 0; i < grades.length - 1; i++) {
            for (int j = 0; j < grades.length - 1; j++) {
                if (grades[j + 1] > grades[j]) {
                    int temp = grades[j + 1];
                    grades[j + 1] = grades[j];
                    grades[j] = temp;

                }

            }
        }
    }

    /*
    public static void sortAlpBubble(String names[]) {

        int j;
        boolean flag = true;
        String tmp;
        while (flag) {
            flag = false;
            for (j = 0; j < names.length - 1; j++) {
                if (names[j + 1].compareTo(names[j]) > 0) {
                    tmp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tmp;
                    flag = true;

                }
            }

        }
     */
    public static void sortbubbleName(String names[]) {
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - 1; j++) {
                if (names[j + 1].compareTo(names[j]) < 0) {
                    String tmp = names[j + 1];
                    names[j + 1] = names[j];
                    names[j] = tmp;

                }
            }
        }
    }

    public static void main(String[] args) {
        String input = (JOptionPane.showInputDialog("Enter one or more grades"));
        int[] grades = getGrades(input);
        String[] names = getNames(input);
        sortBubbleGrades(grades);
        sortbubbleName(names);
        String output = "\nGrade Order:\n" + showArray(names, grades) + "\nName Order:\n" + showArray(names, grades);
        output
                +=//"Grade Order:\n" + showArray(names, grades)
                //+ "\nName Order:\n"+ showArray(names,grades)
                String.format("\nAvg: ") + getAvg(grades)
                + "\nHighest: " + getHighest(grades)
                + "\nLowest: " + getLowest(grades);

        IO.showMessage(output);
    }
}
