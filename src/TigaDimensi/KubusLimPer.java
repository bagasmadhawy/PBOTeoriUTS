package TigaDimensi;

import DuaDimensi.Persegi;
import java.awt.event.ActionEvent;
import javax.swing.*;

public final class KubusLimPer extends Persegi {

    JFrame frame = new JFrame();
    JLabel lSisi, lLuas, lTinggiLim, lVolumeKubus, lVolumeLimPer, lLuPerKubus, lLuPerLimPer;
    JTextField tfSisi, tfLuas, tfTinggiLim, tfVolumeKubus, tfVolumeLimPer, tfLuPerKubus, tfLuPerLimPer;
    JButton btnSubmit;

    double tinggiLimas, volumeKubus, volumeLimPer, luperKubus, luperLimPer;

    public KubusLimPer() {
        //Frame
        frame.setTitle("Persegi, Kubus, dan Limas Segiempat");
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLayout(null);

        lSisi = new JLabel("Sisi");
        lTinggiLim = new JLabel("Tinggi Limas");
        lLuas = new JLabel("Luas Persegi");
        lVolumeKubus = new JLabel("Volume Kubus");
        lVolumeLimPer = new JLabel("Volume Limas");
        lLuPerKubus = new JLabel("Luas Permukaan Kubus");
        lLuPerLimPer = new JLabel("Luas Permukaan Limas");

        tfSisi = new JTextField();
        tfTinggiLim = new JTextField();
        tfLuas = new JTextField();
        tfVolumeKubus = new JTextField();
        tfVolumeLimPer = new JTextField();
        tfLuPerKubus = new JTextField();
        tfLuPerLimPer = new JTextField();

        btnSubmit = new JButton("Submit");

        frame.add(lSisi);
        frame.add(lTinggiLim);
        frame.add(lLuas);
        frame.add(lVolumeKubus);
        frame.add(lLuPerKubus);
        frame.add(lVolumeLimPer);
        frame.add(lLuPerLimPer);
        frame.add(tfSisi);
        frame.add(tfTinggiLim);
        frame.add(tfLuas);
        frame.add(tfVolumeKubus);
        frame.add(tfLuPerKubus);
        frame.add(tfVolumeLimPer);
        frame.add(tfLuPerLimPer);
        frame.add(btnSubmit);

        lSisi.setBounds(50, 50, 150, 20);
        lTinggiLim.setBounds(50, 80, 150, 20);
        lLuas.setBounds(50, 140, 150, 20);
        lVolumeKubus.setBounds(50, 170, 150, 20);
        lLuPerKubus.setBounds(50, 230, 150, 20);
        lVolumeLimPer.setBounds(50, 200, 150, 20);
        lLuPerLimPer.setBounds(50, 260, 150, 20);
        tfSisi.setBounds(200, 50, 150, 20);
        tfTinggiLim.setBounds(200, 80, 150, 20);
        tfLuas.setBounds(200, 140, 150, 20);
        tfVolumeKubus.setBounds(200, 170, 150, 20);
        tfLuPerKubus.setBounds(200, 230, 150, 20);
        tfVolumeLimPer.setBounds(200, 200, 150, 20);
        tfLuPerLimPer.setBounds(200, 260, 150, 20);
        btnSubmit.setBounds(50, 110, 100, 20);

        tfLuas.setEditable(false);
        tfVolumeKubus.setEditable(false);
        tfLuPerKubus.setEditable(false);
        tfVolumeLimPer.setEditable(false);
        tfLuPerLimPer.setEditable(false);

        btnSubmit.addActionListener((ActionEvent e) -> {
            try {
                sisi = Double.parseDouble(tfSisi.getText());
                tinggiLimas = Double.parseDouble(tfTinggiLim.getText());
                getLuas();
                String l = String.valueOf(luas);
                tfLuas.setText(l);
                getVolumeKubus();
                String vK = String.valueOf(volumeKubus);
                tfVolumeKubus.setText(vK);
                getLuperKubus();
                String lpK = String.valueOf(luperKubus);
                tfLuPerKubus.setText(lpK);
                getVolumeLimPer();
                String vL = String.valueOf(volumeLimPer);
                tfVolumeLimPer.setText(vL);
                getLuperLimPer();
                String lpL = String.valueOf(luperLimPer);
                tfLuPerLimPer.setText(lpL);
            } catch (Exception ex) {
                tfSisi.setText("");
                tfLuas.setText("");
                tfVolumeKubus.setText("");
                tfLuPerKubus.setText("");
                tfVolumeLimPer.setText("");
                tfLuPerLimPer.setText("");
                JOptionPane.showMessageDialog(frame, "Isi Belum Sesuai!!!");
            }
        });

    }

    public double getVolumeKubus() {
        volumeKubus = sisi * sisi * sisi;
        return volumeKubus;
    }

    public void setVolumeKubus(double volumeKubus) {
        this.volumeKubus = volumeKubus;
    }

    public double getLuperKubus() {
        luperKubus = 6 * sisi * sisi;
        return luperKubus;
    }

    public void setLuperKubus(double luperKubus) {
        this.luperKubus = luperKubus;
    }

    public double getVolumeLimPer() {
        volumeLimPer = sisi * sisi * tinggiLimas / 3;
        return volumeLimPer;
    }

    public void setVolumeLimPer(double volumeLimPer) {
        this.volumeLimPer = volumeLimPer;
    }

    public double getLuperLimPer() {
        luperLimPer = (sisi * sisi) + (2 * sisi * tinggiLimas);
        return luperLimPer;
    }

    public void setLuperLimPer(double luperLimPer) {
        this.luperLimPer = luperLimPer;
    }

    public double getTinggiLimPer() {
        return tinggiLimas;
    }

    public void getTinggiLimPer(double tinggiLimas) {
        this.tinggiLimas = tinggiLimas;
    }
}
