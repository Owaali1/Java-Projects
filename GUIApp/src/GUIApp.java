
import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class GUIApp extends JFrame {

    StudentList list = new StudentList();

    // a frame is a container
    class StudentPanel extends JPanel {

        public void paintComponent(Graphics g) {

            super.paintComponent(g);

            g.setColor(Color.green);
            g.setFont(new Font("Monotype Corsiva", Font.ITALIC, 64));
            g.drawString(" Names", 2, 60);
            g.drawString(" Grades", 300, 60);
            for (int i = 0; i < list.length(); i++) {
                Student tmp = list.get(i);
                g.drawString(tmp.name, 20, 120 + 60 * i);
                g.drawString(tmp.grade + "", 340, 120 + 60 * i);

            }
            if (list.length() > 0) {
                g.drawString(String.format("Lowest : %2d", list.getLowest()), 20, 300 + list.length() * 60);
            }
            if (list.length() > 0) {
                g.drawString(String.format("Highest : %2d", list.getHigh()), 20, 225 + list.length() * 60);
            }

            if (list.length() > 0) {
                g.drawString(String.format("Avg : %1.2f ", list.getAvg()), 20, 150 + list.length() * 60);
            }

        }

    }

    //constructor
    public GUIApp() {
        super("Super Duper Gui App");
        // 3 things for menus
        // JMenuBar
        JMenuBar jmb = new JMenuBar();
        setJMenuBar(jmb);
        // Menu and Menu items
        JMenu jm = jmb.add(new JMenu("File"));
        JMenuItem jmi = jm.add(new JMenuItem("New...", 'N'));
        jmi.addActionListener(e -> {
            String input = JOptionPane.showInputDialog(GUIApp.this, "Enter on or more Students");
            if (input != null) {
                list.newData(input);
                repaint();

            }

        });

        jmi = jm.add(new JMenuItem("Add...", 'A'));
        jmi.addActionListener(e -> {
            String input = JOptionPane.showInputDialog(GUIApp.this, "Enter on or more Students");
            if (input != null) {
                list.addData(input);
                repaint();
            }

        });
        jm.addSeparator();
        jmi = jm.add(new JMenuItem("Exit", 'X'));
        //sort menu
        jm = jmb.add(new JMenu("Sort"));
        jmi = jm.add(new JMenuItem("Names", 'N'));

        jmi.addActionListener(e -> {
            list.sortbyName();
            repaint();

        });
        jmi = jm.add(new JMenuItem("Grade", 'G'));
        jmi.addActionListener(e -> {
            list.sortbyGrade();
            repaint();
        });
        //help menu
        jm = jmb.add(new JMenu("Help"));
        jmi = jm.add(new JMenuItem("About", 'A'));
        //java 8 introduced lambda expressions
        //a short way to do event handlers
        jmi.addActionListener(e
                -> JOptionPane.showMessageDialog(GUIApp.this,
                        new JLabel("<html><big><center>"
                                + "That Program v0.1<br>"
                                + "Copyright \u00a9 2016 Owais Ali <br>"
                                + "All rights reserved.</center></big></html>"),
                        "About", JOptionPane.PLAIN_MESSAGE
                ));
        this.add(new StudentPanel());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(1200, 100, 400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GUIApp();

    }

}
