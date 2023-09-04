package restaurant_bot;

import restaurant_bot.model.Customer;

import java.time.LocalDateTime;

public interface TableState {
    boolean reserveTable(int id, LocalDateTime date, Customer customer);
    boolean cancelReservation(int id);
    void printFreeTables();
    void printReservedTables();
}
