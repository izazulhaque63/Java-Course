package inheritence;

public class inheritenceTest {
    public static void main(String[] args) {
        vheicle vheicle = new vheicle();


        twowheeler twowheeler = new twowheeler();
        vheicle.commute();
        twowheeler.commute();
        twowheeler.balance();

        motorcycle moto = new motorcycle();
        moto.commute();
        moto.balance();
        moto.start();

    }
}
