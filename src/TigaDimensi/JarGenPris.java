package TigaDimensi;

import DuaDimensi.JajarGenjang;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class JarGenPris extends JajarGenjang {

    JFrame frame = new JFrame();
    JLabel lAlas, lTinggi, lSisiMiring, lTinggiPrisma, lLuas, lVolume, lLuPer;
    JTextField tfAlas, tfTinggi, tfSisiMiring, tfTinggiPrisma, tfLuas, tfVolume, tfLuPer;
    JButton btnSubmit;

    double volume, luper, tinggiPrisma;

    public JarGenPris() {
        //Frame
        frame.setTitle("Jajar Genjang, dan Prisma Jajar Genjang");
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLayout(null);

        lAlas = new JLabel("Alas");
        lTinggi = new JLabel("Tinggi");
        lSisiMiring = new JLabel("Sisi Miring");
        lTinggiPrisma = new JLabel("Tinggi Prisma");
        lLuas = new JLabel("Luas Jajar Genjang");
        lVolume = new JLabel("Volume Prisma");
        lLuPer = new JLabel("Luas Permukaan Prisma");

        tfAlas = new JTextField();
        tfTinggi = new JTextField();
        tfSisiMiring = new JTextField();
        tfTinggiPrisma = new JTextField();
        tfLuas = new JTextField();
        tfVolume = new JTextField();
        tfLuPer = new JTextField();

        btnSubmit = new JButton("Submit");

        frame.add(lAlas);
        frame.add(lTinggi);
        frame.add(lSisiMiring);
        frame.add(lTinggiPrisma);
        frame.add(lLuas);
        frame.add(lVolume);
        frame.add(lLuPer);
        frame.add(tfAlas);
        frame.add(tfTinggi);
        frame.add(tfSisiMiring);
        frame.add(tfTinggiPrisma);
        frame.add(tfLuas);
        frame.add(tfVolume);
        frame.add(tfLuPer);
        frame.add(btnSubmit);

        lAlas.setBounds(50, 50, 150, 20);
        lTinggi.setBounds(50, 80, 150, 20);
        lSisiMiring.setBounds(50, 110, 150, 20);
        lTinggiPrisma.setBounds(50, 140, 150, 20);
        lLuas.setBounds(50, 200, 150, 20);
        lVolume.setBounds(50, 230, 150, 20);
        lLuPer.setBounds(50, 260, 150, 20);
        tfAlas.setBounds(200, 50, 150, 20);
        tfTinggi.setBounds(200, 80, 150, 20);
        tfSisiMiring.setBounds(200, 110, 150, 20);
        tfTinggiPrisma.setBounds(200, 140, 150, 20);
        tfLuas.setBounds(200, 200, 150, 20);
        tfVolume.setBounds(200, 230, 150, 20);
        tfLuPer.setBounds(200, 260, 150, 20);
        btnSubmit.setBounds(50, 170, 100, 20);

        tfLuas.setEditable(false);
        tfVolume.setEditable(false);
        tfLuPer.setEditable(false);

        btnSubmit.addActionListener((ActionEvent e) -> {
            try {
                alas = Double.parseDouble(tfAlas.getText());
                tinggi = Double.parseDouble(tfTinggi.getText());
                sisiMiring = Double.parseDouble(tfSisiMiring.getText());
                tinggiPrisma = Double.parseDouble(tfTinggiPrisma.getText());
                getLuas();
                String l = String.valueOf(luas);
                tfLuas.setText(l);
                getVolume();
                String v = String.valueOf(volume);
                tfVolume.setText(v);
                getLuper();
                String lp = String.valueOf(luper);
                tfLuPer.setText(lp);
            } catch (Exception ex) {
                tfAlas.setText("");
                tfTinggi.setText("");
                tfSisiMiring.setText("");
                tfTinggiPrisma.setText("");
                tfLuas.setText("");
                tfVolume.setText("");
                tfLuPer.setText("");
                JOptionPane.showMessageDialog(frame, "Isi Belum Sesuai!!!");
            }
        });

    }

    public double getVolume() {
        volume = alas * tinggi * tinggiPrisma;
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getLuper() {
        luper = (2 * alas * tinggi) + ((2 * (alas + sisiMiring)) * tinggiPrisma);
        return luper;
    }

    public void setLuper(double luper) {
        this.luper = luper;
    }

    public double getTinggiPrisma() {
        return tinggiPrisma;
    }

    public void setTinggiPrisma(double tinggiPrisma) {
        this.tinggiPrisma = tinggiPrisma;
    }
}
