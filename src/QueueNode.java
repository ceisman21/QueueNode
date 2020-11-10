/*
Cooper Jonathan Eisman
Date Created: 11/10/2020
Date Modified: 11/10/2020
QueueNode object -- essentially a specialized node class
*/


public class QueueNode<T> {

    private T data;                                    //The data stored in the Node
    private QueueNode child;                           //Child of the node
    private boolean hasChild;                          //Returns whether this is the last data in the stack

    public QueueNode() {                               //Default Constructor
        //Initialize variables
        data = null;
        hasChild = false;
        child = null;
    }
    public QueueNode(T data) {                         //Constructor with Data
        //Initialize variables
        this.data = data;
        hasChild = false;
        child = null;
    }
    public QueueNode(T data, QueueNode child) {        //Constructor with Data and Child
        //Initialize variables
        this.data = data;
        hasChild = false;
        this.child = child;
    }
    public QueueNode(QueueNode tempNode) {             //Constructor with annother node
        //Initialize variables
        data = (T)(tempNode.getData());
        hasChild = tempNode.hasChild();
        child = tempNode.getChild();
    }

    public T getData(){                                //Returns the Data of this node
        return data;
    }
    public boolean hasChild() {                        //Returns whether or not this node has a child
        return hasChild;
    }
    public QueueNode getChild(){                       //Returns the child of this Node
        return child;
    }
}