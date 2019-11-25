import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList linklList = new LinkedList();
        Random r = new Random();


        for(int i = 1;i <= 10;i++){
            int random = r.nextInt((150 - 1) + 1) + 1;
            linklList.addNode(random);
        }

        //linklList.delNode();
        //linklList.showAll();
        System.out.println(linklList.getById(5));

        //linklList.testSwitchById(5, 7);
        linklList.showAll();
    }
}
