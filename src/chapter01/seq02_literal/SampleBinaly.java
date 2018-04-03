package chapter01.seq02_literal;

public class SampleBinaly {
	public static void main(String[] args){
		int val1 = 26;   		//10進数
		int val2 = 032;		//8進数
		int val3 = 0x1a;		//16進数
		int val4 = 0b11010;	//2進数
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
		System.out.println(val1 + val4);
	}
}
