public class Person {
    private String name;
    private String surname;
    private int count;

    public Person(String name, String surname, int count) {
        this.name = name;
        this.surname = surname;
        this.count = count;

    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void spendTicket() {
        count--;
    }
}
