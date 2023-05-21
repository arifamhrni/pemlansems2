package tugas7;

public class Main {
    public static void main(String[] args) {
        Kue[] daftarKue = new Kue[20];

        // Isi objek KuePesanan
        daftarKue[0] = new KuePesanan("Kue Ulang Tahun", 100000, 1);
        daftarKue[1] = new KuePesanan("Kue Brownis", 20000, 0.5);
        

        // Isi objek KueJadi
        daftarKue[2] = new KueJadi("Donat", 5000, 3);
        daftarKue[3] = new KueJadi("kue sus", 4000, 5);
        

        // Tampilkan semua kue beserta jenisnya
        System.out.println("Daftar Kue:");
        for (Kue kue : daftarKue) {
            if (kue != null) {
                if (kue instanceof KuePesanan) {
                    System.out.println("Jenis: Kue Pesanan");
                } else if (kue instanceof KueJadi) {
                    System.out.println("Jenis: Kue Jadi");
                }
                System.out.println(kue.toString());
                System.out.println();
            }
        }

        // Hitung total harga dari semua jenis kue
        double totalHarga = 0.0;
        for (Kue kue : daftarKue) {
            if (kue != null) {
                totalHarga += kue.hitungHarga();
            }
        }
        System.out.println("==============================================");
        System.out.println("1. Total Harga Semua Kue: Rp" + totalHarga);

        // Hitung total harga dan total berat dari KuePesanan
        double totalHargaKuePesanan = 0.0;
        double totalBerat = 0.0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KuePesanan) {
                totalHargaKuePesanan += kue.hitungHarga();
                totalBerat += ((KuePesanan) kue).berat;
            }
        }
        System.out.println("2. Total Harga Kue Pesanan : Rp" + totalHargaKuePesanan);
        System.out.println("3. Total Berat Kue Pesanan : " + totalBerat + " kg");

        // Hitung total harga dan total jumlah dari KueJadi
        double totalHargaKueJadi = 0.0;
        double totalJumlah = 0.0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KueJadi) {
                totalHargaKueJadi += kue.hitungHarga();
                totalJumlah += ((KueJadi) kue).jumlah;
            }
        }
        System.out.println("4. Total Harga Kue Jadi : Rp" + totalHargaKueJadi);
        System.out.println("5. Total Jumlah Kue Jadi : " + totalJumlah);

        // Tampilkan informasi kue dengan harga terbesar
        double hargaTerbesar = 0.0;
        Kue kueHargaTerbesar = null;
        for (Kue kue : daftarKue) {
            if (kue != null && kue.hitungHarga() > hargaTerbesar) {
                hargaTerbesar = kue.hitungHarga();
                kueHargaTerbesar = kue;
            }
        }
        if (kueHargaTerbesar != null) {
            System.out.println("\nINFORMASI KUE DENGAN HARGA TERBESAR");
            System.out.println(kueHargaTerbesar.tampilanHargaTerbesar());
            System.out.println("==============================================");
        }
    }
}