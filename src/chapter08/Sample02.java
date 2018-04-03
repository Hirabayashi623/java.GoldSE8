package chapter08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import master.Master;

public class Sample02 extends Master{
	public static void main(String[] args){

		try(
			FileInputStream fis = new FileInputStream(new File("file/chapter08/sample02/sample.txt"));
			FileOutputStream fos = new FileOutputStream("file/chapter08/sample02/sample.txt", true);	//追記
//			FileOutputStream fos = new FileOutputStream("file/chapter08/sample02/sample.txt", false);	//上書き
			) {

			show("fos.toString", fos);
			show("fis.toString", fis);

			out("ファイルへの書込み");
			fos.write(0);
			fos.write("sample".getBytes());
			fos.write(9_999);

			out("ファイルからの読込み");
			int data = 0;
			while((data = fis.read()) != -1){
				System.out.print(data + " ");
			}

			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
