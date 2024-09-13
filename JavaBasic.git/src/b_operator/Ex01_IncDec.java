package b_operator;

public class Ex01_IncDec {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		
		System.out.println("A=" + a + ", B=" + b);
		System.out.println("A=" + a+1 + ", B=" + b+1);
		                  //A=51(문자열로 더해짐)
		System.out.println("A=" + (a+1) + ", B=" + (b+1));		
		
		a = a + 1; 
        b = b + 1;
        System.out.println("A=" + a + ", B=" + b);
        // a, b 변수를 미리 정리해서 풀어주는 것이 낫다
        //똑같은 코딩인데 늘리거나 줄여서 쓴 것 -> 증가감소 연산자
        a++; // a = a + 1; // ++a
        b--; // b = b - 1; // --b
        System.out.println("A=" + a + ", B=" + b);
        //---------------------------------------------------
        
        int z = 10 , y = 10;
        int result = ++z; // z=z+1; int result = z;
        System.out.println(result);
        
        int result2 = y++; // int result = y; y=y+1
        System.out.println(result2);//y는 11이지만 변수에 넣은 y는 10
        System.out.println(y); //y는 11
        System.out.println("Z=" + z + ", Y=" + y);//Z=11, Y=11 
        
        System.out.println("Z=" + ++z + ", Y=" + --y);//Z=12, Y=10
        System.out.println("Z=" + z++ + ", Y=" + y--);//Z=12, Y=10
        System.out.println(z + " " + y);
		
	}

}
