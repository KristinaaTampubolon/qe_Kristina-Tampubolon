package Challenge3;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            //New Object
            Kalkulator kalkulator = new Kalkulator();
    
            Scanner input = new Scanner(System.in);
            boolean lanjut = true;
            int choice, result=0;
    
            while (lanjut == true){
                System.out.println("=============================");
                System.out.println("Program Kalkulator Sederhana");
                System.out.println("1. Penjumlahan");
                System.out.println("2. Pengurangan");
                System.out.println("3. Perkalian");
                System.out.println("4. Pembagian");
                System.out.println("5. Exit");
                System.out.println("=============================");
    
                //Pilihan Operasi
                System.out.print("Pilih Operasi : ");
                choice = input.nextInt();
    
                //Input data
                System.out.print("Input Bilangan Pertama: ");
                int numbers1 = input.nextInt();
                kalkulator.setBilangan1(numbers1);
    
                System.out.print("Input Bilangan Kedua: ");
                int numbers2 = input.nextInt();
                kalkulator.setBilangan2(numbers2);
    
                //Switch Case
                switch (choice){
                    case 1 : {
                        kalkulator.penjumlahan();
                        System.out.println("Hasil Penjumlahan : " + kalkulator.getHasil());
                        break;
                    }
                    case 2 : {
                        kalkulator.pengurangan();
                        System.out.println("Hasil Pengurangan : " + kalkulator.getHasil());
                        break;
                    }
                    case 3 : {
                        kalkulator.perkalian();
                        System.out.println("Hasil Perkalian : " + kalkulator.getHasil());
                        break;
                    }
                    case 4 : {
                        kalkulator.pembagian();
                        System.out.println("Hasil Pembagian : " + kalkulator.getHasil());
                        break;
                    }
                    default : {
                        lanjut = false;
                        System.out.println("Input anda salah & Program Berhenti");
                    }
                }
    
            }
    
    
                ;
    
    
        }
}
