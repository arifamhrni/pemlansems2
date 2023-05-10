package tugas4;

public class jaket {
    private static String jenis;
    private static int jumlah;
    private static final int HARGA_A = 100000;
    private static final int HARGA_B = 125000;
    private static final int HARGA_C = 175000;

    public jaket(String jenis, int jumlah) {
        this.jenis = jenis;
        this.jumlah = jumlah;
    }

    public static String getJenis() {
        return jenis;
    }

    public  void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public static int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public stati int getHarga() {
        int harga = 0;
        switch (jenis) {
            case "A":
                harga = HARGA_A;
                if (jumlah >= 100) {
                    harga = jumlah * 95000;
                }
                break;
            case "B":
                harga = HARGA_B;
                if (jumlah >= 100) {
                    harga = jumlah * 120000;
                }
                break;
            case "C":
                harga = HARGA_C;
                if (jumlah >= 100) {
                    harga = jumlah * 160000;
                }
                break;
        }
        return harga;
    }

}



   