public class Ex2_4_2 {
    public static void main(String[] args) {
        System.out.println(dec2Hex(-245));
    }

    public static String dec2Hex(int num) {
        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int left;
        int x = num;
        num = Math.abs(num);//handle with negative numbers
        if (num == 0)
            return "0";
        String hexNum = "";
        while (num > 0) {
            left = num % 16;
            hexNum = hex[left] + hexNum;//add the char that represent the left form n%16
            num = num / 16;
        }
        if (x < 0)
            hexNum = "-" + hexNum;//if n was negative add the char '-'
        return hexNum;
    }
}
