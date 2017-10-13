import java.util.Arrays;
import java.util.Scanner;

public class jump {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        for(int trips = 0; trips < t; trips++) {
            int x = Sc.nextInt();
            int y = Sc.nextInt();
            int n = Sc.nextInt();
            //origin is at bottom left corner

            int[][] tanks = new int[x][y];

            for(int[] row: tanks){
                Arrays.fill(row, 1);
            }
            System.out.println("Trip #"+(trips+1)+":");

            for(int i = 0; i < n; i++){
                String direction = Sc.next();

                if(direction.equals("F")){
                    tanks = upShift(tanks);
                } else if(direction.equals("B")){
                    tanks = downShift(tanks);
                } else if(direction.equals("L")){
                    tanks = leftShift(tanks);
                } else if(direction.equals("R")){
                    tanks = rightShift(tanks);
                }

                int empty = 0;
                for(int k = 0; k < tanks.length; k++){
                    for(int j = 0; j < tanks[k].length; j++){
                        if(tanks[k][j] == 0) empty++;
                    }
                }

                System.out.println((x*y)-empty);
            }
            System.out.println();
        }
    }
    public static int[][] upShift(int[][] inputTank){
        for(int i = 0; i < inputTank.length; i++){
            //for each column
            for(int j = (inputTank[i].length-1); j > 0; j--){
                inputTank[i][j] += inputTank[i][j-1];
                inputTank[i][j-1] = 0;
            }
        }
        return inputTank;
    }

    public static int[][] downShift(int[][] inputTank){
        //1 for up, -1 for down
        for(int i = 0; i < inputTank.length; i++){
            //for each column
            for(int j = 0; j < (inputTank[i].length-1); j++){
                inputTank[i][j] += inputTank[i][j+1];
                inputTank[i][j+1] = 0;
            }
        }
        return inputTank;
    }

    public static int[][] rightShift(int[][] inputTank){
        //1 for up, -1 for down
        for(int i = 0; i < inputTank[0].length; i++){
            //for each column
            for(int j = (inputTank.length-1); j > 0; j--){
                inputTank[j][i] += inputTank[j-1][i];
                inputTank[j-1][i] = 0;
            }
        }
        return inputTank;
    }
    public static int[][] leftShift(int[][] inputTank){
        //1 for up, -1 for down
        for(int i = 0; i < inputTank[0].length; i++){
            //for each column
            for(int j = 0; j < (inputTank.length-1); j++){
                inputTank[j][i] += inputTank[j+1][i];
                inputTank[j+1][i] = 0;
            }
        }
        return inputTank;
    }


}
