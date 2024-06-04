package robability.distributions.abstracts;

/**
 * An abstract class for discrete probability distributions
 * Author: Robert Luiten
 */
public abstract class DiscreteDistribution extends GeneralDistribution {

    /**
     * The probability mass function for the distribution
     * @param k The value to plug into the PMF
     * @return PMF's result for k
     */
    public abstract double pmf(double k);

}
