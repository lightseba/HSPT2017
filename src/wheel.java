import java.util.Scanner;

public class wheel {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int puzzles = Sc.nextInt();

        for(int t = 0; t < puzzles; t++){
            int n = Sc.nextInt();
            String[] phrases = new String[n];
            for(int p = 0; p < n; p++){
                phrases[p] = Sc.next() + Sc.nextLine();
                System.out.println(phrases[p]);
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.println(phrases[i].substring(0,phrases[i].indexOf(" ")));
                    System.out.println(phrases[j].substring(phrases[j].lastIndexOf(" ")+1));
                    if(phrases[i].substring(0,phrases[i].indexOf(" ")).equals(phrases[j].substring(phrases[j].lastIndexOf(" ")+1))){

                    }
                }
            }
        }
    }
}
