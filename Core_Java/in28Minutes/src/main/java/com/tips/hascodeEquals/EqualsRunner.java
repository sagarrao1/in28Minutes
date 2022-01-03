package com.tips.hascodeEquals;

class Client{
	private int id;

	public Client(int id) {
		super();
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object that) {
		if (this == that)
			return true;
		if (that == null)
			return false;
		if (getClass() != that.getClass())
			return false;
		Client other = (Client) that;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}

public class EqualsRunner {

	public static void main(String[] args) {
		Client c1= new Client(1);
		Client c2= new Client(1);
		Client c3= new Client(3);
		
		//System.out.println("c1 ==c2 : "+c1.equals(c2));
		/* try to run the code in debug mode. you will understand better
		 * checks if both c1 andc2 pointing to same object it returns false because
		 * they are different this is the default implementation of Objects Equals and
		 * hash code logic
		 */
		
		//System.out.println("c1 ==c1 : "+c1.equals(c1));
		System.out.println(c1.getClass());
		System.out.println(c2.getClass());
		System.out.println(c3.getClass());
		System.out.println("c1 ==c2 : "+c1.equals(c2));
		System.out.println("c1 ==c3 : "+c1.equals(c3));
		/* Now it is comparing the id is equal or not of both objects 
		 * if 2 objects are equal , it should have same hash code id for both
		 * */
		
	}

}
