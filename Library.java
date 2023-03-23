public class Library {
    
    public static class Book {
        public String title, publisher, synopsis;
        public int year;
        public String[] authors;

        public Book(String title, String publisher, int year, String... authors) {
            this.title = title;
            this.publisher = publisher;
            this.year = year;
            this.authors = authors;
        }
    }

    public static class BookCategory {
        public String name;
        public Book[] books;

        public BookCategory(String name, Book... books) {
            this.name = name;
            this.books = books;
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Judul Buku 1", "Bumi Aksara", 2020, "Fahli", "Saputra", "Muhammad");
        Book book2 = new Book("Judul Buku 2", "Saturnus Aksara", 2019, "Salsa");
        Book book3 = new Book("Judul Buku 3", "Venus Aksara", 2015, "Arif");
        
        BookCategory tech = new BookCategory("Teknologi", book1, book2);
        BookCategory filsafat = new BookCategory("Filsafat", book3);

        System.out.println("Kategori: " + tech.name);
        for (Book book : tech.books) {
            System.out.println("=========================");
            System.out.println("Judul Buku: " + book.title);
            System.out.println("Penerbit: " + book.publisher);
            System.out.println("Tahun: " + book.year);
            System.out.println("Penulis: ");

            for (String author : book.authors) {
                System.out.println("- " + author);
            }
            System.out.println("=========================");
        }

        System.out.println("Kategori: " + filsafat.name);
        for (Book book : filsafat.books) {
            System.out.println("=========================");
            System.out.println("Judul Buku: " + book.title);
            System.out.println("Penerbit: " + book.publisher);
            System.out.println("Tahun: " + book.year);
            System.out.println("Penulis: ");

            for (String author : book.authors) {
                System.out.println("- " + author);
            }
            System.out.println("=========================");
        }


    }
}
