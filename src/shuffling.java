import java.util.Scanner;

public class shuffling {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int t = Sc.nextInt();
        for(int spree = 0; spree < t; spree++){
            int n = Sc.nextInt();
            int k = Sc.nextInt();
            int[] newDeck = new int[n];
            int[] oldDeck = new int[n];
            int[] perm = new int[n];

            for(int i = 0; i < n; i++){
                oldDeck[i] = i+1;
                perm[i] = Sc.nextInt();
            }

            for(int days = 0; days < k; days++){

                for(int i = 0; i < n; i++){
                    newDeck[i] = oldDeck[perm[i]-1];
                }


                for(int i = 0; i < n; i++){
                    oldDeck[i] = newDeck[i];
                }

            }
            System.out.println();
            for(int i = 0; i < n; i++){
                System.out.print(newDeck[i]+" ");
            }
        }
    }
}
