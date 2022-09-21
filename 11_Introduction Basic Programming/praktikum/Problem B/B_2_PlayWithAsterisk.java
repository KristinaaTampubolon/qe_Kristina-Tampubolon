public class B_2_PlayWithAsterisk {

    private static void playWithAsterisk(int n){
        //your code here
        for (int b = 1; b <= n; b++){
            for( int e = b; e <= n-1; e++){
                System.out.print(' ');
            }
            for (int c = b; c >= b; c--) {
                System.out.print(' ');
            }
            for (int d = 1; d <= b; d++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        playWithAsterisk(5);
    }
}