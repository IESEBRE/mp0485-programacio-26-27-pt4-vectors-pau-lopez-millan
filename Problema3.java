import java.util.Scanner;

public class Problema3{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        do {
            n=sc.nextInt();
            if (n<0) IO.println("Ha de ser un nombre igual o major a 0");
            else break;
        }while(true);

        String[] v=new String[n];
        boolean[] t=new boolean[n];

        for (int i = 0; i < v.length; i++) {
            String x;
            do {
                x=sc.next().trim();
                if (x.isEmpty()) IO.println("Ha de ser una cadena no buida");
                else break;
            }while(true);
            v[i]=x;
        }

        for (int i = 0; i < t.length; i++) {
            String l = v[i].substring(0, 1);

            t[i] = v[i].startsWith(l) && v[i].endsWith(l);
        }
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(t[i]);

            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        sc.close();
    }

}
