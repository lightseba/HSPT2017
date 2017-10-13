import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int c = Sc.nextInt();
        for(int k = 0; k < c; k++){
            int n = Sc.nextInt();
            int total = 2;
            for(int i = 1; i < n; i++){
                total = total*2;
            }
            System.out.println((total-1));
        }
    }
}
