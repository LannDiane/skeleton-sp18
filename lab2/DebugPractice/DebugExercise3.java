/**
 * Created by jug on 1/22/18.
 */
public class DebugExercise3 {
    private static String name = "Lann";
    public static int countTurnips(In in) {
        int totalTurnips = 0;
        while (!in.isEmpty()) {
            String vendor = in.readString();
            String foodType = in.readString();
            double cost = in.readDouble();
            int numAvailable = in.readInt();
            if (foodType.equals("turnip")) {
                int newTotal = totalTurnips + numAvailable;
                totalTurnips = newTotal;
            }
            in.readLine();
        }
        return totalTurnips;
    }
    public static int fib(int n){
        if(n == 0){
            return 0;
        }
        if(n ==1 || n ==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        //如果是System.out.println(name)则默认执行成员变量;
        //System.out.println(DebugExercise3.name);
        In in = new In("foods.csv");
        System.out.println(countTurnips(in));
//        System.out.println(fib(4));
    }
}
