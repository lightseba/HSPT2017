import java.util.ArrayList;
import java.util.Scanner;

public class yertle {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int p = Sc.nextInt();

        for(int pond = 0; pond < p; pond++){
            int n = Sc.nextInt();
            int w = Sc.nextInt();
            int[] s = new int[n];
            int counter = 0;
            int possibleRows = 0;
            int lastNum = 0;

            for(int j = 0; j < (n-1); j++){
                s[j] = Sc.nextInt();
            }
            s[n-1] = 0;

            for(int k = 1; k < n; k++){
                if((k*(k+1))/2 < n){
                    possibleRows = k;
                }
                else k = n;
            }

            for (int i = 0;  i < s.length - 1;  i++ ) {
                for (int j = i + 1;  j < s.length;  j++ ) {
                    if ( s[i]>s[j] ) {                                             // ascending sort
                        int temp = s [ i ];
                        s [ i ] = s [ j ];    // swapping
                        s [ j ] = temp;
                    }
                }
            }

            int sPos = 1;
            boolean scan = true;
            ArrayList<Integer> pyramid = new ArrayList<Integer>();
            pyramid.add(0);


            for(int row = 1; row < possibleRows; row++){
                for(int pos = 0; pos <= row; pos++){

                }
            }

            /*for(int row = 1; row < possibleRows; row++){

                while(scan) {
                    if ((double) s[sPos] > (pyramidWeights[row - 1][0]+w)/2.0) {
                        pyramidWeights[row][0] = s[sPos];
                        scan = false;
                    }
                    else{
                        if(sPos == (s.length-1)){

                        }
                        else sPos++;
                    }
                }
                for(int pos = 1; pos < row; pos++){

                    pyramidWeights[row][pos] =
                }
            }*/

        }
    }
}
