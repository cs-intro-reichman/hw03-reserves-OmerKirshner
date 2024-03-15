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
    public static String uniqueChars(String str) {
        String finl = "";
        int length = str.length();

        for (int i = 0; i < length; i++){
         char c = str.charAt(i);
         
            if (i == str.indexOf(c)){
            finl += c;
            }
            else if (c == ' '){
            finl += c;
            }

           } 
        
        return finl;
    }
}
