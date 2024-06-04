package robability.distributions.discrete;

import robability.combinatorial.Combinatorial;
import robability.distributions.abstracts.DiscreteDistribution;

/**
 * An implementation of a binomial distribution (X~Bin(n,p))
 * Author: Robert Luiten
 */
public class BinomialDistribution extends DiscreteDistribution {

    /**
     * Number of trials
     */
    private int n;

    /**
     * Probability of event
     */
    private final double p;

    /**
     * Creates new binomial distribution with params n and p
     * @param n The number of trials
     * @param p The probability of an event
     */
    public BinomialDistribution(int n, double p){
        if (n < 0 || p < 0 || p > 1){
            throw new IllegalArgumentException();
        }
        this.p = p;
        this.n = n;
    }

    /**
     * Changes the number of trials in the distribution
     * @param n The new number of trials, must be >= 0
     * @return The previous number of trials, or -1 if n < 0
     */
    public int setn(int n){
        if (n < 0){
            return -1;
        }
        int temp = this.n;
        this.n = n;
        return temp;
    }

    /**
     * Finds the probability for k
     * @param k The value to plug into the PMF
     * @return pX(k)
     */
    @Override
    public double pmf(double k) {
        if (inRangeOf(k)){
            return Combinatorial.combinations(this.n,(int) k)*Math.pow(p,k)*Math.pow((1-p),n-k);
        }
        return 0;
    }

    /**
     * Calculates the expectation of the distribution
     * @return E[X]
     */
    @Override
    public double expectation() {
        return n*p;
    }

    /**
     * Calculates the variance of the distribution
     * @return Var(X)
     */
    @Override
    public double variance() {
        return n*p*(1-p);
    }

    /**
     * Determines whether value is in the range of the binomial distribution
     * @param value The value to check
     * @return True if value is in the range, False otherwise
     */
    @Override
    public boolean inRangeOf(double value) {
        return (value >= 0 && (int) value == value);
    }

    /**
     * Creates an array containing the parameters of the distribution
     * @return An array containing n & p respectively
     */
    @Override
    public double[] params() {
        double[] result = new double[2];
        result[0] = n;
        result[1] = p;
        return result;
    }


}
