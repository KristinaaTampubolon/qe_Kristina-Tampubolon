public class PairwithTargetSum {
    public static void main(String[] args) {


        int[] angka = { 2, 5, 9, 11};
        int target = 11;

        cariangka(angka, target);
    }

    private static void cariangka(int angka[], int target) {
        int indeks = -1;
        int indeks01 = -1;
        for (int x = 0; x < angka.length; x++) {
            for (int y = x + 1; y < angka.length; y++) {
                if ((angka[x] + angka[y]) == target) {
                    indeks = x;
                    indeks01 =y ;
                }
            }
        }
        System.out.println("Output : [" + indeks + " , " + indeks01 + "]");
    }
}
