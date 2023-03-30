package tugas3;

//created by Arifa Maharani Salsabil
//kelas ti-e
//PemLan


public class hero {
    private String nama;
    private double hp;
    private double atk;

    public hero(String nama, double hp, double atk) {
        this.nama = nama;
        this.hp = hp;
        this.atk = atk;
    }

    public hero (){}

    
    public void setNama (String nama){
        this.nama = nama;
    }

    public void setAtk (double atk){
        this.atk = atk;
    }

    public void setHp (double hp){
        this.hp = hp;
    }

    public String getNama (){
        return this.nama;
    }

    public double getAtk (){
        return this.atk;
    }

    public double getHp (){
        return this.hp;
    }
    
    public void opening (){
        System.out.println("======================");
        System.out.println();
        System.out.println("WELCOME TO HERO GAME");
        System.out.println();
        System.out.println("======================");
        System.out.println();
    }

    public void infohero(){
        System.out.println("Nama hero\t\t: " + this.nama);
        System.out.println("Attack hero\t\t: " + this.atk);
        System.out.println("Health point hero\t: " + this.hp);
        System.out.println();
    }
}
