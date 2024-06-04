package distributions.continuous;

import distributions.abstracts.ContinuousDistribution;

/**
 * An implementation of an exponential distribution (X~Exp(lambda))
 * Author: Robert Luiten
 */
public class ExponentialDistribution  extends ContinuousDistribution {

    /**
     * The lambda parameter of the distribution
     */
    private final double lambda;

    /**
     * Creates a new exponential distribution
     * @param lambda The lambda parameter of the distribution
     * @throws IllegalArgumentException If lambda <= 0
     */
    public ExponentialDistribution(double lambda){
        if (lambda <= 0){
            throw new IllegalArgumentException();
        }
        this.lambda = lambda;
    }

    /**
     * The probability distribution function of the exponential distribution
     * @param x The value to plug into the PDF
     * @return fX(x)
     */
    @Override
    public double pdf(double x) {
        if (inRangeOf(x)){
            return lambda*(Math.exp(-lambda*x));
        }
        return 0;
    }

    /**
     * The cumulative distribution function of the exponential distribution
     * @param x The value to plug into the CDF
     * @return FX(x)
     */
    @Override
    public double cdf(double x) {
        if (x >= 0){
            return (1 - Math.exp(-lambda*x));
        }
        return 0;
    }

    /**
     * The expectation of the exponential distribution
     * @return E[X]
     */
    @Override
    public double expectation() {
        return 1/lambda;
    }

    /**
     * The variance of the exponential distribution
     * @return Var(X)
     */
    @Override
    public double variance() {
        return 1/(lambda*lambda);
    }

    /**
     * Determines whether a value is in the range of the distribution
     * @param value The value to check
     * @return True if the value is in range, False if otherwise
     */
    @Override
    public boolean inRangeOf(double value) {
        return (value > 0);
    }

    /**
     * The parameters of the distribution
     * @return An array containing lambda
     */
    @Override
    public double[] params() {
        double[] result = new double[1];
        result[0] = lambda;
        return result;
    }

}
