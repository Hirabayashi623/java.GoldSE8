package chapter05;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
/**
 * Streamの中間操作の実装
 * */
public class Sample04 {
	public static void main(String[] args){
		out("filter");
		Stream.of("A", "BB", "CCC")
				.filter(str -> str.length() < 3)
				.forEach(System.out::println);

		out("distinct");
		Stream.of("A", "A", "B", "C", "C", "C")
				.distinct()
				.forEach(System.out::println);

		out("limit, skip");
		IntStream.iterate(0, n -> n + 1)
				.skip(100L)
				.limit(5L)
				.forEach(System.out::println);

		out("map");
		Stream.of("a", "b", "c")
				.map(s -> s.toUpperCase())
				.forEach(System.out::println);

		out("flatMap");
		Arrays.asList(Arrays.asList(new Integer(10)),
						Arrays.asList(new Integer(20), new Integer(30)),
						Arrays.asList(new Integer(40), new Integer(50), new Integer(60)))
				.stream()
				.map(list -> list.stream())
				.forEach(list -> list.forEach(System.out::print));
		System.out.println();
		Arrays.asList(Arrays.asList(new Integer(10)),
						Arrays.asList(new Integer(20), new Integer(30)),
						Arrays.asList(new Integer(40), new Integer(50), new Integer(60)))
				.stream()
				.flatMap(list -> list.stream())
				.forEach(System.out::print);
		System.out.println();

		out("sorted");
		Stream.of(2,3,1)
			.sorted()
			.forEach(System.out::println);

		out("peek");
		Stream.of("a", "b", "c")
			.peek(str -> System.out.print("マップ前: " + str + " -> "))	// デバックとして使える
			.map(s -> s.toUpperCase())
			.forEach(str -> System.out.println("マップ後: " + str));
	}

	private static void out(String str){
		System.out.println("-- " + str);
	}
}
