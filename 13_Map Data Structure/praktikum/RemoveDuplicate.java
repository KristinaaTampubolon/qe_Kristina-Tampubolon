public class RemoveDuplicate {
    private static int hapusDuplikat(int[] angka) {
        int count = 0;
        for (int i = 0; i < angka.length; i++) {

            if (i < angka.length - 1 && angka[i] == angka[i + 1]) {
                continue;
            }

            angka[count] = angka[i];
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Output untuk input [2, 3, 3, 3, 6, 9, 9] : " + hapusDuplikat(new int[]{2,3,3,3,6,9,9}));
        System.out.println("Output untuk input [2, 2, 2, 11] : " + hapusDuplikat(new int[]{2, 2, 2, 11}));
    }
}
