import java.util.Scanner;

public class userInput{
    public static void main(String[] args) {
        String greeting = "Hello";
        String name;
        int age;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = sc.nextLine();

        System.err.println("Enter your age: ");
        age = sc.nextInt();

        System.err.println(greeting+" "+name+" you are "+age+" years old i guess.");

    }
}