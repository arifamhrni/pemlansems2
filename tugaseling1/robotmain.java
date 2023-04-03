package tugaseling1;

public class robotmain{
    public static void main(String[] args) {
        lingkaran objekLingkaranKepala = new lingkaran(7);
        PersegiPanjang objekPersegiPanjangBadan = new PersegiPanjang(25, 55);
        PersegiPanjang objekPersegiPanjangTanganKiri = new PersegiPanjang(20, 10);
        PersegiPanjang objekPersegiPanjangTanganKanan = new PersegiPanjang(20, 10);
        lingkaran objekLingkaranTelapakTanganKiri = new lingkaran(7);
        lingkaran objekLingkaranTelapakTanganKanan = new lingkaran(7);
        PersegiPanjang objekPersegiPanjangKakiKiri = new PersegiPanjang(25, 35);
        PersegiPanjang objekPersegiPanjangKakiKanan = new PersegiPanjang(25, 35);
        lingkaran objekLingkaranTelapakKakiKiri = new lingkaran(7);
        lingkaran objekLingkaranTelapakKakiKanan = new lingkaran(7);
        
        double luasTotal = objekPersegiPanjangBadan.hitungLuas() 
                + objekPersegiPanjangTanganKiri.hitungLuas() 
                + objekPersegiPanjangTanganKanan.hitungLuas() 
                + objekLingkaranTelapakTanganKiri.hitungLuasLingkaran() 
                + objekLingkaranTelapakTanganKanan.hitungLuasLingkaran() 
                + objekPersegiPanjangKakiKiri.hitungLuas() 
                + objekPersegiPanjangKakiKanan.hitungLuas() 
                + objekLingkaranTelapakKakiKiri.hitungLuasLingkaran() 
                + objekLingkaranTelapakKakiKanan.hitungLuasLingkaran();
         
        double tinggiBadan = objekLingkaranKepala.getDiameter() 
                            + objekPersegiPanjangBadan.getPanjang()
                            + objekPersegiPanjangKakiKiri.getPanjang()
                            + objekLingkaranTelapakKakiKanan.getDiameter();

        System.out.println("1. Luas total robot tersebut adalah \t= " + luasTotal + " cm");
        System.out.println("2. Tinggi dari robot tersebut adalah \t= " + tinggiBadan + " cm");

    }
}
