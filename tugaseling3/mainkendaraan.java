package tugaseling3;

import java.util.*;

public class mainkendaraan {
    public static void main(String[] args) {
        kendaraan angkot = new kendaraan("Angkot", 12);
        kendaraan bus = new kendaraan("Bus", 15);

        // Tambahkan penumpang ke angkot dan bus
        angkot.tambahPenumpang(8);
        bus.tambahPenumpang(10);

        // Buat vector untuk daftar kendaraan
        Vector<kendaraan> daftarKendaraan = new Vector<kendaraan>();
        daftarKendaraan.add(angkot);
        daftarKendaraan.add(bus);

        // Tampilkan daftar kendaraan beserta jumlah penumpang
        System.out.println("Daftar Kendaraan:");
        for (kendaraan kendaraan : daftarKendaraan) {
            System.out.println("- " + kendaraan.getJenis() + ": " + kendaraan.getPenumpang() + "/" + kendaraan.getKapasitas() + " penumpang");
        }

        // Buat linked list untuk antrian kendaraan di terminal
        LinkedList<kendaraan> antrianKendaraan = new LinkedList<kendaraan>();
        antrianKendaraan.add(angkot);
        antrianKendaraan.add(angkot);
        antrianKendaraan.add(angkot);
        antrianKendaraan.add(bus);
        antrianKendaraan.add(bus);
        antrianKendaraan.add(bus);

        // Tampilkan antrian kendaraan di terminal
        System.out.println("\nAntrian Kendaraan di Terminal:");
        for (kendaraan kendaraan : antrianKendaraan) {
            System.out.println("- " + kendaraan.getJenis());
        }

        // Buat queue untuk antrian penumpang angkot dan bus
        Queue<String> antrianAngkot = new LinkedList<String>();
        Queue<String> antrianBus = new LinkedList<String>();

        // Tambahkan penumpang ke antrian angkot dan bus
        antrianAngkot.add("Rhea");
        antrianAngkot.add("Sabrina");
        antrianAngkot.add("Faira");
        antrianAngkot.add("Dwi");
        antrianAngkot.add("Asung");
        antrianBus.add("Pipit");
        antrianBus.add("Pipin");
        antrianBus.add("Masmerah");
        antrianBus.add("Mashejo");
        antrianBus.add("manusia aneh");

        // Tampilkan antrian penumpang angkot dan bus
        System.out.println("\nAntrian Penumpang:");
        System.out.println("1. Angkot: ");

        for (String penumpang : antrianAngkot){
            System.out.println("   " + penumpang);
        }
        System.out.println("");

        System.out.println("2. Bus: ");
        for (String penumpang : antrianBus){
            System.out.println("   " + penumpang);
        }
    }
}
