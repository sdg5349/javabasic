package b_operator;

public class Ex07_이진논리 {
	
	public static void main(String[] args) {
	/*
	  [논리연산자](이진=bit)
		 A스위치, B스위치       A & B(and)    A | B(or)    A ^ B(xor=exclusive or)
		 0       0             0             0            0
		 0       1             0             1            1
		 1       0             0             1            1
		 1       1             1             1            0
	 */
		 int a = 15;  // 00000000 00000000 00000000 00001111
		 int b = 10;  // 00000000 00000000 00000000 00001010 
		 
		 int and = a & b; // 000000000 000000000 000000000 00001010 -> and 연산자
		 System.out.println("and =" + and);
		 int or = a | b; // 00000000 000000000 00000000 00001111 -> or 연산자
		 System.out.println("or =" + or);
		 int xor = a ^ b; // 00000000 000000000 00000000 00000101 -> xor 연산자
		 System.out.println("xor =" + xor);
	}

}
