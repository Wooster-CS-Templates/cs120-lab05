package TaskB;

public class CircularLinkedList {

    Node head = null;

    public void add(int num){
        Node temp = new Node();
        temp.setValue(num);

        if (head == null) {
            head = temp;
            head.setNext(head);
        }
        else if (head.getNext() == head){
            temp.setNext(head);
            head.setNext(temp);
            head = temp;
        }
        else {
            Node walker = head;
            while (walker.getNext() != head){
                walker = walker.getNext();
            }
            temp.setNext(head);
            walker.setNext(temp);
            head = temp;

        }
    }

    public void length(){
        
    }

    public void purge(int num){

    }
    public void display(){
        Node walker = head;
        if (walker == null){
            System.out.println("Nothing to Print");
            return;
        }
        System.out.print(walker.getValue() + " ");
        walker = walker.getNext();

        while (walker != head){
            System.out.print(walker.getValue() + " ");
            walker = walker.getNext();
        }
        System.out.println();
    }
}
