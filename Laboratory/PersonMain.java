package Laboratory;
import java.util.Scanner;


public class PersonMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonArray person = new PersonArray(5);
        person.insert("Jack", " Adam", 19);
        person.insert("Phillips", "Cecilia", 24);
        person.insert("McDougal", "Megan", 18);
        person.insert("Bolivar", "Nancy", 21);
        person.insert("Wilson", "Kate", 16);
        person.displayArray();

        System.out.print("Type in the last name of the person you wish to find: ");
        String findName = scanner.nextLine();

        Person search = person.find(findName);

        if (search != null)
            System.out.println(findName + " was found.");
        else
            System.out.println(findName + " was not found.");

        System.out.print("Insert the last name you wish to delete: ");
        String name = scanner.nextLine();

        if (person.delete(name) == true)
            System.out.println("The person was found and deleted successfully.");
        else
            System.out.println("The person was not found in the array.");
        person.displayArray();

    }
    
}
