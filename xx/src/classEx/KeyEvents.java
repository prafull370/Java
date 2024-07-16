package assignment;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEvents extends JFrame implements ActionListener {
    JFrame f;
    JLabel l;
    JTextField t1;
    JButton b1;
    JButton b2;
    JButton b3;

    public ActionLIstner() {
        f = new JFrame("Swing Components Example");
        f.setSize(600, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        l = new JLabel("Swing Component");
        l.setBounds(50, 50, 200, 30);
        f.add(l);

        t1 = new JTextField(20);
        t1.setBounds(50, 100, 200, 30);
        f.add(t1);

        b1 = new JButton("Button 1");
        b1.setBounds(50, 150, 100, 30);
        b1.addActionListener(this);
        f.add(b1);

        b2 = new JButton("Button 2");
        b2.setBounds(200, 150, 100, 30);
        b2.addActionListener(this);
        f.add(b2);

        b3 = new JButton("Button 3");
        b3.setBounds(350, 150, 100, 30);
        b3.addActionListener(this);
        f.add(b3);

        f.setLayout(null);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == b1) {
            JOptionPane.showMessageDialog(f, "Alert Box");
        } else if (obj == b2) {
            String s = JOptionPane.showInputDialog(f, "Enter Value");
            t1.setText(s);
        } else if (obj == b3) {
            int option = JOptionPane.showConfirmDialog(f, "Confirm Box", "OK or Cancel", JOptionPane.INFORMATION_MESSAGE);
            if (option == JOptionPane.OK_OPTION) {
                System.out.println("User clicked OK");
            } else if (option == JOptionPane.CANCEL_OPTION) {
                System.out.println("User clicked Cancel");
            }
        }
    }

    public static void main(String[] args) {
        new ActionLIstner();
    }
}