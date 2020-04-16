package util;

import java.awt.Font;
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.JTextArea;

public class IO {
    // Input

    public static Scanner getInput(String promte) {
        return new Scanner(JOptionPane.showInputDialog(promte));
    }
    // Message + " "

    public static void showMessage(String s) {
        System.out.println(s);
        JOptionPane.showMessageDialog(null, s);
    }
    // Text Editor

    public static void showMessage2(String s) {
        JTextArea color = new JTextArea(s);
        color.setFont(new Font("MonoType Corsiva", Font.PLAIN, 72));
        JOptionPane.showMessageDialog(color, null);
    }
    // console Message and Input

    public static Scanner getConsoleInput(String promte) {
        System.out.println(promte);
        return new Scanner(System.in);
        //return new Scanner (System.out.println(promte));
    }
}
