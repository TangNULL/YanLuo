package program7;

import java.io.File;

import program2.Program2;

public class LocP7 {
	public static void main(String[] args){
		Program2 p2=new Program2();
		File file=new File("E:\\workspace\\programPSP\\src\\program7\\p7txt");
		System.out.println(p2.printP2(file));
	}
}
