/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String str) {
        int i = 0;
        int length = str.length();
        String finl = "";
        
        while (i < length){
           char c = str.charAt(i);

           if (c >= 'A' && c <= 'Z') {
             c = (char)(c+32);
            }

             finl += c; 
             i++;
        }

        return finl ;
    }
}
