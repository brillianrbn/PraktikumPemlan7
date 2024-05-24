package PraktikumPemlan7;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class SubmitAction extends JFrame {
    public SubmitAction(String nama, String tanggalLahir, String nomorPendaftaran, String noTlpn, String alamat, String email) {
        setTitle("Data Mahasiswa");
        setLayout(new BorderLayout());

        JLabel judul = new JLabel("Data Mahasiswa", SwingConstants.CENTER);
        judul.setOpaque(true);
        judul.setBackground(new Color(30, 144, 255));
        judul.setForeground(Color.WHITE);
        judul.setFont(new Font("Times New Roman", Font.BOLD, 18));
        judul.setPreferredSize(new Dimension(400, 50));
        add(judul, BorderLayout.NORTH);

        JTextArea textArea = new JTextArea();
        textArea.setText("Nama\t\t : " + nama + "\n" + 
                        "Tanggal Lahir\t\t : " + tanggalLahir + "\n" + 
                        "No. Pendaftaran\t : " + nomorPendaftaran + "\n" + 
                        "No. Telp\t\t : " + noTlpn + "\n" + 
                        "Alamat\t\t : " + alamat + "\n" +
                        "E-mail\t\t : " + email);
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        textArea.setBackground(new Color(224, 255, 255)); 
        textArea.setForeground(new Color(25, 25, 112)); 
        textArea.setBorder(new LineBorder(new Color(100, 149, 237), 2));
        textArea.setEditable(false);
        add(textArea, BorderLayout.CENTER);

        JButton closeButton = new JButton("Close");
        closeButton.setFont(new Font("Arial", Font.BOLD, 14));
        closeButton.setBackground(new Color(70, 130, 180));
        closeButton.setForeground(Color.WHITE);
        closeButton.addActionListener(e -> dispose());

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(closeButton);
        buttonPanel.setBackground(new Color(224, 255, 255));
        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}