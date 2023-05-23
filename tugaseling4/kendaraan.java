package tugaseling4;


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

    public void tambahPenumpang(int jumlah) throws ArrayIndexOutOfBoundsException, ArithmeticException {
        try {
            if (penumpang + jumlah <= kapasitas) {
                penumpang += jumlah;
                System.out.println("Berhasil menambahkan " + jumlah + " penumpang ke " + jenis);
            } else {
                throw new ArrayIndexOutOfBoundsException("Kapasitas " + jenis + " tidak mencukupi");
            }
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan aritmatika: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi kesalahan indeks array: " + e.getMessage());
        } finally {
            System.out.println("Selesai menjalankan metode tambahPenumpang");
        }
    }
}
