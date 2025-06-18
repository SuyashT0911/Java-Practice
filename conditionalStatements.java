import java.util.Scanner;

public class conditionalStatements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second number");
        double num2 = sc.nextDouble();
        sc.nextLine();

        System.out.println("1.Additiona");
        System.out.println("2.Subtraction");
        System.out.println("3.Devison");
        System.out.println("4.Multiplication");

        System.out.println("What do u want to do?");
        String op = sc.nextLine();

        if (op.equals("Addition")){
            double result = num1 +num2;
            System.out.println(result);
        }else if (op.equals("Subtraction")){
            double result = num1 -num2;
            System.out.println(result);
        }else if (op.equals("Multiplication")){
            double result = num1 *num2;
            System.out.println(result);
        }else if (op.equals("Devision")){
            if (num2 == 0){
                System.out.println("Cannot devide by zero");
            } else{
                double result = num1 /num2;
                System.out.println(result);
            }
        }

        // System.out.println("1.Additiona");
        // System.out.println("2.Subtraction");
        // System.out.println("3.Devison");
        // System.out.println("4.Multiplication");
        // String operation =sc.nextLine();


        // switch (operation){
        //     case "1"-> System.out.println(num1+num2);
        //     case "2"-> System.out.println(num1-num2);
        //     case "3"-> System.out.println(num1/num2);
        //     case "4"-> System.out.println(num1*num2);
        // }

        sc.close();
    }
    
}
