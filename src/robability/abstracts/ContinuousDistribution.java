package robability.abstracts;

/**
 * An abstract class for continuous probability distributions
 */
public abstract class ContinuousDistribution extends GeneralDistribution {

    /**
     * The probability density function for the distribution
     * @param x The value to plug into the PDF
     * @return PDF's result for x
     */
    public abstract double pdf(double x);

    /**
     * The cumulative distribution function for the distribution
     * @param x The value to plug into the CDF
     * @return CDF's result for x
     */
    public abstract double cdf(double x);

}
