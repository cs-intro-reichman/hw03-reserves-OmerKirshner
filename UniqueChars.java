/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        StringBuilder result = new StringBuilder(); 

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); 

            if (c == ' ' || s.indexOf(c) == i) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
