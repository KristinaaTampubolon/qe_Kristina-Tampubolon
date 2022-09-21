import java.util.Scanner;

public class A_4_FaktorBilanganII {
    public static void main(String[] args) {
        int bilangan;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input: ");
        bilangan = keyboard.nextInt();
        System.out.println("Output: ");

        for(int i=bilangan; i >= 0; i--){
            if(bilangan % i == 0){
                System.out.println(i);
            }
        }
    }
}