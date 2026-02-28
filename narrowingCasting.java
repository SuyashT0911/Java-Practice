public class narrowingCasting {
    public static void main(String[] args) {
        int maxScore = 500;
        int userScore = 400;
        double percentage = (double) userScore / maxScore * 100;
        System.out.println("Percentage: " + percentage + "%");
    }
}
