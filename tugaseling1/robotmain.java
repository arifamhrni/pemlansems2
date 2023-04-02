package tugaseling1;

public class robotmain{
    public static void main(String[] args) {
        lingkaran objekLingkaranKepala = new lingkaran(10);
        PersegiPanjang objekPersegiPanjangBadan = new PersegiPanjang(30, 50);
        PersegiPanjang objekPersegiPanjangTanganKiri = new PersegiPanjang(20, 10);
        PersegiPanjang objekPersegiPanjangTanganKanan = new PersegiPanjang(20, 10);
        lingkaran objekLingkaranTelapakTanganKiri = new lingkaran(5);
        lingkaran objekLingkaranTelapakTanganKanan = new lingkaran(5);
        PersegiPanjang objekPersegiPanjangKakiKiri = new PersegiPanjang(15, 30);
        PersegiPanjang objekPersegiPanjangKakiKanan = new PersegiPanjang(15, 30);
        lingkaran objekLingkaranTelapakKakiKiri = new lingkaran(7.5);
        lingkaran objekLingkaranTelapakKakiKanan = new lingkaran(7.5);
        
        double luasTotal = objekLingkaranKepala.hitungLuas() 
                + objekPersegiPanjangBadan.hitungLuas() 
                + objekPersegiPanjangTanganKiri.hitungLuas() 
                + objekPersegiPanjangTanganKanan.hitungLuas() 
                + objekLingkaranTelapakTanganKiri.hitungLuas() 
                + objekLingkaranTelapakTanganKanan.hitungLuas() 
                + objekPersegiPanjangKakiKiri.hitungLuas() 
                + objekPersegiPanjangKakiKanan.hitungLuas() 
                + objekLingkaranTelapakKakiKiri.hitungLuas() 
                + objekLingkaranTelapakKakiKanan.hitungLuas();

         
        double tinggiBadan = objekPersegiPanjangBadan.getPanjang();

        System.out.println("1. Luas total robot tersebut adalah \t= " + luasTotal + " cm");
        System.out.println("2. Tinggi dari robot tersebut adalah \t= " + tinggiBadan + " cm");
        

    }
}
