## Java Code Readme

This repository contains three Java classes: `Main`, `MyHashTable`, and `MyTestingClass`, along with the `Student` class. These classes are used to demonstrate the functionality of a hash table implementation.

### Main.java
The `Main` class contains the main method and serves as the entry point of the program. It demonstrates the usage of the `MyHashTable` class by performing the following steps:

1. Creates a new instance of `MyHashTable` with `MyTestingClass` keys and `Student` values.
2. Adds 10,000 random elements to the hash table.
3. Prints the number of elements in each bucket.
4. Clears the hash table.
5. Adds 10,000 random elements to the hash table again.
6. Prints the number of elements in each bucket.

### MyHashTable.java
The `MyHashTable` class implements a hash table data structure. It uses separate chaining to handle collisions and supports key-value pairs of generic types. The class provides the following methods:

- `put(key, value)`: Inserts a key-value pair into the hash table.
- `get(key)`: Retrieves the value associated with the specified key.
- `remove(key)`: Removes the key-value pair associated with the specified key.
- `clear()`: Clears all the elements from the hash table.
- `getSize()`: Returns the number of elements in the hash table.
- `getBucketSize(index)`: Returns the number of elements in the bucket at the specified index.

### MyTestingClass.java
The `MyTestingClass` class represents a custom class that can be used as a key in the hash table. It contains an `id` and a `name` field, and overrides the `hashCode()` and `equals()` methods for proper hash table functionality.

### Student.java
The `Student` class represents a student object with a `name` and an `age` field. It provides a constructor to initialize the `Student` object with the given name and age, performing input validation to ensure the name is not null or empty, and the age is between 0 and 120.

Please note that the code has been modified to fix some syntax errors and improve code quality, such as adding missing annotations, proper exception handling, and removing unnecessary code repetition.

Feel free to explore the code and run the `Main` class to see the hash table in action with random elements and bucket sizes.
