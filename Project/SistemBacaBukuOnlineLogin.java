import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.util.*;
import javax.swing.*;


public class SistemBacaBukuOnlineLogin extends JFrame {
    CardLayout cl;
    JPanel panelUtama;
    LoginPanel loginPanel;
    DaftarPanel daftarPanel;
    BukuPanel bukuPanel;

    public SistemBacaBukuOnlineLogin() {
        setTitle("Sistem Baca Buku Online");
        setSize(700, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        cl = new CardLayout();
        panelUtama = new JPanel(cl);

        loginPanel = new LoginPanel();
        daftarPanel = new DaftarPanel();
        bukuPanel = new BukuPanel();

        panelUtama.add(loginPanel, "login");
        panelUtama.add(daftarPanel, "daftar");
        panelUtama.add(bukuPanel, "buku");

        add(panelUtama);
        
        // Navigasi
        loginPanel.btnLogin.addActionListener(e -> {
            String username = loginPanel.tfUsername.getText();
            String id = loginPanel.tfID.getText();
            if (cekLogin(username, id)) {
                cl.show(panelUtama, "buku");
            } else {
                JOptionPane.showMessageDialog(this, "Login gagal! Cek username dan ID.");
            }
        });

        loginPanel.btnDaftar.addActionListener(e -> cl.show(panelUtama, "daftar"));

        daftarPanel.btnSimpan.addActionListener(e -> {
            String user = daftarPanel.tfUsername.getText();
            String id = daftarPanel.tfID.getText();
            if (!user.isEmpty() && !id.isEmpty()) {
                simpanPengguna(user, id);
                JOptionPane.showMessageDialog(this, "Akun berhasil dibuat!");
                cl.show(panelUtama, "login");
            } else {
                JOptionPane.showMessageDialog(this, "Isi semua field!");
            }
        });
    }

    private boolean cekLogin(String username, String id) {
        try (Scanner sc = new Scanner(new File("pengguna.txt"))) {
            while (sc.hasNextLine()) {
                String[] data = sc.nextLine().split(",");
                if (data.length == 2 && data[0].equals(username) && data[1].equals(id)) {
                    return true;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "File pengguna tidak ditemukan.");
        }
        return false;
    }

    private void simpanPengguna(String username, String id) {
        try (FileWriter fw = new FileWriter("pengguna.txt", true)) {
            fw.write(username + "," + id + "\n");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan data pengguna.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SistemBacaBukuOnlineLogin().setVisible(true);
        });
    }

    // ================= Panel ================= //

    class LoginPanel extends JPanel {
        JTextField tfUsername, tfID;
        JButton btnLogin, btnDaftar;

        LoginPanel() {
            setLayout(new GridLayout(4, 2, 10, 10));
            setBorder(BorderFactory.createEmptyBorder(50, 150, 50, 150));
            add(new JLabel("Username:"));
            tfUsername = new JTextField();
            add(tfUsername);
            add(new JLabel("No ID Pengguna:"));
            tfID = new JTextField();
            add(tfID);
            btnLogin = new JButton("Login");
            add(btnLogin);
            btnDaftar = new JButton("Buat Akun");
            add(btnDaftar);
            
        }
    }

    class DaftarPanel extends JPanel {
        JTextField tfUsername, tfID;
        JButton btnSimpan;

        DaftarPanel() {
            setLayout(new GridLayout(3, 2, 10, 10));
            setBorder(BorderFactory.createEmptyBorder(50, 150, 50, 150));
            add(new JLabel("Username Baru:"));
            tfUsername = new JTextField();
            add(tfUsername);
            add(new JLabel("No ID Baru:"));
            tfID = new JTextField();
            add(tfID);
            btnSimpan = new JButton("Simpan Akun");
            add(btnSimpan);
        }
    }

    class BukuPanel extends JPanel {
        JList<String> daftarBuku;
        JTextArea areaBuku;
        JButton tombolBaca;
        DefaultListModel<String> modelBuku;
        String[] namaFile = {"buku1.txt", "buku2.txt"};

        BukuPanel() {
            setLayout(new BorderLayout());
            modelBuku = new DefaultListModel<>();
            for (String file : namaFile) {
                modelBuku.addElement(file);
            }

            daftarBuku = new JList<>(modelBuku);
            JScrollPane scrollList = new JScrollPane(daftarBuku);
            scrollList.setPreferredSize(new Dimension(150, 0));

            areaBuku = new JTextArea();
            areaBuku.setEditable(false);
            JScrollPane scrollText = new JScrollPane(areaBuku);

            tombolBaca = new JButton("Baca Buku");
            tombolBaca.addActionListener(e -> {
                String fileDipilih = daftarBuku.getSelectedValue();
                if (fileDipilih != null) {
                    bacaIsiBuku(fileDipilih);
                } else {
                    JOptionPane.showMessageDialog(this, "Pilih buku terlebih dahulu.");
                }
            });

            JPanel panelKiri = new JPanel(new BorderLayout());
            panelKiri.add(new JLabel("Daftar Buku:"), BorderLayout.NORTH);
            panelKiri.add(scrollList, BorderLayout.CENTER);
            panelKiri.add(tombolBaca, BorderLayout.SOUTH);

            add(panelKiri, BorderLayout.WEST);
            add(scrollText, BorderLayout.CENTER);
        }

        private void bacaIsiBuku(String namaFile) {
            try {
                String isi = new String(Files.readAllBytes(new File(namaFile).toPath()));
                areaBuku.setText(isi);
            } catch (IOException e) {
                areaBuku.setText("Gagal membaca buku: " + e.getMessage());
            }
        }
    }
}
