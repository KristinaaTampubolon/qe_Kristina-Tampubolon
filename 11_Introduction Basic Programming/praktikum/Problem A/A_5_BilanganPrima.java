public class A_5_BilanganPrima {

    private static void primeNumber(int number){
        //your code here
        int i, m = 0, flag = 0;
        m = number / 2;
        if (number == 0 || number == 1) {
            System.out.println(false);
        } else {
            for (i = 2; i <= m; i++) {
                if (number % i == 0) {
                    System.out.println(false);
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(true);
            }
        }
    }

    public static void main(String[] args) {
        primeNumber(11); //true
        primeNumber(13); //true
        primeNumber(17); //true
        primeNumber(20); //false
        primeNumber(35); //false
    }
}