public class B_4_CetakTabelPerkalian {

    private static void cetakTablePerkalian(int n){
        int x;
        int y;
        System.out.println("\t Tabel Perkalian 1 sampai 10 \n");

        for ( x = 1; x < 10; x++) {

            for( y = 1; y < 10; y++){

                System.out.print( x * y + "\t");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        cetakTablePerkalian(3);
    }
}