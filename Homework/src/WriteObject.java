import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {

        Person[] persons = new Person[3];
        persons[0] = new Person(1, "Bob");
        persons[1] = new Person(2, "Mike");
        persons[2] = new Person(3, "Joy");

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(persons.length);

            for(Person person: persons){
                oos.writeObject(person);
            };

            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
