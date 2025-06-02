import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;


public class HomePage extends JFrame {
    private JComboBox<String> bookSelector;
    private JTextArea bookContent;

    public HomePage(String username) {
        setTitle("BukuIn - Pilih Buku");
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Header
        JLabel greeting = new JLabel("Selamat membaca, " + username + "!");
        greeting.setHorizontalAlignment(SwingConstants.CENTER);
        greeting.setFont(new Font("Segoe UI", Font.BOLD, 18));
        add(greeting, BorderLayout.NORTH);

        // Buku selector
        JPanel topPanel = new JPanel(new FlowLayout());
        JLabel pilihLabel = new JLabel("Pilih Buku:");
        bookSelector = new JComboBox<>(getAvailableBooks());
        JButton readButton = new JButton("Baca");

        topPanel.add(pilihLabel);
        topPanel.add(bookSelector);
        topPanel.add(readButton);
        add(topPanel, BorderLayout.CENTER);

        // Area teks isi buku
        bookContent = new JTextArea();
        bookContent.setEditable(false);
        bookContent.setLineWrap(true);
        bookContent.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(bookContent);
        add(scrollPane, BorderLayout.SOUTH);

        // Action tombol "Baca"
        readButton.addActionListener(e -> {
            String selectedBook = (String) bookSelector.getSelectedItem();
            loadBookContent(selectedBook);
        });

        setVisible(true);
    }

    private String[] getAvailableBooks() {
        File dir = new File("books");
        if (!dir.exists()) {
            dir.mkdir();
        }

        File[] bookFiles = dir.listFiles((d, name) -> name.endsWith(".txt"));
        if (bookFiles == null || bookFiles.length == 0) {
            return new String[]{"(Tidak ada buku)"};
        }

        List<String> bookNames = new ArrayList<>();
        for (File file : bookFiles) {
            bookNames.add(file.getName());
        }

        return bookNames.toArray(new String[0]);
    }

    private void loadBookContent(String filename) {
        bookContent.setText(""); // Kosongkan dulu

        if (filename == null || filename.equals("(Tidak ada buku)")) {
            bookContent.setText("Tidak ada buku yang tersedia.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader("books/" + filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                bookContent.append(line + "\n");
            }
        } catch (IOException e) {
            bookContent.setText("Gagal membaca buku.");
        }
    }
}
