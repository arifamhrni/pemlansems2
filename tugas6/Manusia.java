package tugas6;
import java.time.LocalDate;

public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    // Menghitung tunjangan berdasarkan status pernikahan
    public double getTunjangan() {
        if (menikah) {
            return jenisKelamin ? 25.0 : 20.0;
        } else {
            return 15.0;
        }
    }

    // Menghitung pendapatan dengan tambahan tunjangan
    public double getPendapatan() {
        return getTunjangan();
    }

    // Menampilkan informasi objek Manusia
    public String toString() {
        String jenis = jenisKelamin ? "Laki-laki" : "Perempuan";
        return "Nama: " + nama + "\n" +
                "NIK: " + nik + "\n" +
                "Jenis Kelamin: " + jenis + "\n" +
                "Pendapatan: $" + getPendapatan();
    }
}
 
class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    // Getter dan Setter
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // Menghitung beasiswa berdasarkan IPK
    public double getBeasiswa() {
        if (ipk >= 3.0 && ipk <= 3.5) {
            return 50.0;
        } else if (ipk > 3.5 && ipk <= 4.0) {
            return 75.0;
        } else {
            return 0.0;
        }
    }
     // Mendapatkan status berdasarkan angkatan dan prodi
     public String getStatus() {
        String angkatan = nim.substring(0, 2);
        String prodi = nim.substring(6, 7);
        String status = "";

        switch (prodi) {
            case "2":
                status = "Teknik Informatika";
                break;
            case "3":
                status = "Teknik Komputer";
                break;
            case "4":
                status = "Sistem Informasi";
                break;
            case "6":
                status = "Pendidikan Teknologi Informasi";
                break;
            case "7":
                status = "Teknologi Informasi";
                break;
            default:
                status = "Unknown";
                break;
        }

        return status + ", 20" + angkatan;
    }

    // Menampilkan informasi objek MahasiswaFILKOM
    public String toString() {
        return super.toString() + "\n" +
                "NIM: " + nim + "\n" +
                "IPK: " + ipk + "\n" +
                "Status: " + getStatus();
    }
}
class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    // Getter dan Setter
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    // Menghitung bonus berdasarkan lama bekerja
    public double getBonus() {
        int lamaBekerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (lamaBekerja >= 0 && lamaBekerja <= 5) {
            return gaji * 0.05;
        } else if (lamaBekerja > 5 && lamaBekerja <= 10) {
            return gaji * 0.1;
        } else if (lamaBekerja > 10) {
            return gaji * 0.15;
        } else {
            return 0.0;
        }
    }

    // Menghitung pendapatan dengan tambahan bonus dan tunjangan anak
    public double getPendapatan() {
        return super.getPendapatan() + getBonus() + (jumlahAnak * 20);
    }

    // Menampilkan informasi objek Pekerja
    public String toString() {
        return super.toString() + "\n" +
                "Tahun Masuk: " + tahunMasuk.getYear() + "\n" +
                "Jumlah Anak: " + jumlahAnak + "\n" +
                "Gaji: $" + gaji;
    }
}
class Manager extends Pekerja {
    private String departemen;

    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak, String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    // Getter dan Setter
    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    // Menghitung tunjangan manager
    public double getTunjangan() {
        return super.getGaji() * 0.1;
    }

    // Menghitung pendapatan dengan tambahan tunjangan manager
    public double getPendapatan() {
        return super.getPendapatan() + getTunjangan();
    }

    // Menampilkan informasi objek Manager
    public String toString() {
        return super.toString() + "\n" +
                "Departemen: " + departemen;
    }
}