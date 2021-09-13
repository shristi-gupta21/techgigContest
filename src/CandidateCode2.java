import java.util.Scanner;

public class CandidateCode2 {
    public static void main(String[] args) {
        //System.out.println(isPrime(14));
        //System.out.println(arrPrime(1,10));
        Scanner sc= new Scanner(System.in);
        //System.out.println("Inputs: ");

        int input = sc.nextInt();
        while (input != 0){
            //System.out.println("Start: ");
            int start = sc.nextInt();
            //System.out.println("End: ");
            int end = sc.nextInt();
            System.out.println(arrPrime(start, end));
            input--;
        }
    }

    public static int arrPrime(int start, int end){
        int[] temp = new int[(end - start) + 1];
        int j = 0;
        int i = 0;

        for (i = start; i <= end ; i++) {
            if (isPrime(i)){
                temp[j] = i;
                j++;
            }
        }
        if (j == 0){
            return -1;
        }

        int result = temp[j-1] - temp[0];
        return result;

    }

    public static boolean isPrime(int arrayElement){

        if (arrayElement == 0 || arrayElement == 1 ){
            return false;
        }
        if (arrayElement == 2){
            return true;
        }
        if (arrayElement%2==0){
            return false;
        }

        for (int i = 2; i <= arrayElement/2 ; i++) {
            if (arrayElement%i==0){//7 7%4 !=0 // 7%5 != 0 // 7
                return false;
            }
        }
        return true;
    }
}
