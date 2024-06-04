package robability.discrete;

import robability.abstracts.DiscreteDistribution;

/**
 * Class which represents a discrete uniform distribution (X~Unif(a,b))
 * where a & b are integers >=0 and a <= b
 * Author: Robert Luiten
 */
public class UniformDiscrete extends DiscreteDistribution {

    /**
     * The parameters of the distribution, a & b respectively
     */
    private final int a, b;

    /**
     * Creates a new uniform distribution (X~Unif(a,b))
     * @param a First parameter, must be <= b
     * @param b Second parameter, must be > a
     * @throws IllegalArgumentException If a > b
     */
    public UniformDiscrete(int a, int b){
        if (a > b){
            throw new IllegalArgumentException();
        }
        this.a = a;
        this.b = b;
    }

    /**
     * The PMF of the uniform distribution
     * @param k The value to plug into the PMF
     * @return px(k)
     */
    @Override
    public double pmf(double k) {
        if (elementOf(k)){
            return 1 / ( (double) (b-a+1));
        }
        return 0;
    }

    /**
     * The expectation of the uniform distribution
     * @return E[X]
     */
    @Override
    public double expectation() {
        return (double) (a + b) / 2;
    }

    /**
     * The variance of the uniform distribution
     * @return Var(x)
     */
    @Override
    public double variance() {
        return (((double) (b-a))*((double) (b-a+2)))/12;
    }

    /**
     * Determines whether value is an element of the distribution or not
     * @param value A double value
     * @return Whether value is an element of the distribution
     */
    @Override
    public boolean elementOf(double value) {
        return ((int) value == value && value >= a && value <= b);
    }

    /**
     * Gives an array containing all parameters of the distribution
     * @return An array of length 2 containing parameters a and b respectively
     */
    @Override
    public double[] params(){
        double[] result = new double[2];
        result[0] = (double) a;
        result[1] = (double) b;
        return result;
    }

}
