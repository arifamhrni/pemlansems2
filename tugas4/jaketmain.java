package tugas4;

import java.util.Scanner;

public class jaketmain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Pilih jaket A, B, atau C (masukkan huruf kapital): ");
        String jenis = scanner.nextLine().toUpperCase();
        
        System.out.print("Masukkan jumlah jaket yang dibeli: ");
        int jumlah = scanner.nextInt();
        
        jaket jaket = new jaket(jenis, jumlah);
        System.out.println("Harga yang harus dibayar adalah: Rp " + jaket.getHarga());
    }
}



