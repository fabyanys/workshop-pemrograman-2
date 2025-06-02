import java.awt.event.*;
import javax.swing.*;

public class pendahuluan9_1 extends JFrame {
    private JLabel label1;
    private JPasswordField tf1;
    private JButton b1;

    public pendahuluan9_1() {
        // Set judul jendela
        setTitle("Lihat Password");
        setSize(500, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Komponen label
        label1 = new JLabel("masukkan password anda");
        label1.setBounds(30, 100, 200, 25);
        add(label1);

        // Komponen password field
        tf1 = new JPasswordField();
        tf1.setBounds(180, 100, 100, 25);
        add(tf1);

        // Komponen tombol
        b1 = new JButton("lihat password");
        b1.setBounds(290, 100, 120, 25);
        add(b1);

        // Event ketika tombol diklik
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String password = new String(tf1.getPassword());
                JOptionPane.showMessageDialog(null, "password anda adalah " + password);
            }
        });

        // Tampilkan frame
        setVisible(true);
    }

    public static void main(String[] args) {
        new pendahuluan9_1();
    }
}
