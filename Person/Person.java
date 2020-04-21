package Person;

public class Person {
    private String firstName;
    private String lastName;
    private int age;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (age < 100 && age > 0) ? age : 0;
    }

    public boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }

    public String getFullName() {
        if (this.lastName.isEmpty() && this.firstName.isEmpty())
            return "";
        else if (this.firstName.isEmpty())
            return lastName;
        else if (this.lastName.isEmpty())
            return firstName;
        else
            return String.format("%s %s", firstName, lastName);
    }

}
