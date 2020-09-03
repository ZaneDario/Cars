package Ex2;

public class Main {
    public static void main(String[] args) {

        Miner m = new Miner(14);
        m.Talk();
        System.out.println(m.getVacations());
        m.setVacations(10);
        System.out.println(m.getVacations());
    }
}
