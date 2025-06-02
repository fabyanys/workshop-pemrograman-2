import java.awt.*;
import javax.swing.*;

public class FormOutput extends JFrame {

    public FormOutput(String nama, String prodi, String nrp) {
        setTitle("F-2");
        setSize(250, 150);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 1));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        add(new JLabel("Nama: " + nama));
        add(new JLabel("Prodi: " + prodi));
        add(new JLabel("NRP: " + nrp));

        setVisible(true);
    }
}
