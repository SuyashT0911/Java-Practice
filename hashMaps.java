import java.util.HashMap;
public class hashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        examScores.put("Math", 75);
        examScores.put("Physics", 65);
        examScores.put("English", 90);
        examScores.put("Science", 80);
        examScores.put("Biology", 100);

        // examScores.replace("Math", 70);                   //To replace value of a key

        // examScores.clear();

        // System.out.println(examScores.getOrDefault("Hindi", -1));        //give custome msg if key is not present

        // System.out.println(examScores.size());

        // examScores.remove("English");

        // System.out.println(examScores.containsKey("English"));

        // System.out.println(examScores.containsValue(100));

        // System.out.println(examScores.containsValue(Integer.valueOf(100)));

        // System.out.println(examScores.isEmpty());

        // examScores.forEach((Subject, score) -> {
        //     System.err.println(Subject + " - " + score);
        // });

        examScores.forEach((Subject, score)->{
            examScores.replace(Subject, score - 10);
        });

        System.out.println(examScores.toString());

        // System.out.println(examScores.toString());
        // System.out.println(examScores.get("English"));   //To print specific value of a key
        
    }
}
