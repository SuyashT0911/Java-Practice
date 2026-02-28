public class typeWideningCasting {
    public static void main(String[] args) {
        // Widening Casting (automatically) - converting a smaller type to a larger type size
        int myInt = 9;  // Widening Casting: int to double
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt); // Outputs 9
        System.out.println(myDouble); // Outputs 9.0
    }
}
