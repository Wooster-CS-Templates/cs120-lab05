package TaskB;

public class Node {
    private int value;
    private Node next;

    public int getValue(){
        return value;
    }
    public Node getNext(){
        return next;
    }

    public void setValue(int num){
        value = num;
    }

    public void setNext(Node n){
        next = n;
    }
}
