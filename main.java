import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create new hash table with MyTestingClass keys and Student values
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>();

        // Add 10,000 random elements to the hash table
        Random rand = new Random(1234); // Use a fixed seed for random number generation
        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(rand.nextInt(1000), "Name" + i);
            Student value = new Student("Major" + i, rand.nextInt(4) + 1);
            table.put(key, value);
        }

        // Print the number of elements in each bucket
        for (int i = 0; i < table.getSize(); i++) {
            int bucketSize = table.getBucketSize(i);
            System.out.println("Bucket " + i + " size: " + bucketSize);
        }

        // Clear the hash table and add 10,000 random elements again
        table.clear();
        rand = new Random(1234); // Reset the random number generator with the same seed
        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(rand.nextInt(1000), "Name" + i);
            Student value = new Student("Major" + i, rand.nextInt(4) + 1);
            table.put(key, value);
        }

        
        // Print the number of elements in each bucket again
        for (int i = 0; i < table.getSize(); i++) {
            int bucketSize = table.getBucketSize(i);
            System.out.println("Bucket " + i + " size: " + bucketSize);
        }
    }
}
