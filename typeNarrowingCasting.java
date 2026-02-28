public class typeNarrowingCasting {
    public static void main(String[] args) {
        // Narrowing Casting (manually) - converting a larger type to a smaller size type
        double myDouble = 9.78; // Widening Casting: double to int
        int myInt = (int) myDouble; // Manual casting: double to int
        System.out.println(myDouble); // Outputs 9.78
        System.out.println(myInt); // Outputs 9
    }
}
