import java.util.Scanner;
public class input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = sc.nextLine();
        
        // System.out.println("Hello "+name);
        System.out.printf("Hello %s, how old are you? ",name);

        // int age = sc.nextInt();
        //this will prevents the need of taking extra scanner by changing data type
        int age = Integer.parseInt(sc.nextLine());
        System.out.printf("Hello %s, so your age is %d, and which language do u like?",name, age);

        //cleans up the input buffer
        // String string =sc.nextLine();

        String lang = sc.nextLine();
        System.out.printf("The %s is really a good language", lang);




        // System.out.println("Enter two integer for addition");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = a+b;

        // System.out.println("The addition of given number is "+c);

        System.out.println("Enter two integers to do addition :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("The addition of given number is "+c);

        sc.close();
    }
}
