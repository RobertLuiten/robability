**_Welcome to the wonderful world of Robability._**

This library is intended for use to help calculate
common probability distributions.

I'm in University right now, so I'm just creating this to get
some practice with statistics before I take a machine
learning class this quarter. Hopefully this will turn into
something usable.

So it's unfinished right now, but trust me, it's going to
go crazy when it's complete.

**How to use distributions:**

Robability contains several basic distributions divided into
two categories: Continuous and Discrete. When you create a
new instance of these distributions with the proper
parameters, you can calculate the following: 
- Expectation (.expectation())
- Variance (.variance())
- PMF of a double k for discrete 
distributions (.pmf(k))
- PDF and CDF of a double k for continuous distributions 
(.pdf(k) and .cdf(k))
- Determine whether a double value is in the range of the
distribution (.elementOf(value))
- Generate an array of doubles 
containing the parameters of the distribution
  (.params())

Wow, and that's your magical introduction into the world
of Robability!