package robability.combinatorial;

/**
 * A class for implementing combinatorial functions
 * Author: Robert Luiten
 */
public final class Combinatorial {

    /**
     * Nuh uh uh, you can't instantiate this class buddy
     */
    private Combinatorial(){}

    /**
     * Calculates the amount of permutations
     * @param n Total amount of distinct objects to pick from
     * @param k Amount of objects to pick
     * @return P(n,k)
     */
    public static int permutate(int n, int k){
        return factorial(n)/factorial(n-k);
    }

    /**
     * Calculates the amount of combinations
     * @param n Total amount of distinct objects to pick from
     * @param k Amount of objects to pick
     * @return C(n,k)
     */
    public static int combinations(int n, int k){
        return factorial(n)/((factorial(k))*(factorial(n-k)));
    }

    /**
     * Calculates the number of distributions using the stars and bars method
     * @param n Indistinguishable objects to distribute into groups
     * @param k The amount of groups
     * @return The total number of way to distribute n indist. objects into k groups
     */
    public static int starsAndBars(int n, int k){
        return combinations(n + (k - 1), (k - 1));
    }

    /**
     * Stars and Bar but with a cooler name
     * @param n Indistinguishable objects to distribute into groups
     * @param k The amount of groups
     * @return The total number of way to distribute n indist. objects into k groups
     */
    public static int hogsAndLogs(int n, int k){
        return starsAndBars(n,k);
    }

    /**
     * Finds the factorial of n
     * @param n Must be >= 0
     * @return n!
     * @throws IllegalArgumentException If n < 0
     */
    public static int factorial(int n){
        if (n < 0){
            throw new IllegalArgumentException();
        } else if (n <= 1){
            return 1;
        }
        return n*factorial(n-1);
    }

}
