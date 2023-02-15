# Sorting and Searching Algorithm Program

In this CLI program you are presented with a menu where with four options, two for sorting and two for searching. It was the final project for the Programmin Languages III course, where we learned Data Structures, such as Linked Lists, Queues, Stacks, Trees, Maps, Graphs and more. Then we learnt algorithms, their O complexity and  many examples like Sorting, Searchs, and Path Finders.

### About the menu:
1. Linear Search: an O(n) algorithm that checks one by one if the element is in the array.
2. Binary Search: an O(log n) algorithm that divides the array in 2, then calls itself recursevily until reaching an 1 element array, finally finds the element.
3. Insertion Sort: an O(n^2) algorithm that builds the final sorted array one item at a time by comparing each item with the items before it and inserting it into its correct position in the sorted array.
4. Quicksort: an O(n*log(n)) a divide-and-conquer sorting algorithm that recursively partitions an array around a pivot element, and sorts subarrays on either side of the pivot until the entire array is sorted.

![Program Screenshot](https://github.com/TomasGlavina/finalProject/blob/master/p-screenshot.png)

### About the program and code:
The program is very intuitive to use and used OOP paradigm methodologies to seperate the program into 4 different concerns: 
- main
- ui
- search 
- sort 

The main program calls the start() function from  that handles the main loop that is only exited when the input q/Q. 
Then it calls the optionHandling function that takes the user input, and serves the input as an output to the Search or Sort objects created. 

I tried to keep the code clean and as atomic as possible. Each function performs only one thing and it calls the others for more functionalities.
Also input validation was taken into consideration and it wont take wrong inputs. 


### To-Do

I will implement a 5th option, where it takes the different algorithms and compares them in huge arrays of thousands of elemnts, and also in smaller ones with 100 elements.
It will compare the performance, memory usage and overal speed.
