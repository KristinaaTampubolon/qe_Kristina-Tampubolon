package Challenge1

public class Main {
    public static void main(String[] args) {
        //Create Objek persegi
        Persegi persegi = new Persegi();
        //Create Objek segitiga
        Segitiga segitiga = new Segitiga();
        //Create Objek persegiPanjang
        PersegiPanjang persegiPanjang = new PersegiPanjang();

        System.out.println("========Luas========");
        System.out.println("Persegi : " + persegi.getLuas(4));
        System.out.println("Segitiga : " +segitiga.getLuas(3,4));
        System.out.println("Persegi Panjang : " +persegiPanjang.getLuas(7,8));

        System.out.println("========Keliling========");
        System.out.println("Persegi : " + persegi.getKeliling(4));
        System.out.println("Segitiga : " +segitiga.getKeliling(3,4));
        System.out.println("Persegi Panjang : " + persegiPanjang.getKeliling(7,8));
    }
}
