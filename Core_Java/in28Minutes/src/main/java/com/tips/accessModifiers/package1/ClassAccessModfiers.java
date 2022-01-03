package com.tips.accessModifiers.package1;

//public , private, protected, (default)

/*the movement you remove public from class this class is
 not accessible from outside of package or from another package
 you can not use protected and private for classes.
 they are for method and member variables
 if you are specifying anything for class below it is default
 default is package level. it is accessible from it's package 
*/
public class ClassAccessModfiers {

	public static void main(String[] args) {
		ClassAccessModfiers c= new ClassAccessModfiers();

	}
	
}

// we are not specifying any keyword before class means default
// accessible with or sub packages of this package
class Client{
	private int id;

	public Client(int id) {
		super();
		this.id = id;
	}	
	
}
