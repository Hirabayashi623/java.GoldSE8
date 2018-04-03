package chapter03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sample08 {
	public static void main(String[] args){
		ArrayList<Kaiin> list = new ArrayList<>();
		list.add(new Kaiin(3, "ryo"));
		list.add(new Kaiin(2, "emi"));
		list.add(new Kaiin(1, "lue"));
		System.out.println("インデックス順");
		list.forEach(System.out::println);
		System.out.println("ソート実施");
//		Collections.sort(list, new MyRule());
		Collections.sort(list, (a,b) -> a.id - b.id);
		list.forEach(System.out::println);
	}
}

class Kaiin{
	public String name;
	public int id;

	public Kaiin(int id, String name){
		this.id = id;
		this.name = name;
	}
	public String toString(){
		return this.id + ": " +  this.name;
	}
}

class MyRule implements Comparator<Kaiin>{
	@Override
	public int compare(Kaiin o1, Kaiin o2) {
		return o1.id - o2.id;
	}
}
