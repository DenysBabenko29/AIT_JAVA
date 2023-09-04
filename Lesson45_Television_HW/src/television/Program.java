package television;

import java.time.LocalTime;

public class Program {
    private String title;
    private int num;

    public Program(String title, int num) {
        setTitle(title);
        this.num =  num;
    }

    public void setTitle(String title) {
        if (title == null || title.equals("")){
            System.err.println("Такого канала не может быть");
        }
        this.title = title;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(title);
        return sb.toString();
    }
}
