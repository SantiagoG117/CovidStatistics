
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
        int total = 0;

        int[][] patients =
                {
                        {2200, 1100, 1200, 1000, 1015, 2000, 1092, 2204},
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

        /**
         * Prints the months
         */
        System.out.printf("%20s %8s" ,"Month", "");
        for (int i = 0; i < months.length ; i++) {
            System.out.printf("%-8s", months[i]);
        }
        System.out.println();

        /** Prints out the number of patients for all provinces (content of the array) for each month..
         */
        for (int row = 0; row < ROWS; row++) {
            System.out.printf("%20s %8s", provinces[row], "");
            for (int column = 0; column < COLUMNS; column++)
                System.out.printf("%-8s" ,patients[row][column]);
            System.out.println();
        }

        /**
         * Prints the total recovered patients for each month across the seven provinces
         */

        System.out.println();
        System.out.printf("%20s %8s","Recovered Patients", "");
        for (int column = 0; column < COLUMNS; column++) {
            for (int row = 0; row < ROWS ; row++)
                total += patients[row][column];
            System.out.printf("%-8s",total);
            total = 0;
        }

        System.out.println();
        System.out.println();
        System.out.println("               Vaccinate and maintain good health practices!");
    }
}




   
   
   
   
   





