package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.plaf.metal.MetalIconFactory.FileIcon16;

public class Ex03_Throws {

	 public static void main(String[] args) {
		 try {
			 readFile();
			 System.out.println("파일처리성공");
		 }catch(Exception ex) {
			 System.out.println("예외발생: " + ex.getMessage());
			 //ex.printStackTrace();
		 }			
	}
	static void readFile() throws Exception{
//		try {
//			FileInputStream fis = new FileInputStream("happy.txt");
//			// new FileInputStream() 얘가 예외를 발생시킨다 - 파일이 없음
//		} catch (FileNotFoundException e) {
//			//e.printStackTrace();
//		}
		FileInputStream fis = null;
		try {
		 fis = new FileInputStream("happy.txt");
		}finally {
			fis.close();
		}
	}
}
