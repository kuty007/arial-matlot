public class Ex2_4_1 {
    public static void main(String[] args) {
        System.out.println(hex2Dec("45A"));
    }
    public static int hex2Dec(String hex) {
        String hexNums = "0123456789ABCDEF";
        char sign = '+';
        if(hex.charAt(0)=='-'){//if we get negative number replace the sign
            sign = '-';
            hex=hex.replaceFirst("-","");//remove the - sign from the hex number
        }
        int sum = 0;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            if (!hexNums.contains(String.valueOf(c))) {//if we get a char that is not in hexNums reteun -1
                return -1;
            }
            int x = hexNums.indexOf(c);
            sum = 16 * sum + x;//multiply the sum by 16 and add the index value of the char in hexNums to sum
        }
        if (sign == '-')//if sign = '-' multiply sum by -1
            sum*=-1;
        return sum;
    }
}


