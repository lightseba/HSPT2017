import java.util.Scanner;

public class shift {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int p = Sc.nextInt();
        String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ~!@#$%^&*()_+{}|:\"<>?";
        for(int text = 0; text < p; text++){
            String input = Sc.next();
            String input2 = Sc.nextLine();
            input = input + input2;
            boolean scan = true;
            int shifts = 0;

            for(int i = 0; i < input.length(); i++){
                int start = -1;
                int end = -1;

                if(caps.indexOf(input.substring(i,i+1)) != -1) {
                    start = i;
                    for (int j = i + 1; j < input.length(); j++) {
                        if (caps.indexOf(input.substring(j, j + 1)) != -1) {
                            end = j+1;
                            i = end;
                        } else {
                            j = input.length();
                        }
                    }
                    shifts++;
                    //System.out.println("start: "+start);
                    //System.out.println("end: "+end);
                }

            }
            System.out.println("The shift key was pressed "+shifts+" times.");
        }
    }
}
