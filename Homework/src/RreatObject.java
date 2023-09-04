import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class RreatObject {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int personCount = ois.readInt();
            Person[] persons = new Person[personCount];

            for (int i = 0; i < personCount; i++) {
                persons[i] = (Person) ois.readObject();
            }

            System.out.println(Arrays.deepToString(persons));
            ois.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
