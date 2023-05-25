package tugas8;

public class Main {
    public static void main(String[] args) {
        //informasi karyawan 1
        Invoice invoice1 = new Invoice("Macbook Pro", 2, 1500000);
        Invoice invoice2 = new Invoice("Tiket konser Coldplay", 1, 2000000);
        Invoice[] invoices = {invoice1, invoice2};

        Employee employee = new Employee(11035, "Asung", 10000000, invoices);
        
        System.out.println("INFORMASI KARYAWAN");
        System.out.println("Nomor Karyawan: " + employee.getRegistrationNumber());
        System.out.println("Nama : " + employee.getName());
        System.out.println("Gaji per bulan: " + "Rp." + employee.getSalaryPerMonth());
        System.out.println();

        System.out.println("TAGIHAN KARYAWAN");
        for (Invoice invoice : employee.getInvoices()) {
            System.out.println("Produk : " + invoice.getProductName());
            System.out.println("Jumlah : " + invoice.getQuantity());
            System.out.println("Harga per produk : " + "Rp." + invoice.getPricePerItem());
            System.out.println();
        }

        System.out.println("Total yang harus dibayar : " + "Rp. " + employee.getPayableAmount());
        System.out.println("Gaji bersih : " + "Rp." + employee.getNetSalary());
        System.out.println(" ");
        System.out.println(" ");


        //karyawan 2
        Invoice invoice3 = new Invoice("Iphone 20 Pro Max", 1, 3000000);
        Invoice invoice4 = new Invoice("IWatch Series 19", 3, 1500000);
        Invoice[] invoicesA = {invoice3, invoice4};

        Employee employee1 = new Employee(11033, "Rhea", 10000000, invoicesA);

        System.out.println("INFORMASI KARYAWAN");
        System.out.println("Nomor Karyawan: " + employee1.getRegistrationNumber());
        System.out.println("Nama : " + employee1.getName());
        System.out.println("Gaji per bulan: " + "Rp." + employee1.getSalaryPerMonth());
        System.out.println();

        System.out.println("TAGIHAN KARYAWAN");
        for (Invoice invoicesAInvoice : employee1.getInvoices()) {
            System.out.println("Produk : " + invoicesAInvoice.getProductName());
            System.out.println("Jumlah : " + invoicesAInvoice.getQuantity());
            System.out.println("Harga per produk : " + "Rp." + invoicesAInvoice.getPricePerItem());
            System.out.println();
        }

        System.out.println("Total yang harus dibayar : " + "Rp. " + employee1.getPayableAmount());
        System.out.println("Gaji bersih : " + "Rp." + employee1.getNetSalary());
    }
}

