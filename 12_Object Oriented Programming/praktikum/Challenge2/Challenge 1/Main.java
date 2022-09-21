package Challenge2;

public class Main {
    public static void main(String[] args) {

        Kubus kubus = new Kubus();
        Balok balok = new Balok();
        Tabung tabung = new Tabung();

        System.out.println("========Volume========");
        System.out.println("Kubus : " + kubus.getVolume(10) );
        System.out.println("Balok : " + balok.getVolume(3,6,10));
        System.out.println("Tabung : " + tabung.getVolume(7,10));
    }
}
