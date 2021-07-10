# Hash Tables

- A *hash function* maps strings to numbers.
  -  (strings == any kind of data &ndash; a sequence of bytes)
- A hash function must:
  - return the same output for the same input
  - return different output for different input (in every case for the best case)
- The output of a hash function will be an array index and will only return valid indexes for the array.
- A *hash table* is a data structure that uses a hash function and an array together.
  - store the hash function input at the output index in the array
- Hash tables are also known as hash maps, maps, dictionaries, and associative arrays.

- Exercises: Which of these hash functions are consistent?
  - `5.1` :heavy_check_mark:
    ```
    f(x) = 1 // returns 1 for all input
    ```
  - `5.2` :x:
    ```
    f(x) = rand() // returns a random number every time
    ```
  - `5.3` :x:
    ```
    f(x) = next_empty_slot() // returns the index of the next empty slot in the hash table
    ```
  - `5.4` :heavy_check_mark:
    ```
    f(x) = len(x) // returns the length of the string
    ```

- Hash tables are great when you want to:
  - Create a mapping from one thing to another thing
  - Look something up

- Use cases:
  - Modeling relationships from one thing to another thing
    - ex: *DNS resolution* &ndash; mapping a web address to an IP address, and phone number lookup
  - Filtering out duplicates
    - ex: checking a voting list
  - Caching/memorizing data instead of making your server do work
    - ex: Facebook saving their home page instead of always calling for it from the server
- Collisions:
  - A collision is when two keys have been assigned the same slot.
  - The simplest solution for collisions is to start a linked list at that slot.
  - The hash function is really important and will give very few collisions (and so avoid long linked lists)
- Performance:
  - In the average case, hash tables take O(1) for everything, aka Constant time.
    - Constant time means it will stay the same regardless of size (not instant).
  - In the worst case, hash tables take O(n) for everything, aka Linear time, which is really slow.
  
    |   | Hash Tables<br>(average) | Hash Tables<br>(worst) | Arrays | Lists |
    |---|---|---|---|---|
    | Search | O(1) | O(n) | O(1) | O(n) |
    | Insert | O(1) | O(n) | O(n) | O(1) |
    | Delete | O(1) | O(n) | O(n) | O(1) |
  - To avoid collisions, you need:
    - a low load factor (resizing as necessary &ndash; rule of thumb of greater than 0.7)
    - a good hash function (that distributes values in the array evenly, ex: the SHA function)
  
- Exercises
  - Suppose you have these four hash functions that work with strings:
    1. Return “1” for all input.
    2. Use the length of the string as the index.
    3. Use the first character of the string as the index. 
       So, all strings starting with a are hashed together, and so on.
    4. Map every letter to a prime number: a = 2, b = 3, c = 5, d = 7, e = 11, and so on. 
     For a string, the hash function is the sum of all the characters modulo the size of the hash. 
       For example, if your hash size is 10, and the string is “bag”, the index is 3 + 2 + 17 % 10 = 22 % 10 = 2. 
  - For each of these examples, which hash functions would provide a good distribution? 
    Assume a hash table size of 10 slots.
    - `5.5` A phonebook where the keys are names and values are phone numbers. 
            The names are as follows: Esther, Ben, Bob, and Dan.
      - Map every letter to a prime number. For a string, the hash function is the sum of all the characters modulo the size of the hash.
    - `5.6` A mapping from battery size to power. The sizes are A, AA, AAA, and AAAA.
      - Use the length of the string as the index.
    - `5.7` A mapping from book titles to authors. The titles are Maus, Fun Home, and Watchmen.
      - Use the length of the string as the index.

- Recap
  - You’ll almost never have to implement a hash table yourself. The programming language you use should provide an implementation for you.
  - You can make a hash table by combining a hash function with an array.
  - Collisions are bad. You need a hash function that minimizes collisions.
  - Hash tables have really fast search, insert, and delete.
  - Hash tables are good for modeling relationships from one item to another item.
  - Once your load factor is greater than 0.7, it’s time to resize your hash table.
  - Hash tables are used for caching data (for example, with a web server).
  - Hash tables are great for catching duplicates.
  
  

