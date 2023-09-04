package practice;

import java.util.Objects;

public class Bus implements Comparable<Bus> {
    String brand;
    String route;
    int capacity;

    public Bus(String brand, String route, int capacity) {
        this.brand = brand;
        this.route = route;
        this.capacity = capacity;
    }

    public Bus() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bus{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", route='").append(route).append('\'');
        sb.append(", capacity=").append(capacity);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return Objects.equals(route, bus.route);
    }

    @Override
    public int hashCode() {
        return Objects.hash(route);
    }

    @Override
    public int compareTo(Bus o) {
        return route.compareTo(o.route); // сортируем по маршруту
    }
}
