import java.util.Scanner;

public class Problema4{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        do {
            n = sc.nextInt();
            if (n <= 0) IO.println("Ha de ser un nombre major a 0");
            else break;
        } while (true);

        String[] v=new String[n];
        boolean[][] t=new boolean[n][n];

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
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = v[i].contains(v[j]);
            }
        }

        for (int i = 0; i < t.length; i++) {
            System.out.print("[");
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j]);
                if (j < n - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        sc.close();
    }

}
