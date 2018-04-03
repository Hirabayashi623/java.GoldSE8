package chapter05;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Collectorsクラスの実装
 * Streamクラスの終端操作collect実装のため
 * */
public class Sample05 {
	public static void main(String[] args){
		out("toList");
		show(Stream.of("A","B","C").collect(Collectors.toList()));

		out("joining");
		show(Stream.of("A","B","C").collect(Collectors.joining(" | ")));

		out("summingInt");
		show(Stream.of("A","B","C").collect(Collectors.summingInt(s -> s.length())));

		out("averageInt");
		show(Stream.of("1","3","5").collect(Collectors.averagingInt(str -> Integer.parseInt(str))));

		out("toSet");
		show(Stream.of("A","B","C").collect(Collectors.toSet()));

		out("toMap");
		show(Stream.of("a","b","c").collect(Collectors.toMap(s -> s, s -> s.toUpperCase())));
		show(Stream.of("a","b","c").collect(Collectors.toMap(s -> s.length(), s -> s.toUpperCase(), (s1, s2) -> s1 + ":" + s2)));
		show(Stream.of("a","b","c").collect(Collectors.toMap(s -> s.length(), s -> s.toUpperCase(), (s1, s2) -> s1 + ":" + s2, TreeMap::new)));

		out("groupingBy");
		show(Stream.of("bell","akko","ami","bob","nao").collect(Collectors.groupingBy(s -> s.charAt(0))));
		show(Stream.of("bell","akko","ami","bob","nao").collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.toSet())));
		show(Stream.of("bell","akko","ami","bob","nao").collect(Collectors.groupingBy(s -> s.charAt(0), TreeMap::new,Collectors.joining("|"))));

		out("partitioningBy");
		show(Stream.of(1,2,3,4,5).collect(Collectors.partitioningBy(i -> i > 3)));
		show(Stream.of(1,2,3,4,5).collect(Collectors.partitioningBy(i -> i > 3, Collectors.summingInt(n -> n))));

		out("mapping");
		show(Stream.of("a","b","c").collect(Collectors.mapping(String::toUpperCase, Collectors.joining(", "))));

		out("minBy");
		show(Stream.of(1,2,3).collect(Collectors.minBy(Comparator.naturalOrder())));

		out("maxBy");
		show(Stream.of(1,2,3).collect(Collectors.maxBy(Comparator.reverseOrder())));




	}

	private static void out(String str){
		System.out.println("-- " + str);
	}

	private static void show(Object obj){
		System.out.println("【"+ obj.getClass() +"】" + obj.toString());
	}
}
