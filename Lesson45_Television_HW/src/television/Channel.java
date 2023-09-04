package television;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Channel {
    Random random = new Random();
    private String name;
    private int number;
    private ArrayList<Program> programs;

    public Channel(String name, int number, ArrayList<Program> programs) {
        if (name != null && !name.equals("")) {
            this.name = name;
        }
        if (number >= 0) {
            this.number = number;
        }
        this.programs = programs;
    }
    int randomProgram() {
        return random.nextInt(programs.size() - 1);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Channel ");
        sb.append("name= ").append(name);
        sb.append(", number= ").append(number);
        sb.append(", programs= ").append(this.programs.get(randomProgram()));
        return sb.toString();
    }
}
