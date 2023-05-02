package tugaseling2;

public class kendaraan {}

class mobil{}

class angkot extends mobil{
    private DriverAngkot driverAngkot;
    private Penumpang[] daftarPenumpang;

    public angkot() {
    }

    public angkot(DriverAngkot driverAngkot) {
        this.driverAngkot = driverAngkot;
      }

      public angkot(Penumpang[] daftarPenumpang){
        this.daftarPenumpang = new Penumpang[4]; 
      }
      
      public DriverAngkot getDriverAngkot() {
        return driverAngkot;
      }
      public Penumpang[] getPenumpang() {
        return daftarPenumpang;
      }

      public void getDaftarPenumpang() {
        for (Penumpang penumpang : getPenumpang()) {
            System.out.println("Nama penumpangnya adalah = " + penumpang);
        }
      
    }
}
class bus extends mobil{
    private DriverBus driverBus;
    private Penumpang[] daftarPenumpang;


    public bus() {

    }

    public bus(DriverBus driverBus) {
        this.driverBus = driverBus;
      }

      public bus(Penumpang[] daftarPenumpan) {
        this.daftarPenumpang = new Penumpang[5];
      }
    
      public DriverBus getDriverBus() {
        return driverBus;
      }

      public Penumpang[] getDaftarPenumpang() {
        return daftarPenumpang;
      }

      public void getPenumpang() {
        for (int i = 0; i< daftarPenumpang.length; i++){
            System.out.println("Nama penumpang bus adalah = " + daftarPenumpang[i]);
        }
    }
}
    

class orang{}
class driverBus extends orang{
    public String nama;
    public boolean simB;

    public void setNama(String nama){
        this.nama = nama;
    }

    public driverBus() {
        this.simB = true;
      }
      public boolean isSimB() {
        return simB;
      }

}

class driverAngkot extends orang{
    public boolean simA;
    public String nama;

    public void setNama(String nama){
      this.nama = nama;
  }

    public driverAngkot() {
        this.simA = true;
      }
      public boolean isSimA() {
        return simA;
      }

}

class penumpang extends orang{
    public boolean[] naik;
    public boolean[] turun;
    public String nama;

    public penumpang(String nama){
        this.nama = nama;
    }

    public penumpang() {
        this.naik = new boolean[5];
        this.turun = new boolean[5];
      }
      public boolean[] getNaik() {
        return naik;
      }
      public boolean[] getTurun() {
        return turun;
      }
      
}