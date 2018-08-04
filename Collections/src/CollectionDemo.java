import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();

		v.add("Oracle");
		v.add("Microsoft");
		v.add("Google");
		v.add("Apple");
		v.add("IBM");

		System.out.println("-- Iterating over Vector using for Each");
		for (String elem : v)
			System.out.println(elem);

		System.out.println("-- Iterating over Vector using Iterator");

		Iterator<String> itr = v.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		LinkedList<String> lst = new LinkedList<>();
		lst.add("Tesla");
		lst.add("Apache");
		lst.addFirst("Apple");

		v.addAll(lst);
		System.out.println("-- Iterating over updated vector using for each");
		for (String elem : v)
			System.out.println(elem);
		// converting vector into set

		HashSet<String> set = new HashSet<>(v);
		System.out.println("-- Iterating over Hashset using for each");
		for (String elem : set)
			System.out.println(elem);

		TreeSet<String> tree = new TreeSet<>(set);
		System.out.println("-- Iterating over Treeset using for each");
		for (String elem : tree)
			System.out.println(elem);

		TreeSet<String> tree1 = new TreeSet<>(set);
		System.out.println("-- Iterating over Treeset using for each in reverse order");
		for (String elem : tree1.descendingSet())
			System.out.println(elem);

		// new way to iterate from java 8

		System.out.println("-- Iterating over Treeset using Java 8 forEach()");
		tree.forEach(System.out::println);
		
		
		String[] week = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		List<String> days = Arrays.asList(week);
		days.forEach(System.out::println);
		

	}
}
