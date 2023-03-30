public class main {
    public static void main(String[] args) {
        hero hero1 = new hero("Hero 1");
        hero hero2 = new hero("Hero 2", 120, 15);

        while (hero1.getHp() > 0 && hero2.getHp() > 0) {
            // Hero 1 menyerang Hero 2
            hero2.setHp(hero2.getHp() - hero1.getAtk());
            System.out.println(hero1.getName() + " menyerang " + hero2.getName() + " sebesar " + hero1.getAtk() + " damage");

            // Cek apakah Hero 2 masih hidup
            if (hero2.getHp() <= 0) {
                System.out.println(hero1.getName() + " memenangkan pertarungan!");
                break;
            }

            // Hero 2 menyerang Hero 1
            hero1.setHp(hero1.getHp() - hero2.getAtk());
            System.out.println(hero2.getName() + " menyerang " + hero1.getName() + " sebesar " + hero2.getAtk() + " damage");

            // Cek apakah Hero 1 masih hidup
            if (hero1.getHp() <= 0) {
                System.out.println(hero2.getName() + " memenangkan pertarungan!");
                break;
            }
        }
    }
}
