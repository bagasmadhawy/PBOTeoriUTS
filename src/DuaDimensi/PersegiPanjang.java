package DuaDimensi;

public class PersegiPanjang {

    public double panjang, lebar, luas;

    public double getLuas() {
        luas = panjang * lebar;
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
}
