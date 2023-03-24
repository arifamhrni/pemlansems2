package tugas2;

public class book {
    private String judul;
    private String kategori;
    private String penulis;
    private String sinopsis;
    private int hitungangkasinopsis;

    public book(String judul, String kategori, String penulis, String sinopsis) {
        this.judul = judul;
        this.kategori = kategori;
        this.penulis = penulis;
        this.sinopsis = sinopsis;
        this.hitungangkasinopsis = hitungangka(sinopsis);
    }

    public String setjudul(String judul){
        return this.judul = judul;
    }

    public String getjudul() {
        return judul;
    }

    public String getkategori() {
        return kategori;
    }

    public String getpenulis() {
        return penulis;
    }

    public String getsinopsis() {
        return sinopsis;
    }

    public int gethitungangkasinopsis() {
        return hitungangkasinopsis;
    }

    private int hitungangka(String text){
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] words = text.split("\\s+");
        return words.length;
    }

    public book copy() {
        book copy = new book(this.judul, this.kategori, this.penulis, this.sinopsis);
        return copy;
    }

    public void tampilkan(){
        System.out.println("====================================");
        System.out.println("1. kategori buku                   = " + getkategori());
        System.out.println("2. Judul Buku                      = " + getjudul());
        System.out.println("3. Penulis Buku                    = " + getpenulis());
        System.out.println("4. Sinopsis                        = " + getsinopsis());
        System.out.println("5. Menghitung jumlah kata sinopsis = " + gethitungangkasinopsis());
        System.out.println("====================================");
        System.out.println();
    }
}
