
/**import java.util.Scanner;

public class HelloApp {

    public static void readNames(Scanner sc, NameManager manager) {
        System.out.println("Enter names (type 'done' to stop):");

        while (true) {
            String name = sc.nextLine();

            if (name.equalsIgnoreCase("done")) {
                break;
            }

            manager.addName(name);
        }
    }

    public static void removeName(Scanner sc, NameManager manager) {
        System.out.println("Enter a name to remove (or type 'none'):");
        String removeName = sc.nextLine();

        if (!removeName.equalsIgnoreCase("none")) {
            manager.removeName(removeName);
        }
    }

    public static void printGreetings(NameManager manager) {
        for (String n : manager.getNames()) {
            System.out.println("********");
            System.out.println("*   Hello " + n + "   *");
            System.out.println("********");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NameManager manager = new NameManager();

        readNames(sc, manager);
        removeName(sc, manager);
        printGreetings(manager);

        manager.saveToFile();

        sc.close();
    }
}
import java.util.Scanner;
public class HelloApp {
    public static void main(String[] args){
        String name ="World";
        if(args.length>0) {
            name = args[0];
        }
        System.out.println("Hello," + name + "!");
    }
}*/
import java.util.Scanner;
 public class HelloApp {
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
 }

