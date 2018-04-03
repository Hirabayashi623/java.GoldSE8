package chapter03;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Sample06 {
	public static void main(String[] args){
		// 順序付けなし
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(10); hashSet.add(1000);	hashSet.add(100);
		System.out.println(hashSet);

		// 順序づけあり
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(10); treeSet.add(1000); treeSet.add(100);
		System.out.println(treeSet);

		TreeMap<Integer, Integer> treeMap = new TreeMap<>();
		treeMap.put(1,10);	treeMap.put(3,1000); treeMap.put(2, 100);
		System.out.println(treeMap);
	}
}
