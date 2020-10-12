import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        //Serialization
        Student student = new Student("Bunny" , 1, "Agra", Arrays.asList("running", "playing", "climbing", "observing"));


        FileOutputStream fod = new FileOutputStream("/home/nidhi/MyProjects/test.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fod);
        oos.writeObject(student);

        oos.flush();
        oos.close();

        //Deserialization
        Student su = null;
        FileInputStream fis = new FileInputStream("/home/nidhi/MyProjects/test.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
         su = (Student)ois.readObject();
         System.out.println(su);
    }

}
