package chapter04;

import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

/**
 * 基本データ型の関数型インタフェース
 * */
public class Sample02 {
	public static void main(String[] args){
		// 引数として基本データ型を受け取る関数型インタフェース
		IntFunction<String[]> intFunction = i -> {return new String[i]; };
		IntConsumer intConsumer = System.out::println;
		IntPredicate intpredicate = i -> i > 10;
		IntSupplier intSupplier = () -> 1;
		IntUnaryOperator intUnaryOperator = i -> i * 10;
		IntBinaryOperator intBinaryOperator = (i, j) -> i * j;

		// 基本データ型を返す関数型インタフェース
		ToIntFunction<String> toIntFunction  = str -> str.length();
		ToIntBiFunction<String, String> toIntBiFunction = (s1, s2) -> s1.length() + s2.length();
		IntToDoubleFunction intToDoubleFunction = i -> i + Math.random();

	}
}
