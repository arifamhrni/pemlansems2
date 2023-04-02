package tugaseling1;

public class robot {
    public int luasTotal, tinggiBadan;
}

class lingkaran extends robot{
    private double jariJari;

    public lingkaran(double jarijari) {
        this.jariJari = jariJari;
    }

    public double hitungLuas(){
        return 3.14 * jariJari * jariJari;
    }
}

class PersegiPanjang extends robot{
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas(){
        return panjang * lebar;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getPanjang() {
        return this.panjang;
    }
}
