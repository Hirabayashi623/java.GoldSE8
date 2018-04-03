package chapter03;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Setインタフェースの実装
 * */
public class Sample02 {
	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(1);		hashSet.add(3);
		hashSet.add(2);		hashSet.add(1);
		hashSet.forEach(System.out::print);

		System.out.println();

		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(1);		treeSet.add(3);
		treeSet.add(2);		treeSet.add(1);
		treeSet.forEach(System.out::print);

		System.out.println();

	}
}
