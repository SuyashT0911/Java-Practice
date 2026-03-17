import java.util.Scanner;
public class switchExpression2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day of the week: " );
        String day = sc.nextLine();
        // String day = "Friday";
        String result = "";

        result = switch (day){
            // case "Saturday", "Sunday" -> "7am";       This is without using yield keyword but you have to use -> arrow to return the value from the switch expression
            // case "Monday" -> "8am";
            // default -> "6am";

            // OR

            // if you dont want to you -> arrow you can use yield keyword with defferent type of operators like : 
            // and comma but you have to use yield keyword to return the value from the switch expression

            case "Saturday", "Sunday" : yield "7am";
            case "Monday" : yield "8am";
            default : yield "6am";

        };
        System.out.println(result);
    }
}
