import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * "Created by : goodlikemax"
 * "Date: "17.10.2019
 */
public class HashMapTry {



    public static void main(String[] args) {
        HashMapMethods methods = new HashMapMethods();

        Map<Integer, String> phoneNumbers = new HashMap<>();

        methods.filler(phoneNumbers);
        System.out.println(phoneNumbers);
        System.out.println(phoneNumbers.size());

        phoneNumbers.remove(13);
        System.out.println(phoneNumbers.containsValue("anna number:13"));


        System.out.println("hashCode " + phoneNumbers.hashCode());

        phoneNumbers.clear();
        System.out.println(phoneNumbers.size());
        System.out.println("hashCode " + phoneNumbers.hashCode());

    }

}