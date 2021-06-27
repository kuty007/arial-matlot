package Ex3;

public class Ex3 {


    //The function gets a character and string and moves all instances of the character to the end of the string
    public static String moveCharToLast(String str, char ch) {

        if (str.length() == 0) {
            return "";
        }
        String newString = str.substring(1); //create new string without the first character
        if (str.indexOf(ch) == 0) { //this happens when you found the char you want to move to the end
            return moveCharToLast(newString, ch) + ch;
        } else { //this what happens with all the other characters
            return str.charAt(0) + moveCharToLast(newString, ch);
        }
    }

    //The function gets a string and reduces instances of adjacent identical characters
    public static String reduce(String str) {
        if (str.length() <= 1) return str;
        if (str.substring(1, 2).equals(str.substring(0, 1))) return reduce(str.substring(1));
        else return str.charAt(0) + reduce(str.substring(1));
    }

    //The function receives a string and a number and encrypts the string by shifting each character by the number given to us
    public static String caesarCipherText(String str, int key) {
        String ciphertext = "";
        if (key > 26 || key < -26)// help to stay just on abc and not get char like @ $ ! and so on
            return "";
        else {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLowerCase(str.charAt(i))) {
                    char ch;
                    if (key >= 0) {//if you mean to cipher your message
                        ch = (char) (((int) str.charAt(i) + key - 97) % 26 + 97);
                    } else {//if you mean to decipher your message
                        ch = (char) (((int) str.charAt(i) + 26 + key - 97) % 26 + 97);
                    }
                    ciphertext = ciphertext.concat(String.valueOf(ch));
                } else {
                    ciphertext = ciphertext.concat(" ");//if char is not lower case its a space so add this space
                }
            }
            return ciphertext;
        }
    }

    //The function receives a string and a encrypt string and encrypts the string by adding each character  the value of the character in the encrypt string given to us
    public static String vigenereCipherText(String str, String key) {
        StringBuilder orig_text = new StringBuilder();
        int j = 0;
        String abc = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < str.length(); i++) {
            if (j == key.length())// help to prevent out of bounds index by rest  to 0 the index that check the latter of the key if we reach his end but not the end of the str
                j = 0;
            if (Character.isLowerCase(str.charAt(i))) {
                char ch = (char) (((int) str.charAt(i)));
                char chr = (char) (((int) key.charAt(j)));
                int newchar = (abc.indexOf(ch) + abc.indexOf(chr) + 26) % 26;
                newchar += 'a'; //casting to ASSCII
                orig_text.append((char) (newchar));
            } else {
                orig_text = new StringBuilder(orig_text.toString().concat(" "));// if char is not lower case its a space so add this space
            }
            j++;
        }
        return orig_text.toString();


    }//The function receives a string and a decrypt string and decrypt the string by subtract each character value by the value of the character in the encrypt string given to us

    public static String vigenereDecipherText(String str, String key) {
        StringBuilder orig_text = new StringBuilder();
        int j = 0;
        String abc = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < str.length(); i++) {
            if (j == key.length())// help to prevent out of bounds index by rest  to 0 the index that check the latter of the key if we reach his end but not the end of the str
                j = 0;
            if (Character.isLowerCase(str.charAt(i))) {
                char ch = (char) (((int) str.charAt(i)));
                char chr = (char) (((int) key.charAt(j)));
                int newchar = (abc.indexOf(ch) - abc.indexOf(chr) + 26) % 26;
                newchar += 'a'; //casting to ASSCII
                orig_text.append((char) (newchar));
            } else {
                orig_text = new StringBuilder(orig_text.toString().concat(" "));// if char is not lower case its a space so add this space
            }
            j++;
        }
        return orig_text.toString();

    }

    public static boolean mySplit(int[] nums) {
        int n = nums.length;
        int[] arr = new int[nums.length];
        int j = 0;
        int leftsum = 0, rightsum = 0;
        for (int num : nums) {
            // if the number is divisible by 5  add him to the right sum
            if (num % 5 == 0)
                leftsum += num;
                // if the number is divisible by 3 add him to the right sum
            else if (num % 3 == 0)
                rightsum += num;
            else
                // array of the numbers that not divided by 3 and 5
                arr[j++] = num;
        }
        return mySplitHelper(arr, n, leftsum, rightsum);

    }


    private static boolean mySplitHelper(int[] arr, int n, int leftsum, int rightsum) {

        // if reached the end of the recursion process and the sums are equal
        if (0 == n && leftsum == rightsum)
            return true;
// if reached the end of the recursion process and the sums are not equal
        if (n == 0)
            return false;

        else

            // Try adding in both the sides (left, right) and check whether the condition satisfies
            return mySplitHelper(arr, n - 1, leftsum + arr[n - 1], rightsum) || mySplitHelper(arr, n - 1, leftsum, rightsum + arr[n - 1]);

    }

    //The function receives a matrix and replaces each value in the matrix with the value of the sum of its neighbors
    public static int[][] sumOfNeighbours(int[][] mat) {
        int[][] sum = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == 0) {
                    if (j == 0) {
                        sum[i][j] = mat[i + 1][j + 1] + mat[i][j + 1] + mat[i + 1][j];//dells with the top left corner
                    } else if (j == mat[i].length - 1) {
                        sum[i][j] = mat[i + 1][j - 1] + mat[i][j - 1] + mat[i + 1][j];//dells with the top right corner
                    } else {
                        sum[i][j] = mat[i][j - 1] + mat[i][j + 1] + mat[i + 1][j + 1] + mat[i + 1][j - 1] + mat[i + 1][j];//top middles
                    }
                } else if (i == mat.length - 1) {
                    if (j == 0) {
                        sum[i][j] = mat[i - 1][j] + mat[i - 1][j + 1] + mat[i][j + 1];//dells with the bottom left corner
                    } else if (j == mat[i].length - 1) {
                        sum[i][j] = mat[i - 1][j] + mat[i][j - 1] + mat[i - 1][j - 1];//dells with the bottom right corner
                    } else {
                        sum[i][j] = mat[i - 1][j] + mat[i - 1][j - 1] + mat[i - 1][j + 1] + mat[i][j + 1] + mat[i][j - 1];//dells with the bottom middles
                    }
                } else if (j == 0) {//first column
                    if (i != mat.length - 1)
                        sum[i][j] = mat[i - 1][j] + mat[i + 1][j] + mat[i + 1][j + 1] + mat[i - 1][j + 1] + mat[i][j + 1];//dells with the left middles
                } else if (j == mat[i].length - 1) {//last column
                    if (i != mat.length - 1)
                        sum[i][j] = mat[i - 1][j] + mat[i + 1][j] + mat[i - 1][j - 1] + mat[i][j - 1] + mat[i + 1][j - 1];//dells with the right  middles
                } else {
                    sum[i][j] = mat[i][j - 1] + mat[i][j + 1] + mat[i + 1][j] + mat[i + 1][j - 1] + mat[i + 1][j + 1] + mat[i - 1][j] + mat[i - 1][j - 1] + mat[i - 1][j + 1];//dells with the all the rest
                }
            }

        }

        return sum;
    }

}

