import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventH {
    JFrame f;
    JPanel p;
    JLabel l;
    JTextField t;
    JButton b1, b2;

    public EventH() {
        f = new JFrame("Event Handling Program");
        f.setSize(500, 500);
        f.setLayout(new FlowLayout());

        p = new JPanel();
        p.setLayout(new FlowLayout());

        l = new JLabel("Enter text:");
        t = new JTextField(20);

        b1 = new JButton("Submit");
        b2 = new JButton("Clear");

        p.add(l);
        p.add(t);
        p.add(b1);
        p.add(b2);

        f.add(p);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = t.getText();
                JOptionPane.showMessageDialog(f, "You entered: " + text);
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText("");
            }
        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new EventH();
    }
}
