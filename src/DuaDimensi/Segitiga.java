package DuaDimensi;

public class Segitiga {

    public double alas, tinggi, luas;

    public double getLuas() {
        luas = alas * tinggi / 2;
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
