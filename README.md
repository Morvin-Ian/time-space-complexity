# <ins>Big O notation</ins>
The notation Ο(n) is the formal way to express the upper bound of an algorithm's running
time. It measures the worst case time complexity or the longest amount of time an
algorithm can possibly take to complete.

![1_nlogn](https://github.com/Morvin-Ian/time-space-complexity/assets/78966128/2f3441e6-e2dc-4f23-8386-3641c64160a3)


# Time and Space complexity
- The time complexity of an algorithm is the amount of
time it takes for each statement to complete. As a result,
it is highly dependent on the size of the processed data. 
It also aids in defining an algorithm's effectiveness and evaluating its performance.
- The amount of memory used by a program to execute it is represented by its space complexity. 

## Time Complexity
### [Constant time](./src/constant) O(1)
- As an algorithm gets very large inputs, the runtime of the algorithm is the same. 
This implies that the amount of time or memory does not scale with n. For time complexity, 
this means that n is not iterated on or recursed.

### [Linear time](./src/linear) O(n)
- Linear time complexity O(n) implies that the time required by an algorithm to complete is directly proportional to the size of the input n. As n increases, the time taken also increases linearly.

### [Logarithmic time](./src/logarithimic) O(log(n))
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

### [Quadratic time](./src/quadratic) O(n^2)
- Quadratic time complexity O(n^2) means that the time taken by an algorithm grows quadratically with the 
size of the input n. As n increases, the time taken increases quadratically, 
specifically proportional to n^2.
- Algorithms with quadratic time complexity often involve nested loops where each loop iterates n times over an n-sized input, 
resulting in n^2 total iterations.
  - Bubble Sort 
    - Bubble Sort has a worst-case time complexity of O(n^2), which occurs when the input list is in reverse sorted order.
    - In the best-case scenario (when the list is already sorted), the algorithm still requires O(n) time because it needs to pass through the list once to determine that no swaps are needed. 

### [Exponetial time](./src/exponential) O(2^n)
- Exponential time complexity O(2^n) describes an algorithm whose time complexity doubles with each additional element
in the input set. This means that as the size of the input n increases by one, 
the time to complete the algorithm roughly doubles. 

### [n-factorial time](./src/factorial) O(n!)
- The time complexity O(n!), often referred to as factorial time complexity, describes algorithms whose time required grows 
factorially with the size of the input n. This means that the number of operations or computations increases very rapidly as n increases, making n! (n factorial) a very large number.

  - Permutations of a string.
  - Solving the traveling salesman problem with a brute-force search


### [Linearithmic algorithms](./src/linearithmic) O(n log n)
- Linearithmic time complexity it’s slightly slower than a linear algorithm. However, it’s still much better than a quadratic algorithm
- The logarithmic (log⁡n) term grows much slower than linear (n) or quadratic (n^2) terms. This logarithmic growth is crucial in maintaining efficient performance for large n values.
  - MergeSort
    - Merge sort is a sorting algorithm that follows the divide-and-conquer approach. It works by recursively dividing the input array into smaller subarrays and sorting those subarrays then merging them back together to obtain the sorted array
 
    ![MergeSort](https://github.com/Morvin-Ian/time-space-complexity/assets/78966128/533c7166-1e19-4447-bd19-39ec283305e3)

  - QuickSort

## Space Complexity
- Arrays and Linked Lists: Utilize O(n) space complexity for storing n elements, with linked lists offering dynamic memory allocation benefits.

- Hash Tables: Space complexity varies depending on load factor and collision resolution, typically O(n) in worst-case scenarios.

- Trees and Graphs: Space complexity depends on the structure and number of nodes, ranging from O(n) for unbalanced trees to O(log⁡n) for balanced binary search trees.

#### In terms of consideration, time is always a priority since one can purchase more memory not time.
