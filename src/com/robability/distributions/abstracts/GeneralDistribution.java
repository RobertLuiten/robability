package com.robability.distributions.abstracts;

/**
 * An abstract class for general probability distributions
 * Author: Robert Luiten
 */
public abstract class GeneralDistribution {

    /**
     * Finds the expectation (E[X]) of the distribution
     * @return E[X]
     */
    public abstract double expectation();

    /**
     * Finds the variance (Var(X)) of the distribution
     * @return Var(x)
     */
    public abstract double variance();

    /**
     * Determines whether value is an element of the distribution
     * @return True if value is the distribution, False otherwise
     */
    public abstract boolean inRangeOf(double value);

    /**
     * @return The current parameters of the distribution
     */
    public abstract double[] params();

}
