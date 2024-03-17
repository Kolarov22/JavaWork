package JDBC;

import java.sql.*;
import java.util.*;

public class AddressDaoImpl extends CoreDao implements AddressDao{
    @Override
    public List<Address> findAll() {
        List<Address> addresses = new ArrayList<>();
        String query = "SELECT * FROM addresses";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                addresses.add(new Address(resultSet.getInt("id"),
                        resultSet.getString("city"),
                        resultSet.getString("country")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return addresses;
    }

    @Override
    public void insert(Address address) {
        String query = "INSERT INTO addresses (city, country) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, address.getCity());
            statement.setString(2, address.getCountry());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Address find(String city, String country) {
        String query = "SELECT * FROM addresses WHERE city = ? AND country = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, city);
            statement.setString(2, country);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Address(resultSet.getInt("id"),
                        resultSet.getString("city"),
                        resultSet.getString("country"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Address findById(int id) {
        String query = "SELECT * FROM addresses WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Address(resultSet.getInt("id"),
                        resultSet.getString("city"),
                        resultSet.getString("country"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}
