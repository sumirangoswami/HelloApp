import java.io.*;
import java.util.ArrayList;

public class NameManager {

    private ArrayList<String> names;

    public NameManager() {
        names = new ArrayList<>();
    }

    public void addName(String name) {
        names.add(name);
    }

    public void removeName(String name) {
        names.remove(name);
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public void saveToFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("names.txt"));

            for (String name : names) {
                writer.write(name);
                writer.newLine();
            }

            writer.close();
        } catch (IOException e) {
            System.out.println("Error saving names.");
        }
    }
}