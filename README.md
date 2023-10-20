Exercise: Implement a Custom Stack

Objective:
Create a custom stack class named CustomStack that operates on long data types. This stack should be implemented using an array and should provide basic stack operations.

Requirements:

Fields:
maxSize: An integer attribute to store the maximum size of the stack.
stackArray: A long array to store the elements of the stack.
top: An integer attribute to keep track of the top element's position in the stack.

Constructor:
The constructor should accept an integer s, which indicates the maximum size of the stack.
Initialize maxSize with the value of s.
Initialize stackArray to a new long array with the size of maxSize.
Initialize top to -1, indicating that the stack is initially empty.

Methods: Implement the following methods:
push(long j): Accepts a long value j and pushes it onto the top of the stack. Ensure that the stack does not overflow.
pop(): Removes and returns the top element of the stack. Ensure that the stack is not empty before popping.
peek(): Returns the top element of the stack without removing it.
isEmpty(): Returns true if the stack is empty, otherwise false.
isFull(): Returns true if the stack is full, otherwise false.

Constraints:
The push method should not push an element onto the stack if it's full.
The pop method should not pop an element from the stack if it's empty.
Assume that the maximum size of the stack will be a positive integer.

Add proper exception handling to the push, pop, and peek methods. Throw exceptions like StackOverflowException when trying to push to a full stack and IllegalStateException when trying to pop from an empty stack.

Bonus:

Dynamic Resizing:
Modify the CustomStack class to automatically double its capacity when it's full. This means, if a push operation is performed when the stack is full, the size of the stackArray should be doubled before adding the new element.
Similarly, if more than three-fourths of the stack is empty, reduce its size to half to save memory. However, the size should never go below the initial maxSize.

Implement a size() Method:
Add a method named size() that returns the current number of elements in the stack.

Multiple Data Types:
Use Java Generics to allow your CustomStack to work with any data type, not just long. This will enable the user to create stacks of integers, strings, custom objects, etc.

Add a toString Method:
Override the toString method to return a string representation of the stack. The top of the stack should be on the right side of the output. For example, if the stack has elements [1, 2, 3] with 3 being the top, the method should return "1, 2, 3".

Stack Operations with Custom Objects:
If you have implemented generics, create a custom object, say Person with attributes like name and age. Implement the Comparable interface in the Person class. Now, use your CustomStack to store Person objects and sort them based on the age or name.

