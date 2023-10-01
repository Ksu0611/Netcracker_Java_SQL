

public class task33 {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Иванов", 1999, new Address("Первая")),
                new Person("Петров", 1998, new Address("Первая")),
                new Person("Сидоров", 1997, new Address("Вторая")),
                new Person("Бунаков", 1996, new Address("Третья"))
        };

        // Вывод человека по фамилии
        System.out.println("Поиск Человека по фамилии:");
        Person personByLastName = findPersonByLastName(people, "Иванов");
        if (personByLastName != null) {
            personByLastName.printLastName();
        } else {
            System.out.println("Человек с указанной фамилией не найден.");
        }

        // Вывод человека по адресу
        System.out.println("Поиск Человека по адресу:");
        Person personByStreet = findPersonByStreet(people, "Вторая");
        if (personByStreet != null) {
            personByStreet.printLastName();
        } else {
            System.out.println("Человек с указанным адресом не найден.");
        }


        // Вывод людей, родившихся между определенными датами
        System.out.println("Поиск людей между определенными датами:");
        printPeopleByDateRange(people, 1995, 1998);

        // Вывод самого старого человека
        System.out.println("Самый старый человек:");
        Person Oldest = findOldestPerson(people);
        Oldest.printLastName();


        //Вывод самого молодого человека
        System.out.println("Самый молодой человек:");
        Person Youngest = findYoungestPerson(people);
        Youngest.printLastName();

        // Вывод людей, живущих на одной улице
        System.out.println("Поиск людей по улице");
        printPeopleByStreet(people, "Первая");

    }

/*Функция поиска человека по имени*/
/*----------------------------------------------------------------------------------------*/
    public static Person findPersonByLastName(Person[] people, String lastName) {
        for (Person person : people) {
            if (person.getLastName() == lastName) {
                return person;
            }
        }
        return null;
    }
/*----------------------------------------------------------------------------------------*/
/*Функция поиска человека по улице*/
/*----------------------------------------------------------------------------------------*/
    public static Person findPersonByStreet(Person[] people, String address) {
        for (Person person : people) {
            if (person.getAddress().getStreet().equals(address)) {
                return person;
            }
        }
        return null;
    }
/*----------------------------------------------------------------------------------------*/
/*Функция вывода людей по интервалу дат*/
/*----------------------------------------------------------------------------------------*/
    public static void printPeopleByDateRange(Person[] people, int startDate, int endDate) {
        for (Person person : people) {
            int birthDate = person.getBirthYear();
            if ((birthDate > startDate) &&( birthDate < endDate)) {
                person.printLastName();
            }
        }
    }
/*----------------------------------------------------------------------------------------*/
    /*Функция поиска самого старого человека*/
/*----------------------------------------------------------------------------------------*/
    public static Person findOldestPerson(Person[] people) {
        Person oldestPerson = people[0];
        for (int i = 1; i < people.length; i++) {
            if (people[i].getBirthYear() < (oldestPerson.getBirthYear())) {
                oldestPerson = people[i];
            }
        }
        return oldestPerson;

    }
/*----------------------------------------------------------------------------------------*/
/*Функция поиска самого молодого человека*/
/*----------------------------------------------------------------------------------------*/
    public static Person findYoungestPerson(Person[] people) {
        Person youngestPerson = people[0];
        for (int i = 1; i < people.length; i++) {
            if (people[i].getBirthYear() > (youngestPerson.getBirthYear())) {
                youngestPerson = people[i];
            }
        }
        return youngestPerson;
    }
/*----------------------------------------------------------------------------------------*/
/*Функция вывода людей с одной улицы*/
/*----------------------------------------------------------------------------------------*/
    public static void printPeopleByStreet(Person[] people, String street) {
        for (Person person : people) {
            String personStreet = person.getAddress().getStreet();
            if (personStreet.equals(street)) {
                person.printLastName();
            }
        }
    }
/*----------------------------------------------------------------------------------------*/


}





