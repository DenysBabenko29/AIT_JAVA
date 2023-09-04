package restaurant_bot.model;

import java.time.LocalDateTime;

public class Table {
    private int id;
    private boolean isReserved;
    private LocalDateTime reservedFrom;
    private Customer customer;

    public Table(int id, boolean isReserved, LocalDateTime reservedFrom, Customer customer) {
        this.id = id;
        this.isReserved = isReserved;
        this.reservedFrom = reservedFrom;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public LocalDateTime getReservedFrom() {
        return reservedFrom;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public void setReservedFrom(LocalDateTime reservedFrom) {
        this.reservedFrom = reservedFrom;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
