class bangunDatar {
    public double panjangsisi1;
    public double panjangsisi2;

    public bangunDatar (double panjangsisi1, double panjangsisi2){
        this.panjangsisi1 = panjangsisi1;
        this.panjangsisi2 = panjangsisi2;
    }
}

class lingkaran extends bangunDatar{
    public double jariJari;
    public double phi;

    public lingkaran(double jariJari, double phi){
        super(jariJari, phi);
        this.jariJari = jariJari;
        this.phi = phi;
    }
    public void luasLingkaran(){
        double luasLingkaran = jariJari*jariJari*phi;
        System.out.println("Luas Lingkaran = " + luasLingkaran);
    }
    public void kelilingLingkaran(){
        double kelilingLingkaran = 2*jariJari*phi;
        System.out.println("Keliling Lingkaran = " + kelilingLingkaran);
    }
}
class persegiPanjang extends bangunDatar{
    public int panjang_sisi1;
    public int panjang_sisi2;

    public persegiPanjang(int panjang_sisi1, int panjang_sisi2){
        super(panjang_sisi1, panjang_sisi2);
        this.panjang_sisi1 = panjang_sisi1;
        this.panjang_sisi2 = panjang_sisi2;
    }
    public void luasPersegiPanjang(){
        int luasPersegiPanjang = panjang_sisi1*panjang_sisi2;
        System.out.println("Luas Persegi Panjang = " + luasPersegiPanjang);
    }

    public void kelilingPersegiPanjang(){
        int kelilingPersegiPanjang = 2*panjang_sisi1 + 2*panjang_sisi2;
        System.out.println("Keliling Persegi Panjang = " + kelilingPersegiPanjang);
    }
}
class segitiga extends bangunDatar{
    public int alas;
    public int tinggi;

    public segitiga(int alas, int tinggi){
        super(alas, tinggi);
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public void luasSegitiga(){
        int luasSegitiga = alas*tinggi/2;
        System.out.println("Luas Segitiga = " + luasSegitiga);
    }
}
public class App {
    public static void main(String[] args){
        lingkaran satu = new lingkaran(14, 3.14);
        satu.luasLingkaran();
        satu.kelilingLingkaran();

        System.out.println();

        persegiPanjang dua = new persegiPanjang(12, 20);
        dua.luasPersegiPanjang();
        dua.kelilingPersegiPanjang();

        System.out.println();

        segitiga tiga = new segitiga(12, 3);
        tiga.luasSegitiga();

        System.out.println();




        
    }
}
