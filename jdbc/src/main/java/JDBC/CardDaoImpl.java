package JDBC;

import java.util.*;
import java.sql.*;

public class CardDaoImpl extends CoreDao implements CardDao{
    @Override
    public List<CreditCard> findAll() {
        List<CreditCard> cards = new ArrayList<>();
        String query = "SELECT * FROM cards";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                cards.add(new CreditCard(resultSet.getInt("id"),
                        resultSet.getString("iban"),
                        resultSet.getDouble("amount"),
                        resultSet.getInt("owner")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cards;
    }

    @Override
    public List<CreditCard> findByOwner(int owner) {
        List<CreditCard> cards = new ArrayList<>();
        String query = "SELECT * from cards where owner = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, owner);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()) {
                cards.add(
                        new CreditCard(resultSet.getInt("id"),
                                resultSet.getString("iban"),
                                resultSet.getDouble("amount"),
                                resultSet.getInt("owner"))
                );
            }
        }

        catch (SQLException e) {
            e.printStackTrace();
        }

        return cards;
    }

    @Override
    public CreditCard insert(CreditCard card, Person owner) {
            String insertCardSQL = "INSERT into cards(iban,amount, owner) values(?,?,?)";
            try (
                    PreparedStatement insertCard = connection.prepareStatement(insertCardSQL,Statement.RETURN_GENERATED_KEYS);
            ) {
                insertCard.setString(1,card.getIBAN());
                insertCard.setDouble(2,card.getAmount());
                insertCard.setInt(3,owner.getId());
                insertCard.executeUpdate();
                ResultSet generatedKeys = insertCard.getGeneratedKeys();
                if (generatedKeys.next()) {
                    card.setId(generatedKeys.getInt(1));

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return card;
        }

}
