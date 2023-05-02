package tugas5;

public class jaket {
    public static int perjumlahan(int a, int b) { //menggunakan static
        return a + b;
    }

    public static int pengurangan(int a, int b) { //menggunakan static
        return a - b;
    }

    public double perkalian(double a, double b) { //tidak menggunakan static
        return a * b;
    }

    public double pembagan(double a, double b) { //tidak menggunakan static
        return a / b;
    }

    public void Sederhana(int a, int b) {
        int fpb = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                fpb = i;
            }
        }
        System.out.println((a / fpb) + "/" + (b / fpb));
    }
}
