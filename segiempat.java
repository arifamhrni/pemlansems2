import java.util.Scanner;

public class segiempat {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a, panjangSisi;
            System.out.print("masukkan panjang sisi segiempat : ");
            panjangSisi = input.nextInt();

            System.out.println("pilihlah operasi berikut : ");
            System.out.println("1. KELILING SEGIEMPAT");
            System.out.println("2. LUAS SEGIEMPAT");
            System.out.println("3. PANJANG DIAGONAL SEGIEMPAT");

            System.out.print("masukkan pilihan anda : ");
            a = input.nextInt(); 

            switch (a) {
                case 1 : System.out.println("keliling segiempat = " + panjangSisi * 4); break;
                case 2 : System.out.println("luas segiempat : " + panjangSisi * 4); break;
                case 3 : System.out.println("panjang diagonal segiempat : " + (Math.sqrt(panjangSisi * panjangSisi + panjangSisi * panjangSisi))); break;
            }
        }





        
    }
    
}
