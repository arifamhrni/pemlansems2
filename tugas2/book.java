package tugas2;

public class book {
    private String title;
    private String category;
    private String author;
    private String synopsis;
    private int synopsisWordCount;

    public book(String title, String category, String author, String synopsis) {
        this.title = title;
        this.category = category;
        this.author = author;
        this.synopsis = synopsis;
        this.synopsisWordCount = countWords(synopsis);
    }

    public String setTitle(String title){
        return this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getAuthor() {
        return author;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public int getSynopsisWordCount() {
        return synopsisWordCount;
    }

    private int countWords(String text){
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] words = text.split("\\s+");
        return words.length;
    }

    public book copy() {
        book copy = new book(this.title, this.category, this.author, this.synopsis);
        return copy;
    }

    public void tampilkan(){
        System.out.println("====================================");
        System.out.println("kategori buku : " + getCategory());
        System.out.println("1. Judul Buku : " + getTitle());
        System.out.println("2. Penulis Buku : " + getAuthor());
        System.out.println("3. Sinopsis : " + getSynopsis());
        System.out.println("4. Menghitung jumlah kata sinopsis = " + getSynopsisWordCount());
        System.out.println("====================================");
        System.out.println();
    }
}
