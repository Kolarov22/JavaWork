package JDBC;

public class Address {
    private int id;
    private String city, country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public Address(int id, String city, String country) {
        this.id = id;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "JDBC.Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
