import java.awt.*;
import javax.swing.*;

public class KalkulatorOutput extends JFrame {

    public KalkulatorOutput(double bil1, double bil2, String operator, double hasil) {
        setTitle("Hasil");
        setSize(250, 120);
        setLayout(new GridLayout(2, 1));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel labelOperasi = new JLabel("Operasi: " + bil1 + " " + operator + " " + bil2);
        JLabel labelHasil = new JLabel("Hasil: " + hasil);

        add(labelOperasi);
        add(labelHasil);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
