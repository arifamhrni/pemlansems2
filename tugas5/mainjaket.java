//Arifa Maharani Salsabil
//225150701111034
//TI-E

package tugas5;

import java.util.Scanner;

public class mainjaket {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Jumlah jaket A yang dibeli: ");
            int jumlahA = scanner.nextInt();
            System.out.print("Jumlah jaket B yang dibeli: ");
            int jumlahB = scanner.nextInt();
            System.out.print("Jumlah jaket C yang dibeli: ");
            int jumlahC = scanner.nextInt();

            HargaJaketDiskon.setHargaJaketA(100000);
            HargaJaketDiskon.setHargaJaketB(125000);
            HargaJaketDiskon.setHargaJaketC(175000);

            int hargaTotal = HargaJaketDiskon.hitungHargaTotal(jumlahA, jumlahB, jumlahC);
            System.out.println("Harga total sebelum diskon: " + hargaTotal);

            if (jumlahA >= 100) {
                HargaJaketDiskon.setHargaJaketA(95000);
                System.out.println("Diskon diberikan untuk jaket A");
            }

            if (jumlahB >= 100) {
                HargaJaketDiskon.setHargaJaketB(120000);
                System.out.println("Diskon diberikan untuk jaket B");
            }

            if (jumlahC >= 100) {
                HargaJaketDiskon.setHargaJaketC(160000);
                System.out.println("Diskon diberikan untuk jaket C");
            }

            hargaTotal = HargaJaketDiskon.hitungHargaTotal(jumlahA, jumlahB, jumlahC);
            System.out.println("Harga total setelah diskon: " + hargaTotal);
        }
    }
}

class HargaJaketDiskon {
    private static int hargaJaketA;
    private static int hargaJaketB;
    private static int hargaJaketC;

    public static void setHargaJaketA(int harga) {
        hargaJaketA = harga;
    }

    public static void setHargaJaketB(int harga) {
        hargaJaketB = harga;
    }

    public static void setHargaJaketC(int harga) {
        hargaJaketC = harga;
    }

    public static int hitungHargaTotal(int jumlahA, int jumlahB, int jumlahC) {
        int hargaTotal = hargaJaketA * jumlahA + hargaJaketB * jumlahB + hargaJaketC * jumlahC;
        return hargaTotal;
    }
}
