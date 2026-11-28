import java.util.Scanner;

public class Problema5{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       int n;
        do {
            n = sc.nextInt();
            if (n <= 0) IO.println("Ha de ser un nombre major a 0");
            else break;
        } while (true);

        String[][] v = new String[n][n];
        int[][] z = new int[n][2];

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                String s = sc.next();
                v[i][j]=s;
            }
        }

        for (int i = 0; i < z.length; i++) {
            String petit =v[i][0];
            int x = i;
            int c = 0;

            for (int j = 0; j < z[i].length; j++) {
                if (v[i][j].compareTo(petit) <=0){
                    petit=v[i][j];
                    c=j;
                }
            }
            z[i][0]=x;
            z[i][1]=c;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("[" + z[i][0] + ", " + z[i][1] + "]");
        }
        
        sc.close();
    }

}
