package JDBC;

import java.util.List;

public interface PersonDao{
    List<Person> findAll();
    Person findById(int id);
    void insert(Person person);
    //void update(JDBC.Person person);
    //void delete(int personId);

}