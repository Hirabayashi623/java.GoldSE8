package chapter04;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Sample01 {
	public static void main(String[] args){
		List<String> list = null;

		System.out.println("--匿名クラスで実装");
		list = Arrays.asList("Tanaka", "Sato");
		list.replaceAll(new UnaryOperator<String>(){
			@Override
			public String apply(String t) {
				return t.toUpperCase();
			}
		});
		list.forEach(System.out::println);

		System.out.println("--ラムダ式で実装");
		list = Arrays.asList("Tanaka", "Sato");
		list.replaceAll( (String s) -> {return s.toUpperCase(); });
		list.forEach(System.out::println);

		System.out.println("--ラムダ式で実装(省略あり)");
		list = Arrays.asList("Tanaka", "Sato");
		list.replaceAll( s -> s.toUpperCase());
		list.forEach(System.out::println);
	}
}
