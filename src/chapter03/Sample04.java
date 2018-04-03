package chapter03;

import java.util.HashMap;
import java.util.Map;

/**
 * Mapインタフェースの実装
 * */
public class Sample04 {
	public static void main(String[] args) {
		Map<Integer,Integer> hashMap = new HashMap<>();
		hashMap.put(1,1); hashMap.put(2,2);

		// マップに該当のキーが存在するかチェック
		System.out.println(hashMap.containsKey(1));

		// マップに該当の値が存在するかチェック
		System.out.println(hashMap.containsValue(1));

		System.out.println(hashMap.get(1));

		// キー項目をSet形式で取得
		System.out.println(hashMap.keySet());

		// 要素それぞれに対して処理を行う
		hashMap.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));

		// 要素を取得。存在しない要素の場合は第2引数の要素を返却
		System.out.println(hashMap.getOrDefault(3, 999));

		// 重複するキーが存在した場合に、値を指定した関数で捜査して置き換える
		hashMap.merge(1, 3, (n1, n2) -> n1 + n2);

		Map<Integer,Integer> hashMapSub = new HashMap<>();
		hashMapSub.put(3,3); hashMapSub.put(4,4);

		hashMap.putAll(hashMapSub);
		// 要素それぞれに対して処理を行う
		hashMap.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));

		// すべての要素を指定した関数で置換
		hashMap.replaceAll((key, value) -> key * value);
		System.out.println(hashMap);

		hashMap.compute(2, (key, value) -> key * value);
		System.out.println(hashMap);


	}
}
