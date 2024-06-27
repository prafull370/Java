import javax.swing.*;
import java.awt.*;

public class swingColor extends JFrame {
    private JPanel panel;
    private JButton colorButton;

    public swingColor() {
        setTitle("Background Color Changer");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        colorButton = new JButton("Change Color");
        colorButton.addActionListener(e -> changeBackgroundColor());

        panel.add(colorButton);
        add(panel);
        setVisible(true);
    }

    private void changeBackgroundColor() {
        Color newColor = JColorChooser.showDialog(this, "Choose a Color", panel.getBackground());
        if (newColor != null) {
            panel.setBackground(newColor);
            JOptionPane.showMessageDialog(this, "Welcome to Java Swing");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(swingColor::new);
    }
}
