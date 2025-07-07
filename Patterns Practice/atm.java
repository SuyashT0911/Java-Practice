import java.util.*;
public class atm {

    static int balance=5000;
    public static int withdraw(int amount)
    {
        int result = 0;
        try {
            
            if (amount > balance || amount < 0) {
                throw new Exception("Invalid amount or insufficient balance");
            } else {
                result = balance - amount;
                System.out.println("Withdraw is successful");
                balance = result;
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
    public static int deposit(int amount)
    {
        balance = balance + amount;
        return balance;
    }
    public static void main(String[] args) {
        int amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the withdraw amount");
        amount=sc.nextInt();
        System.out.println("status"+withdraw(amount));
        System.out.println("Enter the deposit amount");
        amount=sc.nextInt();
        System.out.println("status"+deposit(amount)); 
    }

}
