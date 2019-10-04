package DuaDimensi;

public class Lingkaran {
    public double jari, luas;

    public double getLuas() {
        luas = 3.14 * jari * jari;
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }
}
