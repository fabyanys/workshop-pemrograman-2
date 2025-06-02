import java.awt.*;
import javax.swing.*;

public class LoginPage extends JFrame {
    JTextField usernameField;
    JPasswordField passwordField;

    public LoginPage() {
        setTitle("BukuIn - Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));

        usernameField = new JTextField();
        passwordField = new JPasswordField();

        panel.add(new JLabel("Username:"));
        panel.add(usernameField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);

        JButton loginButton = new JButton("Log In");
        JButton registerButton = new JButton("Buat Akun Baru");

        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (UserStorage.validateUser(username, password)) {
                new HomePage(username).setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Login gagal! Username atau password salah.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        registerButton.addActionListener(e -> {
            new RegisterPage().setVisible(true);
            dispose();
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(loginButton);
        buttonPanel.add(registerButton);

        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        setVisible(true);
    }
}
