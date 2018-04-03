package chapter03;

import java.util.Arrays;

/**
 * Arraysクラスの実装
 * */
public class Sample10 {
	public static void main(String[] args){
		System.out.println("--列挙→リスト");
		Arrays.asList(1,2,3,4,5).forEach(System.out::println);

		System.out.println("--配列の要素埋め");
		int[] n = new int[3];
		Arrays.fill(n, 123);
		Arrays.stream(n).forEach(System.out::println);

		System.out.println("--要素間の操作（累積）");
		n = new int[]{1,2,3,4,5};
		Arrays.parallelPrefix(n, (a,b) -> a + b);
		Arrays.stream(n).forEach(System.out::println);

		System.out.println("--自然順序ソート");
		Integer[] num = new Integer[]{11,12,13,14};
		Arrays.sort(num);
		Arrays.stream(num).forEach(System.out::println);

		System.out.println("--ソート（アルゴリズム指定）");
		num = new Integer[]{11,12,13,14};
		Arrays.sort(num, (a,b) -> a%4 - b%4);
		Arrays.stream(num).forEach(System.out::println);
	}
}
