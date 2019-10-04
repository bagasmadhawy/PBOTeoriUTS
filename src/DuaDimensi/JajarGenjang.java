package DuaDimensi;

public class JajarGenjang {

    public double alas, tinggi, luas, sisiMiring;

    public double getLuas() {
        luas = alas * tinggi;
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
    public double getSisiMiring() {
        return sisiMiring;
    }

    public void setSisiMiring(double sisiMiring) {
        this.sisiMiring = sisiMiring;
    }
}
