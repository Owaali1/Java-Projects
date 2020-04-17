

import java.util.*;

public class PeriodicTable
{
    public static void main (String[] args)
    {
        ArrayList<String> Elements = new ArrayList<String>();

        Elements.add("hydrogen");   // add elements to the ArrayList
        Elements.add("lithium");
        Elements.add("beryllium");
        Elements.add(1,"helium");   // add helium between hydrogen & lithium
        Elements.remove(1);
        System.out.println("Size = " + Elements.size());
        System.out.println("Element 2 = " + Elements.get(2));
        System.out.println("Index of beryllium = " + Elements.indexOf("beryllium"));
        System.out.println("Contains carbon?" + Elements.contains("carbon"));
        System.out.println("All Elements: " + Elements);
    }
}