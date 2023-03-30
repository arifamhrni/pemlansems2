public class hero {
    private String name;
    private double hp;
    private double atk;

    public hero(String name, double hp, double atk) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }

    public hero(String name) {
        this.name = name;
        this.hp = 100;
        this.atk = 10;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getAtk() {
        return atk;
    }

    public void setAtk(double atk) {
        this.atk = atk;
    }
}

