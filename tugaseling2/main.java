package tugaseling2;

public class main {
    public static void main(String[] args, char[] penumpang) {
        
        
        angkot angkot1 = new angkot();
        angkot1.getPenumpang()[0] = new Penumpang("Arifa");
        angkot1.getPenumpang()[1] = new Penumpang("della");
        angkot1.getPenumpang()[2] = new Penumpang("kayla");
        angkot1.getPenumpang()[3] = new Penumpang("nakochi");
        angkot1.getPenumpang();
        angkot1.getPenumpang()[0].Naik(angkot1);
        angkot1.getPenumpang()[1].Turun();
        System.out.println("= " + penumpang);

        bus bus1 = new bus();
        bus1.getDaftarPenumpang()[0] = new Penumpang("ipel");
        bus1.getDaftarPenumpang()[1] = new Penumpang("ripan");
        bus1.getDaftarPenumpang()[2] = new Penumpang("nisot");
        bus1.getDaftarPenumpang()[3] = new Penumpang("taniya");
        bus1.getDaftarPenumpang()[4] = new Penumpang("bidah");
        bus1.getDaftarPenumpang();
        bus1.getDaftarPenumpang()[0].Naik(angkot1);
        bus1.getDaftarPenumpang()[1].Turun();
        System.out.println();
    }
}
