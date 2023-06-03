
/**
 * Holds data about the number of people who have recovered from COVID-19 across
 * seven provinces in Canada over a period of 8 months (from February to September 2020)
 @author Santiago Garcia
 @version 1.0
 @since Java 17.0.6
 */

public class CovidStatistics {
    /**
     *
     * @param args is not used
     */
    public static void main(String[] args) {
        final int ROWS = 7;
        final int COLUMNS = 8;

        int[][] patients =
                {
                        {2200, 1100, 1200, 1000, 1015, 2000, 2204, 2204},
                        {5020, 6105, 2009, 9047, 1016, 2014, 2708, 2308},
                        {1720, 2406, 3054, 1018, 1023, 3100, 1406, 1502},
                        {1490, 2002, 2016, 5008, 2044, 1055, 1607, 2201},
                        {1520, 1007, 1092, 2065, 1023, 1010, 1046, 1502},
                        {1670, 1201, 2008, 2001, 1086, 1009, 1041, 1706},
                        {1870, 2001, 2078, 1006, 1053, 1702, 1009, 1406}
                };

        String[] provinces =
                {
                        "Ontario",
                        "Quebec",
                        "Nova Scotia",
                        "New Brunswick",
                        "Manitoba",
                        "British Columbia",
                        "Prince Edward Island"
                };

        String[] months = {"Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep"};


        //Prints the months
        printMonths(months);

        //Prints out the number of patients for all provinces (content of the array) for each month..
        printMonthlyRecoveredPatients(ROWS, COLUMNS, provinces,patients);

        //Prints out the total recovered patients for each month across the seven provinces
        printTotalRecoveredPatients(ROWS, COLUMNS, patients);

        System.out.println();
        System.out.println();
        System.out.println("               Vaccinate and maintain good health practices!");
    }

    /**
     *
     * @param ROWS constant value representing the rows of the bi-dimensional array
     * @param COLUMNS constant value representing the columns of the bi-dimensional array
     * @param patients bi-dimensional array
     * Iterates over the bi-dimensional array and calculates the total recovered patients for each month accross
     * the seven provinces.
     */
    private static void printTotalRecoveredPatients(int ROWS, int COLUMNS, int[][] patients) {
        int total = 0;

        System.out.println();
        System.out.printf("%20s %8s","Recovered Patients", "");
        for (int column = 0; column < COLUMNS; column++) {
            for (int row = 0; row < ROWS; row++)
                total += patients[row][column];
            System.out.printf("%-8s", total);
            total = 0;
        }
    }

    /**
     *
     * @param months
     * Prints the months in which the recovered patients were registered
     */
    private static void printMonths(String[] months) {
        System.out.printf("%20s %8s" ,"Month", "");
        for (int i = 0; i < months.length ; i++)
            System.out.printf("%-8s", months[i]);
        System.out.println();
    }

    /**
     *
     * @param ROWS constant value representing the rows of the bi-dimensional array
     * @param COLUMNS constant value representing the columns of the bi-dimensional array
     * @param patients bi-dimensional array
     * @param provinces Array holding all the provinces
     * Prints the monthly recorded patients for each month across the seven provinces.
     *     If the value of the current indexes is equal to the previous one, a "(=)" will be printed at the end of the value.
     *     If the value of the current indexes is smaller to the previous one, a "(-)" will be printed at the end of the value.
     *     If the value of the current indexes is greater to the previous one, a "(+)" will be printed at the end of the value.
     */
    private static void printMonthlyRecoveredPatients(int ROWS, int COLUMNS, String[] provinces, int[][] patients){
        int previousNumber = 0;
        for (int row = 0; row < ROWS; row++) {
            System.out.printf("%20s %8s", provinces[row], "");
            for (int column = 0; column < COLUMNS; column++) {
                if (previousNumber == 0)
                    System.out.printf("%-8s", patients[row][column]); //Prints the first value of each column without a sign.
                else if (previousNumber == patients[row][column])
                    System.out.printf("%-8s", patients[row][column] + "(=)");
                else if (patients[row][column] > previousNumber)
                    System.out.printf("%-8s", patients[row][column] + "(+)");
                else if (patients[row][column] < previousNumber)
                    System.out.printf("%-8s", patients[row][column] + "(-)");
                previousNumber = patients[row][column];//Sets the current indexes as the value of previousNumber
            }
            previousNumber = 0; //Resets the value of previousNumber
            System.out.println();
        }
        System.out.printf("%83s", "Where (-) denotes a downward trend, (+) denotes an upward trend, and (=) indicates the trend stayed the same");
    }
}




   
   
   
   
   





