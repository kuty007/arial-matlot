import java.util.ArrayList;

public class Ex2_2_2 {
    public static void main(String[] args) {
        System.out.println (perfectNumbers(32));
    }

    public static int[] perfectNumbers(int p) {
        ArrayList<Integer> perfectNums = new ArrayList<>();//crate array for the perfect numbers
        for (int i = 6; i <= p; i++) {//loop over the all numbers from the first perfect number(6) til n
            if (Ex2_2_1.isPerfect(i)) {//call to isPerfect to check if the number is perfect number
                perfectNums.add(i);//if so add the number
            }
        }
        return perfectNums.stream().mapToInt(i -> i).toArray();
    }
}
