import java.util.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2==1){
            System.out.println("Wierd");
        }else if(N>2&&N<6){
            System.out.println("Not Wierd");
        }else if(N<=20){
            System.out.println("Wierd");
        }else{
            System.out.println("Not Wierd");
        }
        scanner.close();
    }
}
