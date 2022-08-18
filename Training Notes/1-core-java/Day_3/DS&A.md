# Algorithm Analysis

Time complexity is used in computer science to deal with quantifying how much time a set of code or an algorithm takes to process as a function of the amount of input.

In other words, it is a estimate to how long a program takes to process a given input.

The efficiency of an algorithm has two parts:

- Time Complexity
- Space Complexity

---

### Time Complexity
Defined as the number of times a particular instruction is executed rather than the total time it takes
This is because the total time it can take is dependent on other factors like the compiler used, processor speed, etc.



## Example

Imagine a classroom with 100 students, in which you have given 1 pen to 1 person. You have to find that pen without knowing who you gave it.

Here are some examples, described with Big O notation:

- O(n^2): you go and ask the first person in the class if they have a pen. You then ask this person about the next 99 people if they have that pen, and keep going for each one.

- O(n): Going to each person individually and asking them is O(N)

- O(log n): Divide the classroom into two groups, then ask: "Is it on the left side or right side?", take that group and further divide it and repeat it. 

---

### Space Complexity
Is the total memory space required for the programs execution

Space complexity is commonly misused for Auxiliary Space in many places:

Auxiliary Space : The extra space or temporary space used by an algorithm.

Space complexity of an algorithm is the total space taken by the algorithm with respect to the input size. Space complexioty includes both Auxiliary space and space used by input.


Example:
If we want to compare standard sorting algorithms on the basis of space, then Auxiliary space would be a better criterion than Space Complexity. Merge Sort uses O(n) auxiliary space, insertion sort, and Heap sort use O(1) auxiliary space. All of these sorting algorithms however have O(n) Space Complexity.


---

## Asymptotic Notations

Asymptotic analysis of an algorithm referes to defining the bounds / framing of its run-time performance.
We use to give an estimate for the best case, worst case, and average case scenario for an algorithm.

### Big O Notation
The notation O(n) is the formal way to express the upper bound of an algorithms run time. It measures the worst case time complexity or the longest amount of time an algorithm can possibly take.


### Omega Notation
The notation omega is the formal way to express the lower bound of an algorithms running time. This measures the best case time complexity or the best amount of time an algorithm can take.


### Theta Notation
The notation theta is the formal way to express both the lower and upper bound of an algorithms running time.



---

- Constant : O(1)
- Logarithmic : O(log n)
- Linear : O(n)
- n log n : O(n log n)
- Quadratic : O(n^2)
- Cubic : O(n^3)
- Polynomial : n^O(1)
- Exponential : 2^O(n)

---

# Brute Force Algorithms

Brute force means generating every possible answer and selecting only the valid ones.

Example:

You have an Iphone with a 4 digit passcode, you input in every single combination until it works.
This requires exponential time.

Some problems do require brute force algorithms sadly.










