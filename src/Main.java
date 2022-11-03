import java.util.LinkedList;
import java.util.Queue;


public class Main {
    public static LinkedList<Person> generateClients() {
        LinkedList<Person> listPerson = new LinkedList<>();

        listPerson.add(new Person("Alsu", "Shcherbakova", 3));
        listPerson.add(new Person("Olya", "Smirnova", 2));
        listPerson.add(new Person("Kolya", "Kalugin", 5));
        listPerson.add(new Person("Sasha", "Shustov", 2));
        listPerson.add(new Person("Vera", "Grishina", 4));
        return listPerson;
    }

    public static void main(String[] args) {

        Queue<Person> queue = new LinkedList<>();

        LinkedList<Person> clients = generateClients();
       /* for(int i=0;i<clients.size();i++)
        {queue.add(clients[i]);}*/
        for (Person person : clients
        ) {
            queue.add(person);

        }
        while (true) {
            if (queue.isEmpty()) break;
            Person personMinus = new Person(queue.peek().name, queue.peek().surname, queue.peek().count - 1);
            if (personMinus.count != 0) {
                queue.add(personMinus);
            }
            System.out.println(queue.peek().name + " " + queue.poll().surname + " Прокатился на оттракционе ");
        }

    }
}
