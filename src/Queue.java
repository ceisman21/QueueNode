/*
Cooper Jonathan Eisman
Date Created: 11/10/2020
Date Modified: 11/10/2020
Creates a Queue of QueueNode type object
*/


public class Queue<T>{

    private int length;                                     //height of the queue
    private QueueNode nextNode;                              //the next node in the queue

    public Queue() {                                        //Empty Constructor.
        length = 0;
        nextNode = null;
    }
    public Queue(QueueNode inNode) {                    //Constructor with an initial node
        QueueNode tempNode = new QueueNode(inNode);
        length = 1;
        nextNode = tempNode;
    }
    void enqueue(T element) {                                  //add an element
        if(length == 0) {                                   //If the stack has no items
            QueueNode tempNode = new QueueNode(element);
            nextNode = tempNode;
        } else {                                            //If the Queue already exists
            QueueNode copyNode = new QueueNode(element);
            nextNode.setChild(copyNode);
        }
        length++;
    }
    public T dequeue(){                                         //remove and return the top element
        T tempData = peek();
        if (length == 1 || length == 0) {
            length = 0;
        } else {
            nextNode = nextNode.getChild();
            length--;
        }
        return tempData;
    }
    public boolean isEmpty() {                              //Returns whether or not the sack is empty
        if (length == 0) {
            return true;
        } else {
            return false;
        }
    }
    public int size() {                                     //Returns the height of the stack
        return length;
    }
    public T peek(){                                        //look at the top element without removing
        if (length == 0) {
            return null;
        } else {
            T tempData = (T)(nextNode.getData());
            return tempData;
        }
    }
}