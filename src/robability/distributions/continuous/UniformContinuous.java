package robability.distributions.continuous;

import robability.distributions.abstracts.ContinuousDistribution;

/**
 * A class which represents a continuous uniform distribution (X~Unif(a,b)
 * where a < b
 * Author: Robert Luiten
 */
public class UniformContinuous extends ContinuousDistribution {

    /**
     * The parameters a & b for the distribution
     */
    private final double a, b;

    /**
     * Creates a new uniform continuous distribution with params a & b
     * @param a First parameter, must be < b
     * @param b Second parameter, must be > a
     * @throws IllegalArgumentException If a > b
     */
    public UniformContinuous(double a, double b){
        if (a > b){
            throw new IllegalArgumentException();
        }
        this.a = a;
        this.b = b;
    }

    /**
     * The probability density function of the distribution
     * @param x The value to plug into the PDF
     * @return fX(x)
     */
    @Override
    public double pdf(double x) {
        return 1 / (b - a);
    }

    /**
     * The continuous density function of the distribution
     * @param x The value to plug into the CDF
     * @return FX(x)
     */
    @Override
    public double cdf(double x) {
        if (x < a){
            return 0;
        } else if (x < b){
            return (x - a)/(x - b);
        }
        return 1;
    }

    /**
     * The expectation of the distribution
     * @return E[X]
     */
    @Override
    public double expectation() {
        return (a + b)/2;
    }

    /**
     * The variance of the distribution
     * @return Var(X)
     */
    @Override
    public double variance() {
        return ((b-a)*(b-a))/12;
    }

    /**
     * Determines whether a value is in the range of a & b
     * @param value The value in question
     * @return True if the value is in range, false otherwise
     */
    @Override
    public boolean inRangeOf(double value) {
        return (value >= a && value <= b);
    }

    /**
     * Gives an array containing all parameters of the distribution
     * @return An array of length 2 containing parameters a and b respectively
     */
    @Override
    public double[] params() {
        double[] result = new double[2];
        result[0] = a;
        result[1] = b;
        return result;
    }
}
