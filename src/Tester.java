import java.util.Arrays;

/**
 * @author Drumstyle92
 * Class with the content of the entire program.
 */
public class Tester {
    /**
     *
     * @param args main parameter.
     * main method which contains strings and an array with printing it.
     */
    public static void main(String[] args) {
        // Strings
        String string1 = "Hello";
        String string2 = "How are you?";
        // Array
        char[] charArray = new char[4];
        // composition of the array
        string1.getChars(0,2, charArray,0);
        string2.getChars(10,12,charArray,2);
        System.out.println("---------------------------------------");
        System.out.println("Array: " + Arrays.toString(charArray));
        System.out.println("---------------------------------------");
    }
}
