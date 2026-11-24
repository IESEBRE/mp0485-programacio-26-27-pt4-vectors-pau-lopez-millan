import java.util.Scanner;

public class Problema2{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        do {
            n=sc.nextInt();
            if (n<=0) IO.println("Ha de ser un nombre major a 0");
            else break;
        }while(true);

        String[] v=new String[n];
        int[] z=new int[n];
        int compt=0;

        for (int i = 0; i < v.length; i++) {
            String x;
            do {
                x=sc.next().trim();
                if (x.isEmpty()) IO.println("Ha de ser una cadena no buida");
                else break;
            }while(true);
            v[i]=x;
        }
        char x;
        x=sc.next().charAt(0);
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length(); j++) {
                if (v[i].charAt(j)==x) compt++;
            }
            z[i]=compt;
            compt=0;
        }
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(z[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        sc.close();
    }

}
