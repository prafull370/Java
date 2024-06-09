import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverterGUI extends JFrame {
    private JLabel inputLabel;
    private JTextField inputField;
    private JRadioButton fahrenheitRadio;
    private JRadioButton celsiusRadio;
    private JButton convertButton;
    private JLabel resultLabel;

    public TemperatureConverterGUI() {
        setTitle("Temperature Converter");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initUI();
    }

    private void initUI() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 1));

        inputLabel = new JLabel("Enter temperature:");
        inputField = new JTextField();
        fahrenheitRadio = new JRadioButton("Fahrenheit to Celsius");
        celsiusRadio = new JRadioButton("Celsius to Fahrenheit");
        convertButton = new JButton("Convert");
        resultLabel = new JLabel();

        ButtonGroup group = new ButtonGroup();
        group.add(fahrenheitRadio);
        group.add(celsiusRadio);
        fahrenheitRadio.setSelected(true); // Default selection

        mainPanel.add(inputLabel);
        mainPanel.add(inputField);
        mainPanel.add(fahrenheitRadio);
        mainPanel.add(celsiusRadio);
        mainPanel.add(convertButton);
        mainPanel.add(resultLabel);

        add(mainPanel);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertTemperature();
            }
        });
    }

    private void convertTemperature() {
        try {
            double temperature = Double.parseDouble(inputField.getText());

            if (fahrenheitRadio.isSelected()) {
                double celsius = (temperature - 32) * 5 / 9;
                resultLabel.setText("Converted Temperature: " + celsius + " °C");
            } else if (celsiusRadio.isSelected()) {
                double fahrenheit = (temperature * 9 / 5) + 32;
                resultLabel.setText("Converted Temperature: " + fahrenheit + " °F");
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input. Please enter a valid temperature.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TemperatureConverterGUI gui = new TemperatureConverterGUI();
                gui.setVisible(true);
            }
        });
    }
}
