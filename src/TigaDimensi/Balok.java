package TigaDimensi;

import DuaDimensi.PersegiPanjang;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Balok extends PersegiPanjang {

    JFrame frame = new JFrame();
    JLabel lPanjang, lLebar, lTinggi, lLuas, lVolume, lLuPer;
    JTextField tfPanjang, tfLebar, tfTinggi, tfLuas, tfVolume, tfLuPer;
    JButton btnSubmit;

    double volume, luper, tinggi;

    public Balok() {
        //Frame
        frame.setTitle("Persegi Panjang, dan Balok");
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLayout(null);

        lPanjang = new JLabel("Panjang");
        lLebar = new JLabel("Lebar");
        lTinggi = new JLabel("Tinggi");
        lLuas = new JLabel("Luas Persegi Panjang");
        lVolume = new JLabel("Volume Balok");
        lLuPer = new JLabel("Luas Permukaan Balok");

        tfPanjang = new JTextField();
        tfLebar = new JTextField();
        tfTinggi = new JTextField();
        tfLuas = new JTextField();
        tfVolume = new JTextField();
        tfLuPer = new JTextField();

        btnSubmit = new JButton("Submit");

        frame.add(lPanjang);
        frame.add(lLebar);
        frame.add(lTinggi);
        frame.add(lLuas);
        frame.add(lVolume);
        frame.add(lLuPer);
        frame.add(tfPanjang);
        frame.add(tfLebar);
        frame.add(tfTinggi);
        frame.add(tfLuas);
        frame.add(tfVolume);
        frame.add(tfLuPer);
        frame.add(btnSubmit);

        lPanjang.setBounds(50, 50, 150, 20);
        lLebar.setBounds(50, 80, 150, 20);
        lTinggi.setBounds(50, 110, 150, 20);
        lLuas.setBounds(50, 170, 150, 20);
        lVolume.setBounds(50, 200, 150, 20);
        lLuPer.setBounds(50, 230, 150, 20);
        tfPanjang.setBounds(200, 50, 150, 20);
        tfLebar.setBounds(200, 80, 150, 20);
        tfTinggi.setBounds(200, 110, 150, 20);
        tfLuas.setBounds(200, 170, 150, 20);
        tfVolume.setBounds(200, 200, 150, 20);
        tfLuPer.setBounds(200, 230, 150, 20);
        btnSubmit.setBounds(50, 140, 100, 20);

        tfLuas.setEditable(false);
        tfVolume.setEditable(false);
        tfLuPer.setEditable(false);

        btnSubmit.addActionListener((ActionEvent e) -> {
            try {
                panjang = Double.parseDouble(tfPanjang.getText());
                lebar = Double.parseDouble(tfLebar.getText());
                tinggi = Double.parseDouble(tfTinggi.getText());
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
                tfPanjang.setText("");
                tfLebar.setText("");
                tfTinggi.setText("");
                tfLuas.setText("");
                tfVolume.setText("");
                tfLuPer.setText("");
                JOptionPane.showMessageDialog(frame, "Isi Belum Sesuai!!!");
            }
        });

    }

    public double getVolume() {
        volume = panjang * lebar * tinggi;
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getLuper() {
        luper = 2 * (panjang * lebar) + 2 * (panjang * tinggi) + 2 * (tinggi * lebar);
        return luper;
    }

    public void setLuper(double luper) {
        this.luper = luper;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
