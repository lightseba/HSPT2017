import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int slabs = Sc.nextInt();

        for(int s = 0; s < slabs; s++){
            int h = Sc.nextInt();
            int w = Sc.nextInt();
            String[] slab = new String[h];

            for(int i = 0; i < h; i++){
                slab[i] = Sc.next();
            }

            ArrayList<Integer> startRow = new ArrayList<Integer>();
            ArrayList<Integer> endRow = new ArrayList<Integer>();
            ArrayList<Integer> startPos = new ArrayList<Integer>();
            int diamonds = 0;
            for(int i = 0; i < h; i++){
                for(int j = 0; j < w; j++){
                    int topPos = slab[i].indexOf("/\\",j);
                    //System.out.println(topPos);



                    if(topPos != -1) {
                        for (int k = i + 1; k < h; k++) {
                            if (slab[k].substring(topPos, topPos + 2).equals("\\/")) {
                                //System.out.println("spotted " + k);

                                boolean valid = false;
                                int layerCount = 2;
                                for(int m = 0; m < ((k-i)-1)/2; m++){
                                    if(slab[i+1+m].substring(topPos-1-m,topPos-m).equals("/") && slab[i+1+m].substring(topPos+2+m,topPos+3+m).equals("\\") && slab[k-1-m].substring(topPos-1-m,topPos-m).equals("\\") && slab[k-1-m].substring(topPos+2+m,topPos+3+m).equals("/")){
                                        layerCount += 2;
                                    }
                                }

                                //System.out.println("layers "+layerCount);
                                if(layerCount == (k-i)+1){
                                    //System.out.println("valid!");
                                    valid = true;
                                    j = topPos+1;
                                    startRow.add(i);
                                    endRow.add(k);
                                    startPos.add(topPos);
                                    diamonds++;

                                }
                            }
                        }
                    }


                }
            }
            String[][] output = new String[h][w];
            for(int q = 0; q < h; q++){
                Arrays.fill(output[q],".");
            }
            for(int d = 0; d < diamonds; d++){

                output[startRow.get(d)][startPos.get(d)] = "/";
                output[startRow.get(d)][startPos.get(d)+1] = "\\";
                output[endRow.get(d)][startPos.get(d)] = "\\";
                output[endRow.get(d)][startPos.get(d)+1] = "/";

                for(int g = 0; g <= (endRow.get(d)-startRow.get(d)-1)/2; g++) {

                    output[startRow.get(d)+g][startPos.get(d)-g] = "/";
                    output[startRow.get(d)+g][startPos.get(d)+1+g] = "\\";
                    output[endRow.get(d)-g][startPos.get(d)-g] = "\\";
                    output[endRow.get(d)-g][startPos.get(d)+1+g] = "/";

                }
            }
            System.out.println("Slab #"+(s+1)+":");
            for(int l = 0; l < h; l++){
                for(int o = 0; o < w; o++){
                    System.out.print(output[l][o]);
                }
                System.out.println();
            }
        }
    }
}
