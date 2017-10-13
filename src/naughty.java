import java.util.Scanner;

public class naughty {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int y = Sc.nextInt();

        for (int i = 0; i < y; i++) {
            int h = Sc.nextInt();
            int d = Sc.nextInt();
            int[] houseHits = new int[h];


            for (int j = 0; j < d; j++) {
                int s = Sc.nextInt();
                int k = Sc.nextInt();
                int p = Sc.nextInt();
                int currentHouse = s;
                int hits = 0;

                while(hits < p && currentHouse < h){
                    System.out.println("hit "+currentHouse);
                    houseHits[currentHouse-1]++;
                    currentHouse += k;
                    hits++;
                }

            }
            int giftPos = 0;
            int giftHits = houseHits[0];
            for(int j = 1; j < h; j++){
                if(houseHits[j]>giftHits){
                    giftHits = houseHits[j];
                    giftPos = j;
                }
            }
            System.out.println("House "+ (giftPos+1) +" should get the biggest and best gift next Christmas.");

        }
    }

}
