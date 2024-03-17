package JDBC;

import java.sql.Date;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AddressDaoImpl adDao = new AddressDaoImpl();
        CardDaoImpl cardDao = new CardDaoImpl();
        PersonDaoImpl persDao = new PersonDaoImpl();
        ArrayList<Person> persons = (ArrayList<Person>) persDao.findAll();
        persons.stream().forEach(System.out::println);
        System.out.println("---------------");

        Address a = new Address("New York", "USA");


        Person p = new Person(
                "John", "Avocat", new Date(1990,9,27), a, new ArrayList<CreditCard>()
        );


        persDao.insert(p);
        CreditCard c = new CreditCard("RO72D", 10000.0);
        cardDao.insert(c, p);



        persons = (ArrayList<Person>) persDao.findAll();
        persons.stream().forEach(System.out::println);



    }


}