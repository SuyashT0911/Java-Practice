import java.util.*;

public class gameOnMultiDiementionalArray {
    public static void main(String[] args) {
        //declairing ships as a booleans value where 
        //True means ship is present at that spot
        //False means ship is not present at that spot
        boolean[][] ships={
            {false, false, true, false},
            {true, false, false, false},
            {false, false, false, true},
            {false, true, false, false}
        };
        
        int hits = 0;          //indicating how many hits
        int numberOfTurns = 0;//indicating turns taken to hit all 4 targets
        
        Scanner sc = new Scanner(System.in);
        
        while (hits < 4) {    //until the hits are less than four loop will continue executinng sice there is 4 targets
            int row, column;  //accepts position where user wants to shoot
            
            System.out.println( "Selecting Coordinates...\n");
            
            System.out.println("Choose row number between 0 and 3: "); //it will choose the rowise position
            row = sc.nextInt();
            
            System.out.println("Choose column number between 0 and 3: "); //it will select the columnwise position in previously selected row
            column = sc.nextInt();
            
            if (ships[row][column]){  //testing condtion if selected target is true 
                ships[row][column] = false;  //then shoot and update it to false to reduce redundancy
                hits++;  //increase ship hit count by one
                System.out.println("Hit!..." + (4 - hits) + "left.\n\n");  //show how many targets are left out of 4 after hit
            } else {
                System.out.println( "Miss.\n\n");  //if selected co-ordinates are false then print target miss
            }
            numberOfTurns++;  //increase number of turns by one after each try no matter if ship is hit or not
        }

        System.out.println("Victory");  //after successfully hitting all target ship diplay victory
        System.out.println("You won in "+numberOfTurns + " turns.");  //after hitting all target show how much turns user took to win

        sc.close();
    }
}