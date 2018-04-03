package chapter03;

import java.util.TreeSet;
/**
 * Comparableインタフェースの実装
 * 順序付けができるTreeSetなどでは、
 * Cpmparableインタフェースが実装されている必要がある。
 * 実装されていないと「ClassCastException」
 * */
public class Sample07 {
	public static void main(String[] args){
		TreeSet<MyComparable> set = new TreeSet<>();
		set.add(new MyComparable(1,2));
		set.add(new MyComparable(5,6));
		set.add(new MyComparable(3,4));
		set.add(new MyComparable(2,3));
		set.forEach(System.out::println);
	}
}

class MyComparable implements Comparable<MyComparable>{
	public int a;
	public int b;

	public MyComparable(int a, int b){
		this.a = a;
		this.b = b;
	}

	@Override
	public int compareTo(MyComparable c) {
		return this.a * this.b - c.a * c.b;
	}

	public String toString(){
		return "[" + a + "," + b + "]";
	}

}
