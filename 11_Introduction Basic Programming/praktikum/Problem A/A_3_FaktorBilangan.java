import java.util.Scanner;

public class A_3_FaktorBilangan {
    public static void main(String[] args) {
        int bilangan;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input: ");
        bilangan = keyboard.nextInt();
        System.out.println("Output: ");

        for(int i=1; i<= bilangan; i++){
            if(bilangan%i == 0){
                System.out.println(i);
            }
        }
    }
}