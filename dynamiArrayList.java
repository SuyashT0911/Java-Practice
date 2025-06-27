import java.util.ArrayList;
public class dynamiArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();

        num.add(4);
        num.add(2);
        num.add(1);
        num.add(5);
        num.add(3);

        // num.remove(3);                             //remove element by index
        // num.remove(Integer.valueOf(3));            //remove element by value
        // num.clear();                               //clear array list

        // num.set(2, 9);                             //replace value both works same
        // num.set(2, Integer.valueOf(10));           //replace value

        // num.sort(Comparator.naturalOrder());       //Sort ascending
        // num.sort(Comparator.reverseOrder());       //sort decending

        System.out.println(num.toString());
        // System.out.println(num.get(3));            //print single value

        // System.out.println(num.size());            //print number of elements

        // System.out.println(num.contains(Integer.valueOf(1)));           //To check if array contains a perticular element
        // System.out.println(num.isEmpty());         //To check if array list is empty or not

    }
}
