package tugaseling1;

public class robot {

   
    
}

class lingkaran extends robot{
    private double jariJari;
    private double phi = Math.PI;
    
    // Getter / aksesor attribut class lingkaran
    public lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double getJarijari() {
        return jariJari;
    }
    public double getDiameter() {
        return jariJari + jariJari;
    }

    // method untuk menghitung luas objek lingkaran
    public double hitungLuasLingkaran(){
        return phi * this.getJarijari() * this.getJarijari();
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

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getLebar() {
        return this.lebar;
    }
}
