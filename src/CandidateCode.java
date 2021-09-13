import java.lang.annotation.ElementType;
import java.util.Scanner;

public class CandidateCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String virus = sc.nextLine();
        int n = sc.nextInt();
        while (n!=0){
            String name = sc.next();
            if(conversion(name,virus)){
                System.out.println("POSITIVE");
            }
            else {
                System.out.println("NEGATIVE");
            }
            n--;
        }

    }
    public static boolean conversion(String name,String virus){
        char[] name1 = name.toCharArray();
        char[] virus1 = virus.toCharArray();
        int j = 0;
        int k = 0;
        for (int i = 0; i < name1.length; i++) {
            for ( j = k; j < virus1.length; j++) {
                if(name1[i] == virus1[j]){

//                    System.out.print("i: "+i);
//                    System.out.print(" K: "+k);
//                    System.out.print(" j: "+j);
//                    System.out.print(" n: "+name1[i]);
//                    System.out.print(" v: "+virus1[j]);
//                    System.out.println();
                    k=j+1;
                    break;
                }

                }
            if (j == virus1.length){
                return false;
            }
        }
        return true;
    }
}
