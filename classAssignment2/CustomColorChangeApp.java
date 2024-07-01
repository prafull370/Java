import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomColorChangeApp {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JTextField textField;
    JButton setColorButton, resetColorButton;

    public CustomColorChangeApp() {
        frame = new JFrame("Custom Color Change Program");
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        label = new JLabel("Enter color name (e.g., red, blue):");
        textField = new JTextField(20);

        setColorButton = new JButton("Set Color");
        resetColorButton = new JButton("Reset Color");

        panel.add(label);
        panel.add(textField);
        panel.add(setColorButton);
        panel.add(resetColorButton);

        frame.add(panel);

        setColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String colorName = textField.getText().trim().toLowerCase();
                Color color = getColorFromName(colorName);
                if (color != null) {
                    textField.setBackground(color);
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid color name!");
                }
            }
        });

        resetColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setBackground(Color.WHITE);
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private Color getColorFromName(String colorName) {
        try {
            return (Color) Color.class.getField(colorName).get(null);
        } catch (Exception e) {
            return null; // Color name not found or invalid
        }
    }

    public static void main(String[] args) {
        new CustomColorChangeApp();
    }
}
