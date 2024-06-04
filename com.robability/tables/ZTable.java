package tables;

/**
 * An approximated Z-Table implementation for Java (For X~N(0,1))
 * Author: Robert Luiten
 */
public class ZTable {

    private static final double[] searchTable = {0.5, 0.53983, 0.57926, 0.61791, 0.65542, 0.69146, 0.72575, 0.75804,
            0.78814, 0.81594, 0.84134, 0.86433, 0.88493, 0.90320, 0.91924, 0.93319, 0.9452, 0.95543,
            0.96407, 0.97128, 0.97725, 0.98214, 0.98610, 0.98928, 0.99180, 0.99379, 0.99534, 0.99653,
            0.99744, 0.99813, 0.99865};

    /**
     * Finds an approximated phi(z) for Z~N(0,1)
     * @param z The value to search for
     * @return An approximated phi(z) to the 5th decimal place
     */
    public static double phi(double z){
        if (z < 0){
            return 1 - phi(-z);
        }
        int search = (int) z*10;
        if (search >= 30){
            return 1;
        }
        return searchTable[search];
    }

    /**
     * Finds an approximated phi(x) for X~N(mean, variance)
     * @param x The value search for
     * @param mean The mean of the normal distribution
     * @param variance The variance of the normal distribution
     * @return An approximated phi(x) for X~N(mean, variance) to the 5th decimal place
     */
    public static double phi(double x, double mean, double variance){
        return phi((x-mean)/Math.sqrt(variance));
    }

}
