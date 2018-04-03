/*
 * イニシャライザの使用方法
 *
 * */
package chapter01.seq04_initializa;

public class Sample {
	private static String str_class;
	private String str_instance;
	// スタティックイニシャライザ
	static{
		str_class = "class";
	}
	// インスタンスイニシャライザ
	{
		str_instance = "instance";
	}
	public static String getStrClass(){
		return str_class;
	}
	public String getStrInstance(){
		return str_instance;
	}

	public static void main(String[] args){
		Sample obj = new Sample();
		System.out.println(obj.getStrInstance());
		System.out.println(Sample.getStrClass());
	}
}
