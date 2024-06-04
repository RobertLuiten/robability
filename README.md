**_Welcome to the wonderful world of Robability._**

This package is intended for use to help calculate
common probability distributions.

I'm in University right now, so I'm just creating this to get
some practice with statistics before I take a machine
learning class this quarter. Hopefully this will turn into
something usable.

**How to use distributions:**

Robability contains several basic distributions divided into
two categories: Continuous and Discrete. When you create a
new instance of these distributions, you can calculate the following: 
- Expectation (.expectation())
- Variance (.variance())
- PMF of a double k for discrete 
distributions (.pmf(k))
- PDF and CDF of a double k for continuous distributions 
(.pdf(k) and .cdf(k))
- Determine whether a double value is in the range of the
distribution (.inRangeOf(value))
- Generate an array of doubles 
containing the parameters of the distribution
  (.params())

They may have other functions as well, but these are the basic
ones contained in all distributions.

**How to use Combinatorial**

Combinatorial contains some functions which may be useful
for certain statistics related applications. For example, to find
the total amount of possible permutations when picking k of
n possible objects, you can call Combinatorial.permutations(n,k).

**Z-Tables**

Robability has a basic approximated Z-Table function which can search
up certain values on a Z-Table by calling ZTable.phi(x, mean, variance).
If your distribution is already normalized, simply calling ZTable.phi(z)
can look up your value as well.

And that's your magical introduction into the world
of Robability!