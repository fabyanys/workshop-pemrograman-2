import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KalkulatorInput extends JFrame {
    JTextField tfBil1, tfBil2, tfOperator;
    JButton btnHitung, btnCancel;

    public KalkulatorInput() {
        setTitle("Kalkulator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Bil 1:"));
        tfBil1 = new JTextField();
        add(tfBil1);

        add(new JLabel("Bil 2:"));
        tfBil2 = new JTextField();
        add(tfBil2);

        add(new JLabel("Operator (+ - * /):"));
        tfOperator = new JTextField();
        add(tfOperator);

        btnHitung = new JButton("Hitung");
        btnCancel = new JButton("Cancel");
        add(btnHitung);
        add(btnCancel);

        // Event tombol
        btnHitung.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double bil1 = Double.parseDouble(tfBil1.getText());
                    double bil2 = Double.parseDouble(tfBil2.getText());
                    String op = tfOperator.getText().trim();

                    double hasil = 0;
                    boolean valid = true;

                    switch (op) {
                        case "+": hasil = bil1 + bil2; break;
                        case "-": hasil = bil1 - bil2; break;
                        case "*": hasil = bil1 * bil2; break;
                        case "/": 
                            if (bil2 != 0) hasil = bil1 / bil2; 
                            else {
                                JOptionPane.showMessageDialog(null, "Error: Pembagian dengan nol!");
                                valid = false;
                            }
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Operator tidak valid!");
                            valid = false;
                    }

                    if (valid) {
                        new KalkulatorOutput(bil1, bil2, op, hasil);
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Masukkan angka yang valid!");
                }
            }
        });

        btnCancel.addActionListener(e -> {
            tfBil1.setText("");
            tfBil2.setText("");
            tfOperator.setText("");
        });

        setLocationRelativeTo(null); // Tengah
        setVisible(true);
    }

    public static void main(String[] args) {
        new KalkulatorInput();
    }
}