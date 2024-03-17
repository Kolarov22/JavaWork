package JDBC;

import java.sql.Date;
import java.util.List;
import java.util.Objects;

public class Person {
    private int id;
    private String name, job;
    private Date birthDate;
    private Address address;
    private List<CreditCard> cards;


    public Person(String name, String job, Date birthDate, Address address, List<CreditCard> cards) {
        this.name = name;
        this.job = job;
        this.birthDate = birthDate;
        this.address = address;
        this.cards = cards;
    }

    public Person(int id, String name, String job, Date birthDate, Address address, List<CreditCard> cards) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.birthDate = birthDate;
        this.address = address;
        this.cards = cards;
    }



    @Override
    public String toString() {
        return "JDBC.Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", birthDate=" + birthDate +
                ", address=" + address +
                ", cards=" + cards +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<CreditCard> getCards() {
        return cards;
    }

    public void setCards(List<CreditCard> cards) {
        this.cards = cards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(getName(), person.getName()) && Objects.equals(getJob(), person.getJob()) && Objects.equals(getBirthDate(), person.getBirthDate()) && Objects.equals(getAddress(), person.getAddress()) && Objects.equals(getCards(), person.getCards());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getJob(), getBirthDate(), getAddress(), getCards());
    }


}
