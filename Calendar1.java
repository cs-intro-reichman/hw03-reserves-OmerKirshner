public class Calendar1 {    
    // Static variables
    static int dayOfMonth = 1;   
    static int month = 1;
    static int year = 1900;
    static int dayOfWeek = 2;     // 1.1.1900 was a Monday
    static int nDaysInMonth = 31; // Number of days in January

    public static void main(String[] args) {
        advance();
    }

    private static void advance() {
        int sundayCounter = 0;

        for (year = 1900; year <= 1999; year++) {
            for (month = 1; month <= 12; month++) {
                nDaysInMonth = nDaysInMonth(month, year);
                for (dayOfMonth = 1; dayOfMonth <= nDaysInMonth; dayOfMonth++) {
                    if (dayOfWeek == 1 && dayOfMonth == 1) {
                        System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
                        sundayCounter++;
                    } 
                    else {
                        System.out.println(dayOfMonth + "/" + month + "/" + year);
                    }

                    if (dayOfWeek >= 7) {
                        dayOfWeek = 1; 
                    } 
                    else {
                        dayOfWeek++;
                    }
                }
            }
        }
        System.out.println("During the 20th century, " + sundayCounter + " Sundays fell on the first day of the month");
    }

    public static boolean isLeapYear(int year) {
        return ((year % 400) == 0) || (((year % 4) == 0) && ((year % 100) != 0));
    }

    private static int nDaysInMonth(int month, int year) {
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else {
            return 31;
        }
    }
