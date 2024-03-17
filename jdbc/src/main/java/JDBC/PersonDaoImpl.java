package JDBC;

import org.checkerframework.checker.units.qual.A;

import java.sql.*;
import java.util.*;
public class PersonDaoImpl extends CoreDao implements PersonDao{
    @Override
    public List<Person> findAll() {
        List<Person> persons = new ArrayList<>();
        String query = "SELECT * FROM persons";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                AddressDaoImpl adDao = new AddressDaoImpl();
                Address address = adDao.findById(resultSet.getInt("address"));
                CardDaoImpl cardDao = new CardDaoImpl();
                List<CreditCard> cards = cardDao.findByOwner(resultSet.getInt("id"));
                persons.add(new Person(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("job"),
                        resultSet.getDate("birthdate"),
                        address, cards));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return persons;
    }
    @Override
    public Person findById(int id) {
        String query = "SELECT * FROM persons WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                AddressDaoImpl adDao = new AddressDaoImpl();
                Address address =  adDao.findById(resultSet.getInt("address"));
                CardDaoImpl cardDao = new CardDaoImpl();
                List<CreditCard> cards = cardDao.findByOwner(resultSet.getInt("id"));
                return new Person(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("job"),
                        resultSet.getDate("birthdate"),
                        address, cards);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void insert(Person person) {
        String query = "INSERT INTO persons (name, address, job, birthdate) VALUES (?, ?, ?, ?)";
        AddressDaoImpl adDao = new AddressDaoImpl();
        Address a = adDao.find(person.getAddress().getCity(), person.getAddress().getCountry());

        if(a == null){
            adDao.insert(a);
        }

            try (PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
                statement.setString(1, person.getName());
                statement.setInt(2, a.getId());
                statement.setString(3, person.getJob());
                statement.setDate(4, person.getBirthDate());
                statement.executeUpdate();
                ResultSet rs = statement.getGeneratedKeys();
                if (rs.next()) {
                    person.setId(rs.getInt(1));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }



    }
}
