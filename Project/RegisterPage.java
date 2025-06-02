import java.awt.*;
import javax.swing.*;

public class RegisterPage extends JFrame {
    public RegisterPage() {
        setTitle("BukuIn - Register");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();

        JButton registerButton = new JButton("Register");

        registerButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            UserStorage.saveUser(username, password);
            JOptionPane.showMessageDialog(this, "Akun berhasil dibuat!");
            new LoginPage();
            dispose();
        });

        JPanel panel = new JPanel(new GridLayout(4, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
        panel.add(new JLabel("Username:"));
        panel.add(usernameField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);

        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(registerButton, BorderLayout.SOUTH);

        setVisible(true);
    }
}
