package com.robability.distributions.continuous;

import com.robability.distributions.abstracts.ContinuousDistribution;
import com.robability.tables.ZTable;

/**
 * An implementation of a normal distribution (X~N(mean,variance)
 * Author: Robert Luiten
 */
public class NormalDistribution extends ContinuousDistribution {

    /**
     * The mean and variance of the distribution
     */
    private final double mean, variance;

    /**
     * Creates a new normal distribution
     * @param mean The mean of the normal distribution
     * @param variance The variance of the normal distribution
     */
    public NormalDistribution(double mean, double variance){
        if (variance <= 0){
            throw new IllegalArgumentException();
        }
        this.mean = mean;
        this.variance = variance;
    }

    /**
     * The probability distribution function of the normal distribution
     * @param x The value to plug into the PDF
     * @return fX(x)
     */
    @Override
    public double pdf(double x) {
        return (1/(Math.sqrt(variance*2*Math.PI)))*Math.exp(-(Math.pow(x-mean, 2.0))/(2*variance));
    }

    /**
     * The cumulative distribution function of the normal distribution
     * @param x The value to plug into the CDF
     * @return FX(x)
     */
    @Override
    public double cdf(double x) {
        ZTable.phi(x, mean, variance);
        return 0;
    }

    /**
     * The expectation of the normal distribution
     * @return E[X]
     */
    @Override
    public double expectation() {
        return mean;
    }

    /**
     * The variance of the normal distribution
     * @return Var(X)
     */
    @Override
    public double variance() {
        return variance;
    }

    /**
     * Returns whether a double value is in the range of the normal distribution
     * @param value The value to check
     * @return True
     */
    @Override
    public boolean inRangeOf(double value) {
        return true;
    }

    /**
     * An array containing the parameters of the normal distribution
     * @return An array containing the mean and variance respectively
     */
    @Override
    public double[] params() {
        double[] result = new double[2];
        result[0] = mean;
        result[1] = variance;
        return result;
    }
}
