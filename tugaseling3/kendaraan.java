package tugaseling3;
//arifa

public class kendaraan {
    private String jenis;
    private int kapasitas;
    private int penumpang;

    public kendaraan(String jenis, int kapasitas) {
        this.jenis = jenis;
        this.kapasitas = kapasitas;
        this.penumpang = 0;
    }

    public String getJenis() {
        return jenis;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public int getPenumpang() {
        return penumpang;
    }

    public void tambahPenumpang(int jumlah) {
        if (penumpang + jumlah <= kapasitas) {
            penumpang += jumlah;
            System.out.println("Berhasil menambahkan " + jumlah + " penumpang ke " + jenis);
        } else {
            System.out.println("Kapasitas " + jenis + " tidak mencukupi");
        }
    }
}