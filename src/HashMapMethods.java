import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * "Created by : goodlikemax"
 * "Date: "17.10.2019
 */
public class HashMapMethods {
    public void filler(Map current){
        for (int i = 0; i < 100; i++) {
            current.put(i,"anna number:"+ i);
            System.out.println("added with id:"+ i + "anna number:" + i + " hashcode :" +current.hashCode());
//            current.put(ThreadLocalRandom.current().nextInt(1, 10000),"anna number:"+ i);
        }
//        return current;
    }
}
