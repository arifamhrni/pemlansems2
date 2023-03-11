package tugas1;

class book {
    private String kategori;
    private String judul;
    private String namaPenulis;
    private int jumlahHalaman;
    private int tahunTerbit;

    public void setKategori (String s) {
        kategori = s;
    }
    public void setJudul (String s) {
        judul = s;
    }
    public void setNamaPenulis (String s){
        namaPenulis =  s;
    }
    public void setJumlahHalaman (int i){
        jumlahHalaman = i;
    }
    public void setTahunTerbit (int i){
        tahunTerbit = i;
    }
    public void displayMesssage(){
        System.out.println("Buku anda berkategori = " + kategori);
        System.out.println("dengan Judul = " + judul);
        System.out.println("dengan nama penulis = " + namaPenulis);
        System.out.println("dengan jumlah halaman = " + jumlahHalaman);
        System.out.println("dengan tahun terbit = " + tahunTerbit);
    }

 }
    
