# Big O notation
Big O notation is a metric used in computer science to classify algorithms based on their time and space complexity.

# Time and Space complexity
- The time complexity of an algorithm is the amount of
time it takes for each statement to complete. As a result,
it is highly dependent on the size of the processed data. 
It also aids in defining an algorithm's effectiveness and evaluating its performance.
- The amount of memory used by a program to execute it is represented by its space complexity. 

## Time Complexity
### Constant time O(1)
- As an algorithm gets very large inputs, the runtime of the algorithm is the same. 
This implies that the amount of time or memory does not scale with n. For time complexity, 
this means that n is not iterated on or recursed.

### Linear time O(n)
- Linear time complexity O(n) implies that the time required by an algorithm to complete is directly proportional to the size of the input nn. As nn increases, the time taken also increases linearly.

### Logarithmic time O(log(n))
- Logarithmic time complexity O(log(n)) means that as the size n of the input increases, the time 
taken by the algorithm increases logarithmically.
- If an algorithm has O(log⁡(n)) time complexity, doubling n does not double the time 
taken. Instead, the time taken increases by a fixed amount because log⁡(n) grows much slower 
than linearly or exponentially.
- If an algorithm's time complexity is O(log(n)), doubling n typically increases the time 
complexity by a constant factor.
  - Binary Search Algo
    - Initially, the search space is n elements, then n/2, then n/4, and so on, until the target
    element is found or the search interval becomes empty.
    - The logarithmic time complexity arises from the fact that the size of the search space is reduced by a constant factor (2) with each iteration, resulting in a logarithmic number of iterations required to find the target element.

### Quadratic time O(n^2)
- Quadratic time complexity O(n^2) means that the time taken by an algorithm grows quadratically with the 
size of the input n. As n increases, the time taken increases quadratically, 
specifically proportional to n^2.
- Algorithms with quadratic time complexity often involve nested loops where each loop iterates n times over an n-sized input, 
resulting in n^2 total iterations.

### Exponetial time O(2^n)
- Exponential time complexity O(2^n) describes an algorithm whose time complexity doubles with each additional element
in the input set. This means that as the size of the input n increases by one, 
the time to complete the algorithm roughly doubles. 
- The `2` can be any number

### n-factorial time O(n!)
- The time complexity O(n!), often referred to as factorial time complexity, describes algorithms whose time required grows 
factorially with the size of the input n. This means that the number of operations or computations increases very rapidly as n increases, making n! (n factorial) a very large number.


##### In terms of consideration, time is always a priority since one can purchase more memory but not time.