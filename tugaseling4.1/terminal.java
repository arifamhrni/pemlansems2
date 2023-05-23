import java.util.*;

public class terminal {
    private List<String> angkotPenumpang;
    private List<String> bisPenumpang;

    public terminal() {
        angkotPenumpang = new ArrayList<>();
        bisPenumpang = new ArrayList<>();
    }

    public void naikAngkot(String penumpang) throws Exception {
        if (angkotPenumpang.size() >= 10) {
            throw new Exception("Angkot sudah penuh");
        }
        angkotPenumpang.add(penumpang);
    }

    public void naikBis(String penumpang) throws Exception {
        if (bisPenumpang.size() >= 20) {
            throw new Exception("Bis sudah penuh");
        }
        bisPenumpang.add(penumpang);
    }

    public void tampilkanPenumpangAngkot() {
        System.out.println("Penumpang Angkot:");
        for (String penumpang : angkotPenumpang) {
            System.out.println(penumpang);
        }
        System.out.println(" ");

    }

    public void tampilkanPenumpangBis() {
        System.out.println("Penumpang Bis:");
        for (String penumpang : bisPenumpang) {
            System.out.println(penumpang);
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}

class TerminalApp {
    public static void main(String[] args) {
        terminal terminal = new terminal();
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("1. Naik Angkot");
                System.out.println("2. Naik Bis");
                System.out.println("3. Tampilkan Penumpang Angkot");
                System.out.println("4. Tampilkan Penumpang Bis");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu: ");
                int menu = scanner.nextInt();

                switch (menu) {
                    case 1:
                        System.out.print("Masukkan nama penumpang: ");
                        String angkotPenumpang = scanner.next();
                        terminal.naikAngkot(angkotPenumpang);
                        System.out.println("Penumpang naik angkot");
                        System.out.println(" ");
                        break;
                    case 2:
                        System.out.print("Masukkan nama penumpang: ");
                        String bisPenumpang = scanner.next();
                        terminal.naikBis(bisPenumpang);
                        System.out.println("Penumpang naik bis");
                        System.out.println(" ");
                        break;
                    case 3:
                        System.out.println(" ");
                        terminal.tampilkanPenumpangAngkot();
                        break;
                    case 4:
                        terminal.tampilkanPenumpangBis();
                        break;
                    case 5:
                        System.out.println("Terima kasih!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Menu tidak valid");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException terjadi");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}