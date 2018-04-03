package chapter05;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * ストリームの終端操作
 * */
public class Sample02 {
	private static Stream<Integer> stream = null;

	public static void main(String[] args){
		clear();

		out("allMatch");
		System.out.println(stream.allMatch(i -> i < 5));

		clear();

		out("anyMatch");
		System.out.println(stream.anyMatch(i -> i == 3));

		clear();

		out("noneMatch");
		System.out.println(stream.noneMatch(i -> i == 0));

		clear();

		out("collect");
		System.out.println(stream.collect(Collectors.toList()));

		clear();

		out("count");
		System.out.println(stream.count());

		clear();

		out("findAny");
		System.out.println(stream.findAny());

		clear();

		out("findFirst");
		System.out.println(stream.findFirst());

		clear();

		out("forEach");
		stream.forEach(System.out::println);

		clear();

		out("min");
		System.out.println(stream.min(new Comparator<Integer>(){
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		}));

		clear();

		out("max");
		System.out.println(stream.max(new Comparator<Integer>(){
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		}));

		clear();

		out("reduce");
		System.out.println(stream.reduce(0, (m,n) -> m + n));

		clear();

		out("toArray");
		System.out.println(stream.toArray());

	}

	private static void out(String str){
		System.out.println();
//		System.out.println("##################################");
		System.out.println("-- " + str);
//		System.out.println("##################################");
	}

	private static void clear(){
		stream = Arrays.stream(new Integer[]{1,2,3});
	}
}
