package DuaDimensi;

public class Persegi {

    public double sisi, luas;

    public double getLuas() {
        luas = sisi * sisi;
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}
