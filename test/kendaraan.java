package test;

class kendaraan {
    public String jeniskendaraan;

    public kendaraan(String jeniskendaraan){
        this.jeniskendaraan = jeniskendaraan;
    }

}

class angkot extends kendaraan{
    public String driverAngkot;
    public String[] daftarPenumpangANGKOT;

    public angkot(String driverAngkot, String[] daftarPenumpangANGKOT){
        this.driverAngkot = driverAngkot;
        this.daftarPenumpangANGKOT = daftarPenumpangANGKOT;
    }
}

class bus extends kendaraan{
    public String driveBus;
    public String[] daftarpenumpangBUS;

    public bus(String driveBus, String[] daftarpenumpangBUS){
        this.driveBus = driveBus;
        this.daftarpenumpangBUS = daftarpenumpangBUS;
    }
}

class orang{
    public String nama;
    public String jeniskelamin;
}

class driverAngkot extends orang{
    public Boolean SIM_A;
}

class driverBus extends orang{
    public Boolean SIM_B;
}

class penumpang extends orang{
    
}

