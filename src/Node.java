/**
 * Created by maxzi on 24.04.2018.
 */
public class Node
{

    private Node next;
    private Node prev;
    private  int number;
    private  int id;


    public Node(Node clone) {
        next = clone.getNext();
        prev = clone.getPrev();
        number = clone.getNumber();
        id = clone.getId();
    }

    public Node(Node prev, int number, int id) {

        this.id = id;
        this.number = number;
        this.prev = prev;

    }

    @Override
    public String toString() {
        return "Node{" +
                "number=" + number +
                ", id=" + id +
                '}';
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }



    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
