public class ArrayUnique {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4 };
        int arr2[] = { 1, 3, 5, 10, 16 };

        int len1 = arr1.length;
        int len2 = arr2.length;

        unique(arr1, arr2, len1, len2);
    }

    static void unique(int arr1[], int arr2[], int len1, int len2) {
        for (int i = 0; i < len1; i++) {
            int j;
            for (j = 0; j < len2; j++) {
                if (arr1[i] == arr2[j]) {
                    break;
                }
            }
            if (j == len2) {
                System.out.print(arr1[i] + " ");
            }
        }
    }
}
