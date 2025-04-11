// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// public class NumberSystemConverterGUI extends JFrame implements ActionListener {
//     JComboBox<String> choiceBox;
//     JTextField inputField, outputField;
//     JButton convertButton;

//     public NumberSystemConverterGUI() {
//         setTitle("Number System Converter");
//         setSize(400, 250);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLocationRelativeTo(null);
//         setLayout(new GridLayout(5, 1));

//         String[] options = {
//             "Decimal to Binary",
//             "Decimal to Octal",
//             "Decimal to Hex",
//             "Binary to Decimal",
//             "Octal to Decimal",
//             "Hex to Decimal"
//         };

//         choiceBox = new JComboBox<>(options);
//         inputField = new JTextField();
//         outputField = new JTextField();
//         outputField.setEditable(false);
//         convertButton = new JButton("Convert");

//         add(new JLabel("Select Conversion:"));
//         add(choiceBox);
//         add(new JLabel("Enter Input:"));
//         add(inputField);
//         add(convertButton);
//         add(new JLabel("Output:"));
//         add(outputField);

//         convertButton.addActionListener(this);
//     }

//     public void actionPerformed(ActionEvent e) {
//         String input = inputField.getText().trim();
//         String selected = (String) choiceBox.getSelectedItem();

//         try {
//             switch (selected) {
//                 case "Decimal to Binary":
//                     outputField.setText(Integer.toBinaryString(Integer.parseInt(input)));
//                     break;
//                 case "Decimal to Octal":
//                     outputField.setText(Integer.toOctalString(Integer.parseInt(input)));
//                     break;
//                 case "Decimal to Hex":
//                     outputField.setText(Integer.toHexString(Integer.parseInt(input)).toUpperCase());
//                     break;
//                 case "Binary to Decimal":
//                     outputField.setText(Integer.toString(Integer.parseInt(input, 2)));
//                     break;
//                 case "Octal to Decimal":
//                     outputField.setText(Integer.toString(Integer.parseInt(input, 8)));
//                     break;
//                 case "Hex to Decimal":
//                     outputField.setText(Integer.toString(Integer.parseInt(input, 16)));
//                     break;
//                 default:
//                     outputField.setText("Invalid Choice");
//             }
//         } catch (NumberFormatException ex) {
//             outputField.setText("Invalid Input!");
//         }
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> {
//             new NumberSystemConverterGUI().setVisible(true);
//         });
//     }
// }


// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// public class FriendlyNumberSystemConverter extends JFrame implements ActionListener {
//     JComboBox<String> conversionOptions;
//     JTextField inputField, outputField;
//     JButton convertButton, clearButton;

//     public FriendlyNumberSystemConverter() {
//         setTitle("Number System Converter");
//         setSize(450, 300);
//         setLocationRelativeTo(null);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new GridBagLayout());

//         GridBagConstraints gbc = new GridBagConstraints();
//         gbc.insets = new Insets(10, 10, 10, 10);

//         JLabel heading = new JLabel("Number System Converter");
//         heading.setFont(new Font("Arial", Font.BOLD, 18));
//         gbc.gridx = 0;
//         gbc.gridy = 0;
//         gbc.gridwidth = 2;
//         add(heading, gbc);

//         gbc.gridwidth = 1;

//         gbc.gridx = 0;
//         gbc.gridy = 1;
//         add(new JLabel("Choose Conversion:"), gbc);

//         String[] options = {
//             "Decimal to Binary",
//             "Decimal to Octal",
//             "Decimal to Hex",
//             "Binary to Decimal",
//             "Octal to Decimal",
//             "Hex to Decimal"
//         };

//         conversionOptions = new JComboBox<>(options);
//         gbc.gridx = 1;
//         add(conversionOptions, gbc);

//         gbc.gridx = 0;
//         gbc.gridy = 2;
//         add(new JLabel("Enter Input:"), gbc);

//         inputField = new JTextField(15);
//         gbc.gridx = 1;
//         add(inputField, gbc);

//         gbc.gridx = 0;
//         gbc.gridy = 3;
//         add(new JLabel("Output:"), gbc);

//         outputField = new JTextField(15);
//         outputField.setEditable(false);
//         gbc.gridx = 1;
//         add(outputField, gbc);

//         convertButton = new JButton("Convert");
//         clearButton = new JButton("Clear");

//         gbc.gridx = 0;
//         gbc.gridy = 4;
//         add(convertButton, gbc);
//         gbc.gridx = 1;
//         add(clearButton, gbc);

//         convertButton.addActionListener(this);
//         clearButton.addActionListener(e -> {
//             inputField.setText("");
//             outputField.setText("");
//         });
//     }

//     public void actionPerformed(ActionEvent e) {
//         String input = inputField.getText().trim();
//         String selected = (String) conversionOptions.getSelectedItem();

//         try {
//             switch (selected) {
//                 case "Decimal to Binary":
//                     outputField.setText(Integer.toBinaryString(Integer.parseInt(input)));
//                     break;
//                 case "Decimal to Octal":
//                     outputField.setText(Integer.toOctalString(Integer.parseInt(input)));
//                     break;
//                 case "Decimal to Hex":
//                     outputField.setText(Integer.toHexString(Integer.parseInt(input)).toUpperCase());
//                     break;
//                 case "Binary to Decimal":
//                     outputField.setText(Integer.toString(Integer.parseInt(input, 2)));
//                     break;
//                 case "Octal to Decimal":
//                     outputField.setText(Integer.toString(Integer.parseInt(input, 8)));
//                     break;
//                 case "Hex to Decimal":
//                     outputField.setText(Integer.toString(Integer.parseInt(input, 16)));
//                     break;
//                 default:
//                     outputField.setText("Invalid Choice");
//             }
//         } catch (NumberFormatException ex) {
//             JOptionPane.showMessageDialog(this, "Invalid input! Please check the number format.", "Error", JOptionPane.ERROR_MESSAGE);
//         }
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> {
//             new FriendlyNumberSystemConverter().setVisible(true);
//         });
//     }
// }



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberSystemConverterTheme extends JFrame implements ActionListener {
    JComboBox<String> conversionOptions;
    JTextField inputField, outputField;
    JButton convertButton, clearButton, themeButton;
    boolean darkMode = false;

    public NumberSystemConverterTheme() {
        setTitle("Number System Converter");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);

        JLabel heading = new JLabel("Number System Converter");
        heading.setFont(new Font("Arial", Font.BOLD, 18));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(heading, gbc);
        gbc.gridwidth = 1;

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Choose Conversion:"), gbc);

        String[] options = {
            "Decimal to Binary",
            "Decimal to Octal",
            "Decimal to Hex",
            "Binary to Decimal",
            "Octal to Decimal",
            "Hex to Decimal"
        };

        conversionOptions = new JComboBox<>(options);
        gbc.gridx = 1;
        add(conversionOptions, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Enter Input:"), gbc);

        inputField = new JTextField(15);
        gbc.gridx = 1;
        add(inputField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new JLabel("Output:"), gbc);

        outputField = new JTextField(15);
        outputField.setEditable(false);
        gbc.gridx = 1;
        add(outputField, gbc);

        convertButton = new JButton("Convert");
        clearButton = new JButton("Clear");
        themeButton = new JButton("Dark Mode");

        gbc.gridx = 0;
        gbc.gridy = 4;
        add(convertButton, gbc);
        gbc.gridx = 1;
        add(clearButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        add(themeButton, gbc);

        convertButton.addActionListener(this);
        clearButton.addActionListener(e -> {
            inputField.setText("");
            outputField.setText("");
        });
        themeButton.addActionListener(e -> toggleTheme());
    }

    public void actionPerformed(ActionEvent e) {
        String input = inputField.getText().trim();
        String selected = (String) conversionOptions.getSelectedItem();

        try {
            switch (selected) {
                case "Decimal to Binary":
                    outputField.setText(Integer.toBinaryString(Integer.parseInt(input)));
                    break;
                case "Decimal to Octal":
                    outputField.setText(Integer.toOctalString(Integer.parseInt(input)));
                    break;
                case "Decimal to Hex":
                    outputField.setText(Integer.toHexString(Integer.parseInt(input)).toUpperCase());
                    break;
                case "Binary to Decimal":
                    outputField.setText(Integer.toString(Integer.parseInt(input, 2)));
                    break;
                case "Octal to Decimal":
                    outputField.setText(Integer.toString(Integer.parseInt(input, 8)));
                    break;
                case "Hex to Decimal":
                    outputField.setText(Integer.toString(Integer.parseInt(input, 16)));
                    break;
                default:
                    outputField.setText("Invalid Choice");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input! Please check the number format.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void toggleTheme() {
        darkMode = !darkMode;

        Color bgColor = darkMode ? Color.DARK_GRAY : Color.WHITE;
        Color fgColor = darkMode ? Color.WHITE : Color.BLACK;
        Color fieldBg = darkMode ? new Color(60, 63, 65) : Color.WHITE;

        getContentPane().setBackground(bgColor);

        for (Component c : getContentPane().getComponents()) {
            c.setForeground(fgColor);
            c.setBackground(bgColor);

            if (c instanceof JTextField || c instanceof JComboBox) {
                c.setBackground(fieldBg);
                c.setForeground(fgColor);
            }

            if (c instanceof JButton) {
                c.setBackground(darkMode ? new Color(100, 100, 100) : new JButton().getBackground());
                c.setForeground(fgColor);
            }
        }

        themeButton.setText(darkMode ? "Light Mode" : "Dark Mode");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new NumberSystemConverterTheme().setVisible(true);
        });
    }
}
