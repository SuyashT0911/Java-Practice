import java.util.Scanner;
public class switchExpression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day of the week: " );
        String day = sc.nextLine();
        // String day = "Friday";
        String result = "";

        switch (day){
            case "Saturday", "Sunday" -> result = "7am";
            case "Monday" -> result = "8am";
            default -> result = "6am";
        }
        System.out.println(result);
    }
}
