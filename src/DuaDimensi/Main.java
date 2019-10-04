package DuaDimensi;

import TigaDimensi.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton btnKubus, btnBalok, btnSegPrisLim, btnLingTaKeBo, btnBk, btnLl, btnJgPjg;

        btnKubus = new JButton("Persegi, Kubus, dan Limas Segiempat");
        btnBalok = new JButton("Persegi Panjang, dan Balok");
        btnSegPrisLim = new JButton("Segitiga, Prisma Segitiga, dan Limas Segitiga");
        btnLingTaKeBo = new JButton("Lingkaran, Tabung, Kerucut, dan Bola");
        btnBk = new JButton("Belah Ketupat");
        btnLl = new JButton("Layang-Layang");
        btnJgPjg = new JButton("Jajar Genjang, dan Prisma Jajar Genjang");

        frame.setTitle("Menu");
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLayout(null);

        frame.add(btnKubus);
        frame.add(btnBalok);
        frame.add(btnSegPrisLim);
        frame.add(btnLingTaKeBo);
        frame.add(btnBk);
        frame.add(btnLl);
        frame.add(btnJgPjg);

        btnKubus.setBounds(50, 50, 700, 40);
        btnBalok.setBounds(50, 100, 700, 40);
        btnSegPrisLim.setBounds(50, 150, 700, 40);
        btnLingTaKeBo.setBounds(50, 200, 700, 40);
        btnBk.setBounds(50, 250, 700, 40);
        btnLl.setBounds(50, 300, 700, 40);
        btnJgPjg.setBounds(50, 350, 700, 40);

        btnKubus.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                KubusLimPer kubus = new KubusLimPer();
                frame.dispose();
            }

        });

        btnBalok.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Balok balok = new Balok();
                frame.dispose();
            }

        });
        btnSegPrisLim.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SegPrisLim sgl = new SegPrisLim();
                frame.dispose();
            }

        });
        btnLingTaKeBo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                TaKeBo tkb = new TaKeBo();
                frame.dispose();
            }

        });
        btnBk.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                BelahKetupatt beKet = new BelahKetupatt();
                frame.dispose();
            }

        });
        btnLl.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                LayangLayang ll = new LayangLayang();
                frame.dispose();
            }

        });
        btnJgPjg.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JarGenPris jgp = new JarGenPris();
                frame.dispose();
            }

        });
    }

}
