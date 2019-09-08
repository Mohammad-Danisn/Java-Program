

package com.ritroorkee;

public class Main {

	public static void main(String[] args) {
		//4*7-8+9-2+21
//		System.out.println("XYZ");
		
//		String str = "asdfghj";
//		str.substring(2);
//		System.out.println(str);

		
//		String str = "asdfghj";
//		String x = str.substring(2);
//		System.out.println(str);

//		Employee e = new Employee();
//		e = new Manager(); 
//		e = new Programmer();
//		e = new Secretary();
//		e = new Employee();
//		
		
		
		
//		double d = 10.34;
//		System.out.println(d);
//		int i = (int)d;
//		System.out.println(i);
//		d = (double)i;
//		System.out.println(d);
		
		
		Employee e = new Manager();
		e.doWork();
		e = new Secretary();
		e.doWork();
		
	}

}