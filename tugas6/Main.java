package tugas6;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Manusia
        System.out.println("========================");
        Manusia lakiLakiMenikah = new Manusia("Arkhan", true, "1234567890", true);
        System.out.println("Manusia:");
        System.out.println(lakiLakiMenikah);
        System.out.println("========================");
        System.out.println(" ");
        
        System.out.println("========================");
        Manusia perempuanMenikah = new Manusia("Nisot", false, "0987654321", true);
        System.out.println("Manusia:");
        System.out.println(perempuanMenikah);
        System.out.println("========================");
        System.out.println(" ");

        System.out.println("========================");
        Manusia belumMenikah = new Manusia("Haidar", true, "9876543210", false);
        System.out.println("Manusia:");
        System.out.println(belumMenikah);
        System.out.println("========================");
        System.out.println(" ");

        // MahasiswaFilkom
        System.out.println("========================");
        MahasiswaFILKOM mahasiswa1 = new MahasiswaFILKOM("Rifan", true, "320582756562437", false, "225150200000000", 2.9);
        System.out.println("Mahasiswa FILKOM (IPK < 3):");
        System.out.println(mahasiswa1);
        System.out.println("========================");
        System.out.println(" ");

        System.out.println("========================");
        MahasiswaFILKOM mahasiswa2 = new MahasiswaFILKOM("Rhea", false, "749783446573945", false, "205150701111035", 3.3);
        System.out.println("Mahasiswa FILKOM (IPK 3 - 3.5):");
        System.out.println(mahasiswa2);
        System.out.println("========================");
        System.out.println(" ");

        System.out.println("========================");
        MahasiswaFILKOM mahasiswa3 = new MahasiswaFILKOM("Muhammad", true, "275028593856373", false, "215150301111001", 3.8);
        System.out.println("Mahasiswa FILKOM (IPK 3.5 - 4):");
        System.out.println(mahasiswa3);
        System.out.println("========================");
        System.out.println(" ");

        //Pekerja
        System.out.println("========================");
        Pekerja pekerja2 = new Pekerja("Asung", false, "0987654321", true, 6000.0, LocalDate.of(2014, 1, 1), 0);
        System.out.println("Pekerja (9 tahun):");
        System.out.println(pekerja2);
        System.out.println("========================");
        System.out.println(" ");

        System.out.println("========================");
        Pekerja pekerja3 = new Pekerja("Uwik", false, "9876543210", true, 8000.0, LocalDate.of(2003, 1, 1), 10);
        System.out.println("Pekerja (20 tahun, 10 anak):");
        System.out.println(pekerja3);
        System.out.println("========================");
        System.out.println(" ");

        // Manager
        System.out.println("========================");
        Manager manager1 = new Manager("Arifa", true, "1234567890", true, 7500.0, LocalDate.of(2008, 1, 1), 3, "IT");
        System.out.println("Manager (15 tahun):");
        System.out.println(manager1);
        System.out.println("========================");
        System.out.println(" ");
    }
}
