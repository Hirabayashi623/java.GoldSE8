package chapter08;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import master.Master;

public class Sample01 extends Master{
	public static void main(String[] args){
		File file1 = new File("file");

		out("getName");
		show(file1.getName());

		out("isDirectory");
		show(file1.isDirectory());

		out("isFile");
		show(file1.isFile());

		out("getAbsolutePath");
		show(file1.getAbsolutePath());

		out("listFile");
		Arrays.asList(file1.listFiles()).forEach(Master::show);

		printAllFileList(file1);

		File file2 = new File("file/sample01");
		file2.mkdir();

		File file3 = new File("file/sample01/sample01.txt");
		try {
			file3.createNewFile();
		} catch (IOException e) {	e.printStackTrace();}

		File file4 = new File("file/sample01/A/B/C");
		file4.mkdirs();
		printAllFileList(file1);

		File file5 = new File(file2, "sample02.txt");
		file3.renameTo(file5);
		printAllFileList(file1);

		out("getParentFile");
		show(file5.getParentFile());

		show("getParent", 	file5.getParent());
		show("getPath",		file5.getPath());
		show("toString", 	file5.toString());
		show("toURI", 		file5.toURI());

		deleteAll(file2);

		printAllFileList(file1);

		title("システム依存のセパレータ");

		out("System.getProperties");
		System.getProperties().forEach(((key, value) -> System.out.println("Key: " + key.toString() + ", Value: " + value.toString())));

	}



	public static int counter = 0;

	public static void printAllFileList(File file){
		if(counter==0){
			out("fileTree ----------------");
		}

		counter++;

		String[] fileNames = file.list();

		for(String fileName: fileNames){
			File f = new File(file, fileName);
			show(f);
			if(f.isDirectory()){
				printAllFileList(f);
			}
		}

		counter--;
	}

	public static void deleteAll(File file){
		if(counter==0){
			out("※※※   delete all files   ※※※");
		}

		counter++;

		String[] fileNames = file.list();

		for(String fileName: fileNames){
			File f = new File(file, fileName);
			if(f.isDirectory()){
				deleteAll(f);
			}else{
				f.delete();
			}
		}

		file.delete();

		counter--;
	}
}
