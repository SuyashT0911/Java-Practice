import java.util.Arrays;
public class arrays {
    public static void main(String[] args){


        int numbers[] = {1, 2, 3, 4, 5};
        int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);    //it copys all elements of numbers array

        Arrays.fill(numbers, 0);                                     //fills numbers array with zero
        System.out.println(Arrays.toString(numbers));                    //prints number arrays
        System.out.println(Arrays.toString(copyOfNumbers));              //print copy of numbers array

        // char vowels[] = new char[5];               //This works too
        //char vowels[] = {'a','e','i','o','u'};      //This is sequential array elements
        // char vowels[] = {'i','u','e','a','o'};

        //int startingIndex =1;                         //tells to select array from certain point to sort 
        //int endingIndex =4;                           //tells to select array till certain point to sort but ending point is not included
        //Arrays.sort(vowels, startingIndex, endingIndex);   
        // Arrays.sort(vowels);                            //It sorts unsorted array
        //System.out.println(Arrays.toString(vowels));  //It prints sorted array after sorting

        // char key='o';

        // int foundItemIndex = Arrays.binarySearch(vowels, key);

        //     System.out.println(Arrays.toString(vowels));
        //     System.out.println(foundItemIndex);

// this works too
        // vowels[0]= 'a';
        // vowels[1]= 'e';
        // vowels[2]= 'i';
        // vowels[3]= 'o';
        // vowels[4]= 'u';


        // vowels[2] = 'x';                            //To change a array element of index 2

        // System.out.println(vowels.length);          //To find legth of an array




        // System.out.println(Arrays.toString(vowels));    //prints array


    }
}
