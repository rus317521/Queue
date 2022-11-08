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

        for (Person person : clients
        ) {
            queue.add(person);

        }
        while (true) {
            if (queue.isEmpty()) break;
            Person person = queue.poll(); //одновременно вернули и удалили элемент из очереди

            person.spendTicket(); //Уменьшили кол-во билетов
            if (person.getCount() != 0) {

                queue.offer(person); //Добавили Person в конец очереди
            }
            System.out.println(person.getName() + " " + person.getSurname() + " Прокатился на оттракционе ");
        }

    }
}
