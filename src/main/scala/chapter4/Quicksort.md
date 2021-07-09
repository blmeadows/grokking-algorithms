# Quicksort

- Quicksort is a sorting algorithm that uses divide-and-conquer (D&C)
- D&C is a well-known recursive technique for solving problems
- Quicksort is much faster than selection sort
- To solve a problem using D&C, there are two steps:
    - Figure out the base case. This should be the simplest possible case.
    - Divide or decrease your problem until it becomes the base case.
- Euclid's algorithm explanation: https://www.khanacademy.org/computing/computer-science/cryptography/modarithmetic/a/the-euclidean-algorithm
- When writing a recursive function involving an array, the base case is often an empty array or an array with one element.
  
- Exercises
    - `4.1` Write out the code for the earlier `sum` function. :white_check_mark:
    - `4.2` Write a recursive function to count the number of items in a list. :white_check_mark:
    - `4.3` Find the maximum number in a list. :white_check_mark:
    - `4.4` Remember binary search from chapter 1? 
            It’s a divide-and-conquer algorithm, too. 
            Can you come up with the base case and recursive case for binary search?
      - *base case*: array with one item
      - *recursive case*: split array in half, call again on good half
    
### Quicksort logic
- Pick a pivot and find elements smaller and larger than the pivot
- After *partitioning*, you have:
    - A sub-array of all the numbers less than the pivot
    - The pivot
    - A sub-array of all the numbers greater than the pivot
- The two sub-arrays aren't sorted.
- Steps:
    - Pick a pivot
    - Partition the array into two sub-arrays: elements less than the pivot and elements greater than the pivot
    - Call quicksort recursively on the two sub-arrays
- In the best-case (and in the average case) for Quicksort, the height of the call stack is O(log n) and each level takes O(n) time
    - The entire algorithm will take O(n) * O(log n) = O(n log n) time.
- In the worst case, there are O(n) level, so the algorithm will take O(n) * O(n) = O(n<sup>2</sup>) time.
    - Choosing a random element (vs just the first element) as the pivot will result in average case run time.
- Merge sort has a run time of O(n log n) but a constant larger than Quicksort
- The constant in Big O notation can make a difference when comparing two algorithms with the same run time

- Exercises: How long would each of these operations take in Big O notation?
    - `4.5` Printing the value of each element in an array.
        - O(n)
    - `4.6` Doubling the value of each element in an array.
        - O(n)
    - `4.7` Doubling the value of just the first element in an array.
        - O(1)
    - `4.8` Creating a multiplication table with all the elements in the array. 
            So if your array is [2, 3, 7, 8, 10], you first multiply every element by 2, 
            then multiply every element by 3, then by 7, and so on.
        - O(n<sup>2</sup>)
    
### Inductive proofs
- Inductive proofs are one way to prove that an algorithm works
- Each has two steps: the base case, and the inductive case

### Recap
- D&C works by breaking a problem down into smaller and smaller pieces. 
  If you’re using D&C on a list, the base case is probably an empty array or an array with one element.
- If you’re implementing quicksort, choose a random element as the pivot. 
  The average runtime of quicksort is O(n log n)!
- The constant in Big O notation can matter sometimes. That’s why quicksort is faster than merge sort.
- The constant almost never matters for simple search versus binary search, 
  because O(log n) is so much faster than O(n) when your list gets big.
