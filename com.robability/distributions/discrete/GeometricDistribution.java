package distributions.discrete;

import distributions.abstracts.DiscreteDistribution;

/**
 * A class for a geometric probability distribution (X~Geo(p))
 * Author: Robert Luiten
 */
public class GeometricDistribution extends DiscreteDistribution {

    /**
     * The probability parameter of the distribution
     */
    private final double p;

    /**
     * Creates a new geometric probability distribution with param p
     * @param p The probability parameter
     * @throws IllegalArgumentException If 0 < p <= 1
     */
    public GeometricDistribution(double p){
        if (p <= 0 || p > 1){
            throw new IllegalArgumentException();
        }
        this.p = p;
    }

    /**
     * The probability mass function of the geometric distribution
     * @param k The value to plug into the PMF
     * @return pX(k)
     */
    @Override
    public double pmf(double k) {
        if (inRangeOf(k)){
            return Math.pow(1-p, k-1)*p;
        }
        return 0;
    }

    /**
     * The expectation of the geometric distribution
     * @return E[X]
     */
    @Override
    public double expectation() {
        return 1/p;
    }

    /**
     * The variance of the geometric distribution
     * @return Var(X)
     */
    @Override
    public double variance() {
        return (1-p)/(p*p);
    }

    /**
     * Determines whether a value is in the range of the geometric distribution
     * @param value The value to check
     * @return True if the value is in the range, false otherwise
     */
    @Override
    public boolean inRangeOf(double value) {
        return ((int) value == value && value > 0);
    }

    /**
     * An array of the parameters
     * @return An array containing p
     */
    @Override
    public double[] params() {
        double[] result = new double[1];
        result[0] = p;
        return result;
    }
}
