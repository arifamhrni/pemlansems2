package tugaseling2;

public class kendaraan {}

class mobil{}

class angkot extends mobil{
    private DriverAngkot driverAngkot;
    private Penumpang[] daftarPenumpang;

    public angkot(DriverAngkot driverAngkot) {
        this.driverAngkot = driverAngkot;
        this.daftarPenumpang = new Penumpang[4]; 
      }
      public angkot() {
    }
    public DriverAngkot getDriverAngkot() {
        return driverAngkot;
      }
      public Penumpang[] getPenumpang() {
        return daftarPenumpang;
      }

      public void getDaftarPenumpang() {
        for (Penumpang penumpang : getPenumpang()) {
            System.out.println(penumpang.nama);
        }
      
    }
}
class bus extends mobil{
    private DriverBus driverBus;
    private Penumpang[] daftarPenumpang;
    public Object[] penumpangs;

    public bus(DriverBus driverBus) {
        this.driverBus = driverBus;
        this.daftarPenumpang = new Penumpang[5];
      }

      public bus() {
	}
    
    public DriverBus getDriverBus() {
        return driverBus;
      }

      public Penumpang[] getDaftarPenumpang() {
        return daftarPenumpang;
      }

      public void getPenumpang() {
        for (int i = 0; i< penumpangs.length; i++){
            System.out.println(penumpangs[i]);
        }
    }
}
    

class orang{}
class driverBus extends orang{
    String nama;
    boolean simB;

    public void setNama(String nama){
        this.nama = nama;
    }

    public driverBus() {
        this.simB = true;
      }
      public boolean isSimB() {
        return simB;
      }
      public void narikBus(boolean status) {
        if (status) {
            System.out.println("Saya sedang menarik bus");
          } else {
            System.out.println("Saya berhenti menarik bus");
          }
      }

}

class driverAngkot extends orang{
    private boolean simA;

    public driverAngkot() {
        this.simA = true;
      }
      public boolean isSimA() {
        return simA;
      }
      public void narikAngkot(boolean status) {
        if (status) {
            System.out.println("Saya sedang menarik angkot");
          } else {
            System.out.println("Saya berhenti menarik angkot");
          }
      }

}

class penumpang extends orang{
    private boolean[] naik;
    private boolean[] turun;
    private String nama;

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

      void Naik(angkot i){
        System.out.println("Penumpang bernama " + this.nama +" naik angkot");
    }
    void Turun(){
        System.out.println("Penumpang bernama " + this.nama +" turun angkot");
    }
}