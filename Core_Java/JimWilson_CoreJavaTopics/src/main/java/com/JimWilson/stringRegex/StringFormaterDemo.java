package com.JimWilson.stringRegex;

public class StringFormaterDemo {

	public static void main(String[] args) {
		
		int david=13, ram=11, lucky=8, chotu=2;
		
		// regular way of formmating string
		String format1= "My nefews are "+david+ ", "+ram+", "+lucky+" and "+chotu + " years old";
		System.out.println(format1);
		
		String format2=String.format("My nefews are %d, %d, %d and %d years old", david,ram,lucky,chotu);
		System.out.println(format2);
		
		double avgDiff = ((david-ram) + (ram-lucky) + (lucky-chotu))/ 3.0d;
//		System.out.println(avgDiff);
		
		String s3= "Avergae age diff between each is "+avgDiff+" years";
		System.out.println(s3);		
		String f3= String.format("Avergae age diff between each is %.1f years", avgDiff );
		System.out.println(f3);
		
		
//		display octal , hexa values
		System.out.println(String.format("%d", 32)); //decimal
		System.out.println(String.format("%o", 32)); // octal
		System.out.println(String.format("%x", 32));  // hexa
		
//		will flag( #)
		System.out.println(String.format("%#o", 32)); // octal
		System.out.println(String.format("%#x", 32));  // hexa
		
		System.out.println(String.format("Y:%d Z:%d", 5, 231));
		System.out.println(String.format("Y:%d Z:%d", 345, 231));
		
		System.out.println(String.format("Y:%04d Z:%04d", 5, 231));
		System.out.println(String.format("Y:%04d Z:%04d", 345, 231));
		
		System.out.println(String.format("Y:%-4d Z:%-4d", 5, 231));
		System.out.println(String.format("Y:%-4d Z:%-4d", 345, 231));
		
		
		System.out.println(String.format("%,d",1234567));
		System.out.println(String.format("%,.2f",1234567.0));
		
		
//		flags : space, + and (
		System.out.println("======flags : space, + and (=======");
		System.out.println(String.format("% d",123));
		System.out.println(String.format("% d",-456));
		
		System.out.println(String.format("%+d",123));
		System.out.println(String.format("%+d",-456));
		
		System.out.println(String.format("%(d",123));
		System.out.println(String.format("%(d",-456));
		
		System.out.println(String.format("% (d",123));
		System.out.println(String.format("% (d",-456));
	}

}
