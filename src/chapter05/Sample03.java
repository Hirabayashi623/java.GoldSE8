package chapter05;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Optionalクラスの実装
 * 実態は値を一つもつSetのようなもの
 * 値がNullの場合のエラーハンドリングがいらなくなる
 * */
public class Sample03 {
	public static void main(String[] args){
		// 空のOptionalを取得
		Optional<Integer> o1 = Optional.empty();
		// 非Nullの値を持つOptionalを取得
		Optional<Integer> o2 = Optional.of(new Integer(1));

		out("get(空のOptional)");
		try{
			System.out.println(o1.get());
		}catch(NoSuchElementException e){
			e.printStackTrace();
		}

		out("get(非NullのOptional)");
		System.out.println(o2.get());

		out("isPresent");
		System.out.println("o1: " + o1.isPresent());
		System.out.println("o2: " + o2.isPresent());

		out("ifPresent");
		o1.ifPresent(System.out::println);
		o2.ifPresent(System.out::println);

		out("orElse");
		System.out.println(o1.orElse(new Integer(9)));
		System.out.println(o2.orElse(new Integer(9)));

		out("orElseGet");
		System.out.println(o1.orElseGet(() -> new Integer(9)));
		System.out.println(o2.orElseGet(() -> new Integer(9)));

		out("orElseThrow");
		try {
			System.out.println(o1.orElseThrow(() -> new IOException("my exception")));
			System.out.println(o2.orElseThrow(() -> new IOException("my exception")));
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

	private static void out(String str){
		System.out.println();
		System.out.println("-- " + str);
	}
}
