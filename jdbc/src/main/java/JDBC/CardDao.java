package JDBC;

import java.util.List;

public interface CardDao {
    List<CreditCard> findAll();
    List<CreditCard> findByOwner(int owner);
    CreditCard insert(CreditCard card, Person owner);
    //void update(JDBC.CreditCard card);
    //void delete(int cardId);
}
