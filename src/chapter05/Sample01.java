package chapter05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Streamの生成
 * */
public class Sample01 {
	public static void main(String[] args){
		Consumer<Object> consumer = System.out::println;
		IntConsumer intConsumer = System.out::println;

		out("Collectionインタフェース提供");
		List<String> words = Arrays.asList("A","B","C");
		words.stream().forEach(consumer);

		out("Arrays提供 配列→ストリーム");
		Arrays.stream(new String[]{"A","B","C"}).forEach(consumer);

		out("Arrays提供 int配列→ストリーム");
		Arrays.stream(new int[]{1,2,3}).forEach(intConsumer);

		out("Stream提供 単一要素→ストリーム");
		Stream.of("ONE").forEach(consumer);

		out("Stream提供 指定された要素→ストリーム");
		Stream.of("A", "B", "C").forEach(consumer);

		out("Stream提供 空のストリーム");
		Stream.empty().forEach(consumer);

//		out("Stream提供 Supplierで生成される要素→ストリーム");
//		Stream.generate(() -> "A").forEach(consumer);

		out("IntStream提供 開始と終了までの数値のストリーム");
		IntStream.range(5,10).forEach(intConsumer);

		out("IntStream提供 開始と終了までの数値のストリーム");
		IntStream.rangeClosed(5,10).forEach(intConsumer);
	}

	private static void out(String str){
		System.out.println("--" + str);
	}
}
