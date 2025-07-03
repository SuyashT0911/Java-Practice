import java.util.Scanner;

public class switchPractice {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

        System.out.println("Enter 1st digit: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter a operator: ");
        char op = sc.next().charAt(0);

        System.out.println("Enter 2nd number: ");
        double num2 = sc.nextDouble();

        double result;

        switch (op) {
            case '+' :
                result = num1 + num2;
                System.out.println(result);
                break;
            case '-' :
                result = num1 - num2;
                System.out.println(result);
                break;
            case '*' :
                result = num1 * num2;
                System.out.println(result);
                break;
            case '/' :
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println(result);
            }else{
                System.out.println("Cannot devide by 0");
            }
                break;
            case '%' :
                result = num1 % num2;
                System.out.println(result);
                break;
            default:
                System.out.println("Enter correct Operator");
        }
        sc.close();
    }}
}
