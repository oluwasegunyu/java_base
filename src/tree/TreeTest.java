package tree;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * This program sort a set of Item objects by comparing their descriptions
 * @version
 * @author yxy
 */
public class TreeTest {
    public static void main(String... args){
        var parts = new TreeSet<Item>();
        parts.add(new Item("Toaster", 1234));
        parts.add(new Item("Widget", 4567));
        parts.add(new Item("Modem", 9912));
        System.out.println(parts);

        var sortByDescription = new TreeSet<Item>(Comparator.comparing(Item::getDescription));

        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);
    }
}
