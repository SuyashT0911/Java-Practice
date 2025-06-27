public class forLoop {
    public static void main(String[] args){

        int number[] = {1, 2, 3, 4, 5};

        int sum = 0;

        for( int num : number){
            sum += num;
        }
        System.out.println(sum);



        // int num = 11;
        // for(int number = 1; number <=10; number++){

        //     for(int multiplier = 1; multiplier <= 10; multiplier++){
        //         System.out.printf("%d X %d = %d \n", number, multiplier, number*multiplier);
        //     }
        // }



        // int n[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // int sum = 0;

        // for(int index =0; index < n.length; index++){
        //     sum += n[index];
        // }

        // System.out.println(sum);
    }
    
}

