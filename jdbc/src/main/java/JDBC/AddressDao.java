package JDBC;

import java.util.List;

public interface AddressDao {
    List<Address> findAll();
    Address find(String city, String country);
    void insert(Address address);

    Address findById(int id);
    //void update(JDBC.Address address);
    //void delete(int addressId);
}