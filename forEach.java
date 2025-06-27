
import java.util.ArrayList;

public class forEach {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();

        num.add(2);
        num.add(4);
        num.add(1);
        num.add(5);
        num.add(3);

        System.out.println("befor: "+num.toString());

        num.forEach(number ->{
            num.set(num.indexOf(number), number*2);
            // System.out.println(number *2);
        });

        System.out.println("after: "+num.toString());
    }
}
