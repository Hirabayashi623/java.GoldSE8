package chapter03;

import java.util.ArrayList;
import java.util.Collections;
/**
 * Collectionsクラスの実装
 * */
public class Sample09 {
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2); list.add(3); list.add(1);

		System.out.println("--全要素の置き換え");
		Collections.fill(list, 9);
		list.forEach(System.out::println);

		list.clear(); list.add(2); list.add(3); list.add(1);

		System.out.println("--第2引数に一致する要素を第3引数で置換");
		Collections.replaceAll(list, 2, 9);
		list.forEach(System.out::println);

		list.clear(); list.add(2); list.add(3); list.add(1);

		System.out.println("--要素の逆順並び替え");
		Collections.reverse(list);
		list.forEach(System.out::println);

		list.clear(); list.add(2); list.add(3); list.add(1);

		System.out.println("--要素のソート。逆順Comparatorを取得");
		Collections.sort(list, Collections.reverseOrder());
		list.forEach(System.out::println);

		list.clear(); list.add(2); list.add(3); list.add(1);

		System.out.println("--要素のズラし");
		Collections.rotate(list, 2);
		list.forEach(System.out::println);

		list.clear(); list.add(2); list.add(3); list.add(1);

		System.out.println("--シャッフル");
		Collections.shuffle(list);
		list.forEach(System.out::println);
	}
}
