import java.util.Hashtable;
import java.util.Date;

public class DateHashtableCopier {
    public static void copyDates(Hashtable<String, Date> source, Hashtable<String, Date> destination) {
        destination.clear();

        for (String key : source.keySet()) {
            Date value = source.get(key);
            destination.put(key, value);
        }
    }

    public static void main(String[] args) {
        Hashtable<String, Date> sourceHashtable = new Hashtable<>();
        sourceHashtable.put("key1", new Date());

        Hashtable<String, Date> destinationHashtable = new Hashtable<>();
        copyDates(sourceHashtable, destinationHashtable);
      
        Date copiedDate = destinationHashtable.get("key1");
        System.out.println("copied data: " + copiedDate);
    }
}
