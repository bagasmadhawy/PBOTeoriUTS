package TigaDimensi;

import DuaDimensi.Lingkaran;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class TaKeBo extends Lingkaran {

    JFrame frame = new JFrame();
    JLabel lJari, lTinggiTabung, lTinggiKerucut, lLuas, lVolumeBola, lVolumeTabung, lVolumeKerucut, lLuPerBola, lLuPerTabung, lLuPerKerucut;
    JTextField tfJari, tfTinggiTabung, tfTinggiKerucut, tfLuas, tfVolumeBola, tfVolumeTabung, tfVolumeKerucut, tfLuPerBola, tfLuPerTabung, tfLuPerKerucut;
    JButton btnSubmit;

    double tinggiTabung, tinggiKerucut, volumeBola, volumeTabung, volumeKerucut, luperBola, luperTabung, luperKerucut, s;

    public TaKeBo() {
        //Frame
        frame.setTitle("Lingkaran, Bola, Tabung, dan Kerucut");
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLayout(null);

        lJari = new JLabel("Jari-Jari");
        lTinggiTabung = new JLabel("Tinggi Tabung");
        lTinggiKerucut = new JLabel("Tinggi Kerucut");
        lLuas = new JLabel("Luas Lingkaran");
        lVolumeBola = new JLabel("Volume Bola");
        lVolumeTabung = new JLabel("Volume Tabung");
        lVolumeKerucut = new JLabel("Volume Kerucut");
        lLuPerBola = new JLabel("Luas Permukaan Bola");
        lLuPerTabung = new JLabel("Luas Permukaan Tabung");
        lLuPerKerucut = new JLabel("Luas Permukaan Kerucut");

        tfJari = new JTextField();
        tfTinggiTabung = new JTextField();
        tfTinggiKerucut = new JTextField();
        tfLuas = new JTextField();
        tfVolumeBola = new JTextField();
        tfVolumeTabung = new JTextField();
        tfVolumeKerucut = new JTextField();
        tfLuPerBola = new JTextField();
        tfLuPerTabung = new JTextField();
        tfLuPerKerucut = new JTextField();

        btnSubmit = new JButton("Submit");

        frame.add(lJari);
        frame.add(lTinggiTabung);
        frame.add(lTinggiKerucut);
        frame.add(lLuas);
        frame.add(lVolumeBola);
        frame.add(lVolumeTabung);
        frame.add(lVolumeKerucut);
        frame.add(lLuPerBola);
        frame.add(lLuPerTabung);
        frame.add(lLuPerKerucut);
        frame.add(tfJari);
        frame.add(tfTinggiTabung);
        frame.add(tfTinggiKerucut);
        frame.add(tfLuas);
        frame.add(tfVolumeBola);
        frame.add(tfVolumeTabung);
        frame.add(tfVolumeKerucut);
        frame.add(tfLuPerBola);
        frame.add(tfLuPerTabung);
        frame.add(tfLuPerKerucut);
        frame.add(btnSubmit);

        lJari.setBounds(50, 50, 150, 20);
        lTinggiTabung.setBounds(50, 80, 150, 20);
        lTinggiKerucut.setBounds(50, 110, 150, 20);
        lLuas.setBounds(50, 170, 150, 20);
        lVolumeBola.setBounds(50, 200, 150, 20);
        lVolumeTabung.setBounds(50, 230, 150, 20);
        lVolumeKerucut.setBounds(50, 260, 150, 20);
        lLuPerBola.setBounds(50, 290, 150, 20);
        lLuPerTabung.setBounds(50, 320, 150, 20);
        lLuPerKerucut.setBounds(50, 350, 150, 20);
        tfJari.setBounds(200, 50, 150, 20);
        tfTinggiTabung.setBounds(200, 80, 150, 20);
        tfTinggiKerucut.setBounds(200, 110, 150, 20);
        tfLuas.setBounds(200, 170, 150, 20);
        tfVolumeBola.setBounds(200, 200, 150, 20);
        tfVolumeTabung.setBounds(200, 230, 150, 20);
        tfVolumeKerucut.setBounds(200, 260, 150, 20);
        tfLuPerBola.setBounds(200, 290, 150, 20);
        tfLuPerTabung.setBounds(200, 320, 150, 20);
        tfLuPerKerucut.setBounds(200, 350, 150, 20);
        btnSubmit.setBounds(50, 140, 100, 20);

        tfLuas.setEditable(false);
        tfVolumeBola.setEditable(false);
        tfVolumeTabung.setEditable(false);
        tfVolumeKerucut.setEditable(false);
        tfLuPerBola.setEditable(false);
        tfLuPerTabung.setEditable(false);
        tfLuPerKerucut.setEditable(false);

        btnSubmit.addActionListener((ActionEvent e) -> {
            try {
                jari = Double.parseDouble(tfJari.getText());
                tinggiTabung = Double.parseDouble(tfTinggiTabung.getText());
                tinggiKerucut = Double.parseDouble(tfTinggiKerucut.getText());
                getLuas();
                String l = String.valueOf(luas);
                tfLuas.setText(l);
                getVolumeBola();
                String vB = String.valueOf(volumeBola);
                tfVolumeBola.setText(vB);
                getVolumeTabung();
                String vT = String.valueOf(volumeTabung);
                tfVolumeTabung.setText(vT);
                getVolumeKerucut();
                String vK = String.valueOf(volumeKerucut);
                tfVolumeKerucut.setText(vK);
                getLuperBola();
                String lpB = String.valueOf(luperBola);
                tfLuPerBola.setText(lpB);
                getLuperTabung();
                String lpT = String.valueOf(luperTabung);
                tfLuPerTabung.setText(lpT);
                getLuperKerucut();
                String lpK = String.valueOf(luperKerucut);
                tfLuPerKerucut.setText(lpK);
            } catch (Exception ex) {
                tfJari.setText("");
                tfTinggiTabung.setText("");
                tfTinggiKerucut.setText("");
                tfLuas.setText("");
                tfVolumeBola.setText("");
                tfVolumeTabung.setText("");
                tfVolumeKerucut.setText("");
                tfLuPerBola.setText("");
                tfLuPerTabung.setText("");
                tfLuPerKerucut.setText("");
                JOptionPane.showMessageDialog(frame, "Isi Belum Sesuai!!!");
            }
        });
    }

    public double getVolumeBola() {
        volumeBola = 3.14 * jari * jari * jari * 4 / 3;
        return volumeBola;
    }

    public void setVolumeBola(double volumeBola) {
        this.volumeBola = volumeBola;
    }

    public double getVolumeTabung() {
        volumeTabung = 3.14 * jari * jari * tinggiTabung;
        return volumeTabung;
    }

    public void setVolumeTabung(double volumeTabung) {
        this.volumeTabung = volumeTabung;
    }

    public double getVolumeKerucut() {
        volumeKerucut = 3.14 * jari * jari * tinggiKerucut / 3;
        return volumeKerucut;
    }

    public void setVolumeKerucut(double volumeKerucut) {
        this.volumeKerucut = volumeKerucut;
    }

    public double getLuperBola() {
        luperBola = 4 * 3.14 * jari * jari;
        return luperBola;
    }

    public void setLuperBola(double luperBola) {
        this.luperBola = luperBola;
    }

    public double getLuperTabung() {
        luperTabung = 2 * 3.14 * jari * (jari + tinggiTabung);
        return luperTabung;
    }

    public void setLuperTabung(double luperTabung) {
        this.luperTabung = luperTabung;
    }

    public double getLuperKerucut() {
        s = Math.sqrt(Math.pow(jari, 2) + Math.pow(tinggiKerucut, 2));
        luperKerucut = 3.14 * jari * (jari + s);
        return luperKerucut;
    }

    public void setLuperKerucut(double luperKerucut) {
        this.luperKerucut = luperKerucut;
    }

    public double getTinggiTabung() {
        return tinggiTabung;
    }

    public void setTinggiTabung(double tinggiTabung) {
        this.tinggiTabung = tinggiTabung;
    }

    public double getTinggiKerucut() {
        return tinggiKerucut;
    }

    public void setTinggiKerucut(double tinggiKerucut) {
        this.tinggiKerucut = tinggiKerucut;
    }
}
