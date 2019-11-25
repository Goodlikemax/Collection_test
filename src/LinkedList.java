import java.util.Scanner;

/**
 * Created by maxzi on 24.04.2018.
 */
public class LinkedList
{
    Scanner scanner = new Scanner(System.in);
    private int id = 0;
    private Node prev;
    private Node next;
    private Node current;
    
    

    public boolean addNode(int number){

        //System.out.println("enter number");
        //number = scanner.nextInt();
        
        Node node = new Node(prev,number, id);
        if(prev != null){
            prev.setNext(node);
        }
        this.prev = node;
        
        id++;

        return true;
    }

    public boolean delNode(){
        prev.getPrev().setNext(null);
        prev = prev.getPrev();
        return true;
    }

    public void showAll(){
        current = prev;

        while (current.getPrev() != null){

            current = current.getPrev();
        }



        while (current != null){

            System.out.println(current.toString());
            current = current.getNext();

        }

    }

    public Node getById(int id){
        current = prev;

        while (current.getId() != id){

            current = current.getPrev();
        }
        return current;
    }

    private void switchNode( Node first, Node second ){
        Node switcher = new Node(first);
        first.setNext(second.getNext());
        first.setPrev(second.getPrev());
        second.setNext(switcher.getNext());
        second.setPrev(switcher.getPrev());


    }

    public void testSwitchById (int a, int b){

        switchNode(getById(a),getById(b));

    }

    public void sort(){


    }


}
