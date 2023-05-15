import java.util.Objects;
import java.util.Random;

class MyTestingClass {
    private int id;
    private String name;

    public MyTestingClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Custom hashCode method to ensure uniform distribution
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    // Override equals method for consistency with hashCode
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MyTestingClass)) return false;
        MyTestingClass other = (MyTestingClass) obj;
        return id == other.id && name.equals(other.name);
    }
}

class Student {
    private String name;
    private int age;

    /**
     * Constructs a student object with the given name and age.
     *
     * @param name the name of the student, must not be null or empty
     * @param age  the age of the student, must be between 0 and 120
     * @throws IllegalArgumentException if the name is null or empty, or if the age is not between 0 and 120
     */
    public Student(String name, int age) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120");
        }
        this.name = name;
        this.age = age;
    }
}
