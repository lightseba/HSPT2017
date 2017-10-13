import java.util.Scanner;

public class shoes {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        for(int k = 0; k < t; k++){
            int n =  Sc.nextInt();
            int[] litter = new int[n];
            for(int i = 0; i < n; i++){
                litter[i] = Sc.nextInt();
            }

            for (int i = 0;  i < litter.length - 1;  i++ ) {
                for (int j = i + 1;  j < litter.length;  j++ ) {
                    if ( litter[i]>litter[j] ) {                                             // ascending sort
                        int temp = litter [ i ];
                        litter [ i ] = litter [ j ];    // swapping
                        litter [ j ] = temp;
                    }
                }
            }
            int pairs = 0;
            for(int i = 0; i < n; i++){
                if(i != (n-1)){
                    if(litter[i+1] - 1 == litter[i] || litter[i+1] == litter[i] || litter[i+1] + 1 == litter[i]){

                        i++;
                    }

                }
                pairs++;
            }
            System.out.println("Litter #"+(k+1)+": "+pairs);
        }
    }
}
