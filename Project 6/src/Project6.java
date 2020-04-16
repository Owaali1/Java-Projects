
import javax.swing.*;
import java.util.*;
import util.IO;

public class Project6 {
//avg

    public static float getAvg(int x[]) {
        float total = 0;
        for (int i = 0; i < x.length; i++) {
            total += x[i];
        }
        return total / x.length;
    }
//array

    public static String putArray(int x[]) {
        String result = " ";
        for (int i = 0; i < x.length; i++) {
            result += x[i] + " ";
        }
        return result;
    }
// highest

    public static int getHighest(int g[]) {
        int highest = g[0];
        for (int i = 1; i < g.length; i++) {
            if (g[i] > highest) {
                highest = g[i];
            }
        }
        return highest;
    }

// lowest
    public static int getLowest(int g[]) {
        int lowest = g[0];
        for (int i = 1; i < g.length; i++) {
            if (g[i] < lowest) {
                lowest = g[i];
            }
        }
        return lowest;
    }
// sorting

    public static int[] sortBubble(int x[]) {
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = 0; j < x.length - 1; j++) {
                if (x[j + 1] > x[j]) {
                    int tmp = x[j + 1];
                    x[j + 1] = x[j];
                    x[j] = tmp;
                }
            }
        }
        return x;
    }

// data
    public static int[] getData(String input) {
        StringTokenizer st = new StringTokenizer(input);
        int[] r = new int[st.countTokens()];
        for (int i = 0; st.hasMoreTokens(); i++) {
            try {
                r[i] = Integer.parseInt(st.nextToken());
            } catch (NumberFormatException nfe) {
                r[i] = 0;
                System.err.println("invalid");
            }
        }
        return r;
    }

// prints output
    public static void main(String[] args) {
        int[] x = getData(JOptionPane.showInputDialog(" " + " Enter list of Grades : "));
        String array = " Array : " + putArray(x) + "\n";
        String sorted = " Sorted : " + putArray(sortBubble(x)) + "\n";
        String avg = String.format("" + "Average %3.2f", getAvg(x));
        String highest = " Highest : " + getHighest(x) + "\n";
        String lowest = " Lowest : " + getLowest(x) + "\n";
        
        
        IO.showMessage(array + highest + lowest + sorted + avg);

    }

}
