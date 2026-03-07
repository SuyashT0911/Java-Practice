public class ifelse {
    public static void main(String[] args){
        // int num = 5;
        for(int num=1; num<=50; num++){
            // if(num%2==1){ 
                // System.out.println(num); // odd numbers
            // }

            // if(num%2==0){
                // System.out.println(num); // even numbers
            // }

            for(int mul=1; mul<=10; mul++){
                System.out.printf("%d X %d = %d \n", num, mul, num*mul);
            }
        }
    }
}
