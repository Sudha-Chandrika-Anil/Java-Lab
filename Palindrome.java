
import java.util.*;

public class Palindrome{
    static String str; 
    static Scanner s;
    public static boolean isPalindrome(String str) {

        str = str.toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }
    public static void main(String[] args) {
        
        try {
            s= new Scanner(System.in);
            System.out.println("Enter String ");
            str= s.nextLine();
        }
        catch(Exception e) {
            System.out.println("Error: "+ e);
        }
        if (isPalindrome(str)) {
            System.out.println("The string \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + str + "\" is not a palindrome.");
        }
    }
}
