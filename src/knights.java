import java.util.Scanner;

public class knights {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();

        for(int num = 0; num <= t; num++){
            String input = Sc.nextLine();
            boolean knights = false;
            boolean pirates = false;
            boolean ninjas = false;

            for(int i = 0; i < input.length(); i++){
                if(Integer.parseInt(input.substring(i,i+1)) > 4){
                    pirates = true;
                }
                else if(Integer.parseInt(input.substring(i,i+1)) == 0){
                    ninjas = true;
                }
                else if(Integer.parseInt(input.substring(i,i+1)) == 1){
                    knights = true;
                }
            }
            System.out.println();
            System.out.print(input);
            if(knights) System.out.print(" knights");
            if(pirates) System.out.print(" pirates");
            if(ninjas) System.out.print(" ninjas");
        }
    }
}
