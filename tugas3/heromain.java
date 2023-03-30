package tugas3;

//created by Arifa Maharani Salsabil
//kelas ti-e
//PemLan

import java.util.Scanner;

public class heromain {
    public static void main(String[] args) {
        //menampilkan methode opening
        hero opening = new hero();
        opening.opening();


        Scanner input = new Scanner(System.in);
        // Input hero 1 dengan setter
        hero hero1 = new hero();
        System.out.print("Masukkan nama hero 1: ");
        hero1.setNama(input.nextLine());
        System.out.print("Masukkan hp hero 1: ");
        hero1.setHp(input.nextDouble());
        System.out.print("Masukkan atk hero 1: ");
        hero1.setAtk(input.nextDouble());
        input.nextLine();

        // Input hero 2 dengan constructor
        System.out.println();
        System.out.print("Masukkan nama hero 2: ");
        String name2 = input.nextLine();
        System.out.print("Masukkan hp hero 2: ");
        double hp2 = input.nextDouble();
        System.out.print("Masukkan atk hero 2: ");
        double atk2 = input.nextDouble();
        hero hero2 = new hero(name2, hp2, atk2);
        input.nextLine();

        //menampilkan methode infohero
        System.out.println();
        System.out.println("========INFO HERO========");
        hero1.infohero();
        hero2.infohero();


        // Loop hingga salah satu hero kalah (hp <= 0)
        while (hero1.getHp() > 0 && hero2.getHp() > 0) {
            // Hero 1 menyerang hero 2
            System.out.println(hero1.getNama() + " menyerang " + hero2.getNama());
            hero2.setHp(hero2.getHp() - hero1.getAtk());

            // Hero 2 menyerang hero 1
            System.out.println(hero2.getNama() + " menyerang " + hero1.getNama());
            hero1.setHp(hero1.getHp() - hero2.getAtk());

            // Print status kedua hero setelah serangan
            System.out.println(hero1.getNama() + ": " + hero1.getHp());
            System.out.println(hero2.getNama() + ": " + hero2.getHp());
            System.out.println();
        }

        // Print pemenang dari pertandingan
        if (hero1.getHp() <= 0 && hero2.getHp() <= 0) {
            System.out.println("Permainan seri!");
        } else if (hero1.getHp() <= 0) {
            System.out.println(hero2.getNama() + " memenangkan pertarungan!");
        } else {
            System.out.println(hero1.getNama() + " memenangkan pertarungan!");
        }
    }
}