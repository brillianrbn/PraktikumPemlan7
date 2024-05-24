package PraktikumPemlan7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.JTextComponent;

public class RegistrationForm extends JFrame {
    
    JTextField nama, tanggalLahir, nomorPendaftaran, alamat, noTlpn, email;
    JButton submit;

    public RegistrationForm() {
        setLayout(null);

        nama = new JTextField();
        tanggalLahir = new JTextField();
        nomorPendaftaran = new JTextField();
        noTlpn = new JTextField();
        alamat = new JTextField();
        email = new JTextField();
        submit = new JButton("Submit");

        add(createLabel("Nama Lengkap", 50, 30));
        add(nama);
        nama.setBounds(150, 30, 200, 25);

        add(createLabel("Tanggal Lahir", 50, 70));
        add(tanggalLahir);
        tanggalLahir.setBounds(150, 70, 200, 25);

        add(createLabel("No. Pendaftaran", 50, 110));
        add(nomorPendaftaran);
        nomorPendaftaran.setBounds(150, 110, 200, 25);

        add(createLabel("No. Telp", 50, 150));
        add(noTlpn);
        noTlpn.setBounds(150, 150, 200, 25);

        add(createLabel("Alamat", 50, 190));
        add(alamat);
        alamat.setBounds(150, 190, 200, 25);

        add(createLabel("E-mail", 50, 230));
        add(email);
        email.setBounds(150, 230, 200, 25);

        add(submit);
        submit.setBounds(150, 270, 100, 30);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Submit();
            }
        });

        setSize(400, 400);
        setTitle("Form Registrasi Mahasiswa Baru");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
    }

    private JLabel createLabel(String text, int x, int y) {
        JLabel label = new JLabel(text);
        label.setBounds(x, y, 100, 25);
        return label;
    }

    private void Submit() {
        JTextComponent[] dataMhsw = {nama, tanggalLahir, nomorPendaftaran, noTlpn, alamat, email};
        
        for (JTextComponent data : dataMhsw) {
            if (data.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Semua kolom harus diisi.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        int response = JOptionPane.showConfirmDialog(this, "Apakah anda yakin data yang Anda isi sudah benar?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);

        if (response == JOptionPane.OK_OPTION) {
            SubmitAction overlay = new SubmitAction(nama.getText(), tanggalLahir.getText(), nomorPendaftaran.getText(), noTlpn.getText(), alamat.getText(), email.getText());
            overlay.setSize(400, 300);
            overlay.setLocationRelativeTo(null); 
            overlay.setVisible(true);
        }
    }
}