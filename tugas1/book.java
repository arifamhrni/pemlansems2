package tugas1;

//created by Arifa Maharani Salsabil
//kelas ti-e
//PemLan

public class book {
    private String kategori;
    private String judul;
    private int tahunterbit;
    private int jumlahhalaman;
    public void setKategori(String kategori){
        this.kategori = kategori;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    public void setTahunTerbit(int i){
        this.tahunterbit = i;
    }
    public void setJumlahHalaman(int i) {
        this.jumlahhalaman = i;
    }
    public void setNamaPenulis(String penulis) {
    }

    public void tampilkan(){
        System.out.println("====================================");
        System.out.println("kategori buku : " + kategori);
        System.out.println("1. Judul Buku : " + judul);
        System.out.println("2. Tahun terbit : " + tahunterbit);
        System.out.println("3. Jumlah halaman : " + jumlahhalaman);
        System.out.println("====================================");
        System.out.println();
    }
	public void displayMesssage() {
	}
}