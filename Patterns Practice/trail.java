public class trail {
	public static void main(String[] args) {
        int n =5;
        for(int i=1; i<=n; i++){          //i = inner loop
            for (int o=0; o<n; o++){      //o = outer loop
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
