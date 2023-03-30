package tugas3;

//created by Arifa Maharani Salsabil
//kelas ti-e
//PemLan

import java.util.Scanner;

public class heroesmain {
    public static void main(String[] args) {
        //menampilkan methode opening
        heroes opening = new heroes();
        opening.opening();


        Scanner input = new Scanner(System.in);
        // Input heroes 1 dengan setter
        heroes heroes1 = new heroes();
        System.out.print("Masukkan nama heroes 1: ");
        heroes1.setNama(input.nextLine());
        System.out.print("Masukkan hp heroes 1: ");
        heroes1.setHp(input.nextDouble());
        System.out.print("Masukkan atk heroes 1: ");
        heroes1.setAtk(input.nextDouble());
        input.nextLine();

        // Input heroes 2 dengan constructor
        System.out.println();
        System.out.print("Masukkan nama heroes 2: ");
        String name2 = input.nextLine();
        System.out.print("Masukkan hp heroes 2: ");
        double hp2 = input.nextDouble();
        System.out.print("Masukkan atk heroes 2: ");
        double atk2 = input.nextDouble();
        heroes heroes2 = new heroes(name2, hp2, atk2);
        input.nextLine();

        //menampilkan methode infoHeroes
        System.out.println();
        System.out.println("========INFO HEROES========");
        heroes1.infoHeroes();
        heroes2.infoHeroes();


        // Loop hingga salah satu hero kalah (hp <= 0)
        while (heroes1.getHp() > 0 && heroes2.getHp() > 0) {
            // Hero 1 menyerang hero 2
            System.out.println(heroes1.getNama() + " menyerang " + heroes2.getNama());
            heroes2.setHp(heroes2.getHp() - heroes1.getAtk());

            // Hero 2 menyerang hero 1
            System.out.println(heroes2.getNama() + " menyerang " + heroes1.getNama());
            heroes1.setHp(heroes1.getHp() - heroes2.getAtk());

            // Print status kedua hero setelah serangan
            System.out.println(heroes1.getNama() + ": " + heroes1.getHp());
            System.out.println(heroes2.getNama() + ": " + heroes2.getHp());
            System.out.println();
        }

        // Print pemenang dari pertandingan
        if (heroes1.getHp() <= 0 && heroes2.getHp() <= 0) {
            System.out.println("Permainan seri!");
        } else if (heroes1.getHp() <= 0) {
            System.out.println(heroes2.getNama() + " memenangkan pertarungan!");
        } else {
            System.out.println(heroes1.getNama() + " memenangkan pertarungan!");
        }
    }
}