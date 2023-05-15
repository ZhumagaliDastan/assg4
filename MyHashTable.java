import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create new hash table with MyTestingClass keys and Student values
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>();

        // Add 10,000 random elements to hash table
        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(rand.nextInt(1000), "Name" + i);
            Student value = new Student("Major" + i, rand.nextInt(4) + 1);
            table.put(key, value);
        }

        // Print number of elements in each bucket
        for (int i = 0; i < table.getSize(); i++) {
            int bucketSize = table.getBucketSize(i);
            System.out.println("Bucket " + i + " size: " + bucketSize);
        }

        // Clear hash table and add 10,000 random elements again
        table.clear();
        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(rand.nextInt(1000), "Name" + i);
            Student value = new Student("Major" + i, rand.nextInt(4) + 1);
            if (value != null) { // Check if the value is not null before adding
                table.put(key, value);
            }
        }

        // Print number of elements in each bucket again
        for (int i = 0; i < table.getSize(); i++) {
            int bucketSize = table.getBucketSize(i);
            System.out.println("Bucket " + i + " size: " + bucketSize);
        }
    }
}
