Custom Queue Implementation

In this exercise, you will be implementing a custom Queue class using an array-based storage system. Follow the requirements below:

Create a Queue class: This class will simulate the behavior of a queue data structure.

Initialize Variables:
queueLength: Set the default size of the queue to 3.
items: An integer array that will store the elements of the queue.
front and back: Pointers to help manage the queue's front and back, whose default value is -1. (indexes of front and back elements)

Define Helper Functions:
isEmpty(): Checks if the queue is empty. Returns true if it is, otherwise returns false.
isFull(): Checks if the queue is full. Returns true if it is, otherwise returns false.

Queue Operations:
enQueue(int itemValue): Adds an item to the back of the queue. If the queue is full, it should display a message "Queue is full".
deQueue(): Removes the front item from the queue. If the queue is empty, it should display a message "Queue is empty. Nothing to dequeue".

Display and Access Functions:
display(): Displays all the items present in the queue from front to back.
peak(): Displays the front item of the queue without removing it.

Bonus:
- Pass the max size of the array through a constructor
- Make use of Generics to save any type of data in the Queue instead of just using int (convert the Array to an ArrayList)
