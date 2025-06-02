import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KalkulatorInput extends JFrame {
    JTextField tfBil1, tfBil2;
    JButton btnHitung, btnCancel;
    JRadioButton rbTambah, rbKurang, rbKali, rbBagi;
    ButtonGroup groupOperator;

    public KalkulatorInput() {
        setTitle("Kalkulator");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        add(new JLabel("Bil 1:"));
        tfBil1 = new JTextField();
        add(tfBil1);

        add(new JLabel("Bil 2:"));
        tfBil2 = new JTextField();
        add(tfBil2);

        add(new JLabel("Operator:"));

        // Panel untuk radio button
        JPanel panelOperator = new JPanel(new GridLayout(1, 4));
        rbTambah = new JRadioButton("+");
        rbKurang = new JRadioButton("-");
        rbKali = new JRadioButton("*");
        rbBagi = new JRadioButton("/");

        groupOperator = new ButtonGroup();
        groupOperator.add(rbTambah);
        groupOperator.add(rbKurang);
        groupOperator.add(rbKali);
        groupOperator.add(rbBagi);

        panelOperator.add(rbTambah);
        panelOperator.add(rbKurang);
        panelOperator.add(rbKali);
        panelOperator.add(rbBagi);

        add(panelOperator);

        btnHitung = new JButton("Hitung");
        btnCancel = new JButton("Cancel");
        add(btnHitung);
        add(btnCancel);

        // Event tombol Hitung
        btnHitung.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double bil1 = Double.parseDouble(tfBil1.getText());
                    double bil2 = Double.parseDouble(tfBil2.getText());
                    String op = getSelectedOperator();

                    if (op == null) {
                        JOptionPane.showMessageDialog(null, "Pilih salah satu operator!");
                        return;
                    }

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
                    }

                    if (valid) {
                        new KalkulatorOutput(bil1, bil2, op, hasil);
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Masukkan angka yang valid!");
                }
            }
        });

        // Event tombol Cancel
        btnCancel.addActionListener(e -> {
            tfBil1.setText("");
            tfBil2.setText("");
            groupOperator.clearSelection();
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Mendapatkan operator dari radio button
    private String getSelectedOperator() {
        if (rbTambah.isSelected()) return "+";
        if (rbKurang.isSelected()) return "-";
        if (rbKali.isSelected()) return "*";
        if (rbBagi.isSelected()) return "/";
        return null;
    }

    public static void main(String[] args) {
        new KalkulatorInput();
    }
}
