package chapter03;

import java.util.ArrayList;

public class Sample01 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		//要素の追加
		list.add(new Integer(8));
		list.add(1);
		list.add(1, 3);

		//各要素に対して処理を行う
		list.forEach(System.out::println);

		// 	引数のリストをすべて格納する
		list.addAll(list);
		list.forEach(i -> System.out.println(i));

		// リストを空にする
		list.clear();
		list.forEach(System.out::println);

		list.add(1);
		list.add(2);

		// 引数のオブジェクトがリストに含まれているか判定
		System.out.println(list.contains(1));

		// 引数のリストの要素がすべて含まれているか判定
		System.out.println(list.containsAll(list));

		// 引数で指定した要素数を最低限確保する
		list.ensureCapacity(10);

		// 引数で指定した要素番号のオブジェクトを取得する
		System.out.println(list.get(0));

		System.out.println(list.getClass());

		// 引数で指定したオブジェクトが格納されている要素番号を取得
		System.out.println(list.indexOf(1));

		System.out.println(list.isEmpty());

		// 引数で指定した要素番号の要素を削除
		list.remove(1);
		list.forEach(System.out::println);

		list.add(3);
		// 指定したオブジェクトをリストから削除する
		list.remove(new Integer(1));
		list.forEach(i -> System.out.println(i));

		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		// 条件を満たす要素を削除する
		list.removeIf(i -> i > 10);
		list.forEach(System.out::println);

		list.trimToSize();

	}
}
