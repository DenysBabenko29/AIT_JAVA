package ait.wardrobe.model;

import java.util.Objects;

public class Wardrobe implements Comparable<Wardrobe>{
    private double height;
    private double width;
    private double depth;

    public Wardrobe(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public double area(){
        return width * depth;
    }

    public double volume(){
        return area() * height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wardrobe wardrobe = (Wardrobe) o;
        return Double.compare(wardrobe.height, height) == 0 && Double.compare(wardrobe.width, width) == 0 && Double.compare(wardrobe.depth, depth) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width, depth);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Wardrobe : ");
        sb.append("height= ").append(height);
        sb.append(", width= ").append(width);
        sb.append(", depth= ").append(depth);
        sb.append(", area= ").append(area());
        sb.append(", volume= ").append(volume());
        return sb.toString();
    }

    @Override
    public int compareTo(Wardrobe o) {
        /*
        if (height > o.height){
            return 1;
        } else if (height < o.height) {
            return -1;
        }
        return 0;
         */
        return Double.compare(height, o.height);
    }
}
