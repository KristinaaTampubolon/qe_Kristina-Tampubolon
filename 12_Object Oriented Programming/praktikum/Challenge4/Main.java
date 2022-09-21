package Challenge4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OngkosKirim ongkosKirim = new OngkosKirim();

        Scanner input = new Scanner(System.in);

        //Input data
        System.out.println("===Input===");
        System.out.print("Input Panjang: ");
        int length = input.nextInt();
        ongkosKirim.setPanjang(length);

        System.out.print("Input Lebar: ");
        int width = input.nextInt();
        ongkosKirim.setLebar(width);

        System.out.print("Input Tinggi: ");
        int high = input.nextInt();
        ongkosKirim.setTinggi(high);

        ongkosKirim.standarDimensi();
        if (ongkosKirim.getBerat() <= 50){
            System.out.println("Berat: 1 kg");
        } else {
            System.out.println("Berat melebihi batas maksimal");
        }
//        System.out.println("Berat : " + ongkosKirim.getBerat());

        //Output
        System.out.println("===Output===");
        if(ongkosKirim.getBerat() <= 50){
            System.out.println("Harga : Rp 5.000");
        } else {
            System.out.println("Harga : Rp 10.000");
        }
    }
}
