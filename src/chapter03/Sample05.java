package chapter03;

/**
 * ジェネリクスを用いた独自クラスの定義
 **/
public class Sample05 {
	public static void main(String[] args){
		My<String> my = new My<String>();

		my.set("Hello");
		System.out.println(my.get());

		// 引数を見ることで型を特定できる
		my.print(new Integer(12));


	}
}

class My<T>{
	private T my = null;

	public My() {
	}

	public My(T t){
		this.my = t;
	}

	public void set(T t){
		this.my = t;
	}

	public T get(){
		return this.my;
	}

	public <A extends Number> void print(A a){
		System.out.println(a);
	}
}
