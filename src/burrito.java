import java.util.Scanner;

public class burrito {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        double pi = 3.141592653589793;

        for(int wrap = 0; wrap < n; wrap++){
            int v = Sc.nextInt();
            int r = Sc.nextInt();
            int w = Sc.nextInt();
            int l = Sc.nextInt();

            double h = (double) v / (r*r*pi);
            double c = 2.0*pi*r;
            boolean fits;

            if(c > (h+2*r)){
                if(c <= Math.max(w,l) && (h+2*r) <= Math.min(w,l)){
                    fits = true;
                }
                else{
                    fits = false;
                }
            }
            else {
                if(c <= Math.min(w,l) && (h+2*r) <= Math.max(w,l)){
                    fits = true;
                }
                else{
                    fits = false;
                }
            }

            System.out.print("Burrito #"+(wrap+1)+": ");
            if(fits){
                System.out.print("Don’t worry, the burrito fits!");
            } else{
                System.out.print("Looks like a cold burrito today.");
            }
            System.out.println();
        }
    }
}
