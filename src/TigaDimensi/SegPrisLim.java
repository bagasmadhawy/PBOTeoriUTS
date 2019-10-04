package TigaDimensi;

import DuaDimensi.Segitiga;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class SegPrisLim extends Segitiga {

    JFrame frame = new JFrame();
    JLabel lAlas, lTinggi, lTinggiPris, lTinggiLim, lLuas, lVolumePris, lVolumeLim, lLuPerPris, lLuPerLim;
    JTextField tfAlas, tfTinggi, tfTinggiPris, tfTinggiLim, tfLuas, tfVolumePris, tfVolumeLim, tfLuPerPris, tfLuPerLim;
    JButton btnSubmit;

    double tinggiPris, tinggiLim, volumePris, volumeLim, luperPris, luperLim, a, a2;

    public SegPrisLim() {
        //Frame
        frame.setTitle("Segitiga, Prisma Segitiga, dan Limas Segitiga");
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLayout(null);

        lAlas = new JLabel("Alas");
        lTinggi = new JLabel("Tinggi Segitiga");
        lTinggiPris = new JLabel("Tinggi Prisma");
        lTinggiLim = new JLabel("Tinggi Limas");
        lLuas = new JLabel("Luas Segitiga");
        lVolumePris = new JLabel("Volume Prisma");
        lVolumeLim = new JLabel("Volume Limas");
        lLuPerPris = new JLabel("Luas Permukaan Prisma");
        lLuPerLim = new JLabel("Luas Permukaan Limas");

        tfAlas = new JTextField();
        tfTinggi = new JTextField();
        tfTinggiPris = new JTextField();
        tfTinggiLim = new JTextField();
        tfLuas = new JTextField();
        tfVolumePris = new JTextField();
        tfVolumeLim = new JTextField();
        tfLuPerPris = new JTextField();
        tfLuPerLim = new JTextField();

        btnSubmit = new JButton("Submit");

        frame.add(lAlas);
        frame.add(lTinggi);
        frame.add(lTinggiPris);
        frame.add(lTinggiLim);
        frame.add(lLuas);
        frame.add(lVolumePris);
        frame.add(lVolumeLim);
        frame.add(lLuPerPris);
        frame.add(lLuPerLim);
        frame.add(tfAlas);
        frame.add(tfTinggi);
        frame.add(tfTinggiPris);
        frame.add(tfTinggiLim);
        frame.add(tfLuas);
        frame.add(tfVolumePris);
        frame.add(tfVolumeLim);
        frame.add(tfLuPerPris);
        frame.add(tfLuPerLim);
        frame.add(btnSubmit);

        lAlas.setBounds(50, 50, 150, 20);
        lTinggi.setBounds(50, 80, 150, 20);
        lTinggiPris.setBounds(50, 110, 150, 20);
        lTinggiLim.setBounds(50, 140, 150, 20);
        lLuas.setBounds(50, 200, 150, 20);
        lVolumePris.setBounds(50, 230, 150, 20);
        lVolumeLim.setBounds(50, 260, 150, 20);
        lLuPerPris.setBounds(50, 290, 150, 20);
        lLuPerLim.setBounds(50, 320, 150, 20);
        tfAlas.setBounds(200, 50, 150, 20);
        tfTinggi.setBounds(200, 80, 150, 20);
        tfTinggiPris.setBounds(200, 110, 150, 20);
        tfTinggiLim.setBounds(200, 140, 150, 20);
        tfLuas.setBounds(200, 200, 150, 20);
        tfVolumePris.setBounds(200, 230, 150, 20);
        tfVolumeLim.setBounds(200, 260, 150, 20);
        tfLuPerPris.setBounds(200, 290, 150, 20);
        tfLuPerLim.setBounds(200, 320, 150, 20);
        btnSubmit.setBounds(50, 170, 100, 20);

        tfLuas.setEditable(false);
        tfVolumePris.setEditable(false);
        tfVolumeLim.setEditable(false);
        tfLuPerPris.setEditable(false);
        tfLuPerLim.setEditable(false);

        btnSubmit.addActionListener((ActionEvent e) -> {
            try {
                alas = Double.parseDouble(tfAlas.getText());
                tinggi = Double.parseDouble(tfTinggi.getText());
                tinggiPris = Double.parseDouble(tfTinggiPris.getText());
                tinggiLim = Double.parseDouble(tfTinggiLim.getText());
                getLuas();
                String l = String.valueOf(luas);
                tfLuas.setText(l);
                getVolumePris();
                String vP = String.valueOf(volumePris);
                tfVolumePris.setText(vP);
                getVolumeLim();
                String vL = String.valueOf(volumeLim);
                tfVolumeLim.setText(vL);
                getLuperPris();
                String lpP = String.valueOf(luperPris);
                tfLuPerPris.setText(lpP);
                getLuperLim();
                String lpL = String.valueOf(luperLim);
                tfLuPerLim.setText(lpL);
            } catch (Exception ex) {
                tfAlas.setText("");
                tfTinggi.setText("");
                tfTinggiPris.setText("");
                tfTinggiLim.setText("");
                tfLuas.setText("");
                tfVolumePris.setText("");
                tfVolumeLim.setText("");
                tfLuPerPris.setText("");
                tfLuPerLim.setText("");
                JOptionPane.showMessageDialog(frame, "Isi Belum Sesuai!!!");
            }
        });
    }

    public double getVolumePris() {
        volumePris = alas * tinggi * tinggiPris / 2;
        return volumePris;
    }

    public void setVolumePris(double volumePris) {
        this.volumePris = volumePris;
    }

    public double getVolumeLim() {
        volumeLim = (alas * tinggi / 2) * tinggiLim / 3;
        return volumeLim;
    }

    public void setVolumeLim(double volumeLim) {
        this.volumeLim = volumeLim;
    }

    public double getLuperPris() {
        a = Math.sqrt((Math.pow(alas, 2) / 4) + Math.pow(tinggi, 2));
        a2 = tinggiPris * a;
        luperPris = (alas * tinggi) + (3 * a2);
        return luperPris;
    }

    public void setLuperPris(double luperPris) {
        this.luperPris = luperPris;
    }

    public double getLuperLim() {
        luperLim = (alas * tinggi / 2) + (3 * alas * tinggiLim);
        return luperLim;
    }

    public void setLuperLim(double luperLim) {
        this.luperLim = luperLim;
    }

    public double getTinggiPris() {
        return tinggiPris;
    }

    public void setTinggiPris(double tinggiPris) {
        this.tinggiPris = tinggiPris;
    }

    public double getTinggiLim() {
        return tinggiLim;
    }

    public void setTinggiLim(double tinggiLim) {
        this.tinggiLim = tinggiLim;
    }

}
