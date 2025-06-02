import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FormInput extends JFrame {
    JTextField tfNama, tfProdi, tfNRP;
    JButton btnOk, btnClear;

    public FormInput() {
        setTitle("F-1");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Nama:"));
        tfNama = new JTextField();
        add(tfNama);

        add(new JLabel("Prodi:"));
        tfProdi = new JTextField();
        add(tfProdi);

        add(new JLabel("NRP:"));
        tfNRP = new JTextField();
        add(tfNRP);

        btnOk = new JButton("OK");
        btnClear = new JButton("CLEAR");
        add(btnOk);
        add(btnClear);

        // Action button
        btnOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = tfNama.getText();
                String prodi = tfProdi.getText();
                String nrp = tfNRP.getText();
                new FormOutput(nama, prodi, nrp);
            }
        });

        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tfNama.setText("");
                tfProdi.setText("");
                tfNRP.setText("");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new FormInput();
    }
}
