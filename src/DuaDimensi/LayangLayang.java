package DuaDimensi;

import java.awt.event.ActionEvent;
import javax.swing.*;

public class LayangLayang {

    JFrame frame = new JFrame();
    JLabel lDs, lDd, lL;
    JTextField tfDs, tfDd, tfL;
    JButton btnSubmit;

    double dSatu, dDua, luas;

    public LayangLayang() {
        //Frame
        frame.setTitle("Layang Layang");
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLayout(null);

        lDs = new JLabel("Diagonal 1");
        lDd = new JLabel("Diagonal 2");
        lL = new JLabel("Luas Layang-Layang");

        tfDs = new JTextField();
        tfDd = new JTextField();
        tfL = new JTextField();

        btnSubmit = new JButton("Submit");

        frame.add(lDs);
        frame.add(lDd);
        frame.add(lL);
        frame.add(tfDs);
        frame.add(tfDd);
        frame.add(tfL);
        frame.add(btnSubmit);

        lDs.setBounds(50, 50, 150, 20);
        lDd.setBounds(50, 80, 150, 20);
        lL.setBounds(50, 140, 150, 20);
        tfDs.setBounds(200, 50, 150, 20);
        tfDd.setBounds(200, 80, 150, 20);
        tfL.setBounds(200, 140, 150, 20);
        btnSubmit.setBounds(50, 110, 100, 20);

        tfL.setEditable(false);

        btnSubmit.addActionListener((ActionEvent e) -> {
            try {
                dSatu = Double.parseDouble(tfDs.getText());
                dDua = Double.parseDouble(tfDd.getText());
                getLuas();
                String l = String.valueOf(luas);
                tfL.setText(l);
            } catch (Exception ex) {
                tfDs.setText("");
                tfDd.setText("");
                tfL.setText("");
                JOptionPane.showMessageDialog(frame, "Isi Belum Sesuai!!!");
            }
        });
    }

    public double getLuas() {
        luas = dSatu * dDua / 2;
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public double getDSatu() {
        return dSatu;
    }

    public void setDSatu(double dSatu) {
        this.dSatu = dSatu;
    }

    public double getDDua() {
        return dDua;
    }

    public void setDDua(double dDua) {
        this.dDua = dDua;
    }
}
