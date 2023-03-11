package tugas1;

public class mainbook {
    public static void main(String[] args) {
        book m1 = new book();
        m1.setKategori("teknologi");
        m1.setJudul("Pengantar Teknologi");
        m1.setNamaPenulis("Nadin Amizah");
        m1.setJumlahHalaman(133);
        m1.setTahunTerbit(2009);
        System.out.println("==================");

        m1.displayMesssage();
    }
}
