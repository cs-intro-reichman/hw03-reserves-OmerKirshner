public class Calendar { 
    static int dayOfMonth = 1;   
    static int month = 1;
    static int year = 1900;
    static int dayOfWeek = 2;    
    static int nDaysInMonth = 31; 
    

    public static void main(String args[]) {
        int desyear = Integer.parseInt(args[0]);
        advance(year, desyear, month, dayOfMonth, dayOfWeek);
    }
    
    private static void advance(int year, int desyear, int month, int dayOfMonth, int dayOfWeek) {
        for (; year <= desyear; year++) {
            for (; month <= 12; month++) {
                for (; dayOfMonth <= nDaysInMonth(month, year); dayOfMonth++) {
                    if (year == desyear) {
                        if (dayOfWeek == 1) {
                            System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
                        } else {
                            System.out.println(dayOfMonth + "/" + month + "/" + year);
                        }
                    }
                    dayOfWeek++;
                    if (dayOfWeek > 7) {
                        dayOfWeek = 1;
                    }   
                }
                dayOfMonth = 1;
            }
            month = 1;    
        }
    }
         
    public static boolean isLeapYear(int year) {
        boolean isLeapyear;
        isLeapyear = ((year % 400) == 0);
        isLeapyear = isLeapyear || (((year % 4) == 0) && (year % 100) != 0);
        return isLeapyear;
    }
    
    private static int nDaysInMonth(int month, int year) {
        boolean longmonth = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
        boolean shortmonth = !longmonth && month != 2;
        if (longmonth) {
            nDaysInMonth = 31;
        } else if (shortmonth) {
            nDaysInMonth = 30;
        } else if (month == 2) {
            if (isLeapYear(year)) {
                nDaysInMonth = 29;
            } else {
                nDaysInMonth = 28;
            }
        }
        return nDaysInMonth;
    }
}
