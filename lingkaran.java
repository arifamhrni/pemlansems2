import java.util.Scanner;

public class lingkaran {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double luas, phi = 22 / 7;
            int r;

            System.out.print("Masukkan jari-jari lingkaran : ");
            r =  input.nextInt();

            luas = phi * r * r;

            System.out.println("Hasil luas lingkaran adalah : " + luas);
        }
    }
}