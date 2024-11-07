import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The NameManager class is responsible for managing a list of names.
 * It allows you to add names, print all names, and remove names that are longer than 15 characters.
 */
public class NameManager {

    // List to store names
    private List<String> names = new ArrayList<String>();

    /**
     * Adds a name to the list of names.
     *
     * @param name the name to be added
     */
    public void addName(String name) {
        names.add(name);
    }

    /**
     * Prints all names in the list to the console.
     */
    public void printNames() {
        for (String name : names) {
            System.out.println(name);
        }
    }

    /**
     * Removes any names in the list that are longer than 15 characters.
     * This method uses an explicit iterator to safely remove names during iteration.
     */
    public void removeLongNames() {
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.length() > 15) {
                iterator.remove();  // Removes the current name from the list
            }
        }
    }
}

