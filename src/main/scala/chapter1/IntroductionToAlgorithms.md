# Introduction to Algorithms

Intro:
- **Simple Search** will take **n** steps to run in the *worst case*
- **Binary Search** will take **log<sub>2</sub>n** steps to run in the *worst case*

Logarithms:
- Logs are the flip of exponentials
- In this book for time in Big O notation, log always means log<sub>2</sub> (log base 2)
    - ex: for a list of 8 numbers
        - Simple Search would need to check 8 numbers at most
        - Binary Search would need to check 3 numbers at most
            - log 8 == log<sub>2</sub>8 == 3 <--> 2<sup>3</sup> = 8
            - Binary Search only works when list is in *sorted order*

Exercise:
- `1.1` Suppose you have a sorted list of 128 names, and you’re searching through it using binary search. What’s the maximum number of steps it would take?
    - 7
- `1.2` Suppose you double the size of the list. What’s the maximum number of steps now?
    - 8


Running Time:
- Big O Notation tells you how fast an algorithm is (how many operations it will make in the worst case)
- Simple Search runs in linear time                     = O(n)
- Binary Search runs in logarithmic time (aka log time) = O(log<sub>2</sub>n)
- ex:
    - for 1 billion items, if every step takes 1ms
    - simple search will take ~11 days
    - binary search will take ~30ms

Five common Big O run times, sorted from fastest to slowest:

| Big O Notation | aka | Example |
| --- | --- | --- |
| O(log n) | log time | Binary search. |
| O(n) | linear time | Simple search. |
| O(n * log n) |  | A fast sorting algorithm, like Quicksort (chapter 4). |
| O(n²) |  | A slow sorting algorithm, like Selection Sort (chapter 2). |
| O(n!) | factorial time | A really slow algorithm, like the Traveling Salesperson. |

Exercise:
- `1.3` You have a name, and you want to find the person’s phone number in the phone book.
    - O(log n)
- `1.4` You have a phone number, and you want to find the person’s name in the phone book.(Hint: You’ll have to search through the whole book!)
    - O(n)
- `1.5` You want to read the numbers of every person in the phone book.
    - O(n)
- `1.6` You want to read the numbers of just the As. (This is a tricky one! It involves concepts that are covered more in chapter 4. Read the answer—you may be surprised!)
    - O(n)

Recap
- Binary search is a lot faster than simple search.
- O(log n) is faster than O(n), but it gets a lot faster once the list of items you’re searching through grows.
- Algorithm speed isn’t measured in seconds.
- Algorithm times are measured in terms of growth of an algorithm.
- Algorithm times are written in Big O notation.