import java.util.Objects;

public class Person implements Comparable<Person>{
    private final String lastName;
    private final String firstName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String toString() {
        return lastName + ", " + firstName;
    }
    @Override
    public boolean equals(Object o) {
        if (! (o instanceof Person)) return false;
        Person p = (Person)o;
        return firstName.equals(p.firstName) && lastName.equals(p.lastName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }


    @Override
    public int compareTo(Person other) {
        int lastNameCompare = lastName.compareTo(other.lastName);
        if (lastNameCompare != 0) {
            return lastNameCompare;
        } else {
            return firstName.compareTo(other.firstName);
        }

    }
}
