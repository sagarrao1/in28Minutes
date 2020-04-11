package com.in28Minutes.exceptionhandling;

class Amount{
	// Ideally we should have use enum for currency
	// Bigdecimal for amount, to keep it simple we are using this
	private String currency;
	private int amount;
	
	
	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amount that) {
		// lets say we do not have currency converter in this code , it's a future implementation and 
		// we want to throw an error when calling class uses different currency of 2 classes and trying to add
		
		if (!this.currency.equals(that.currency)) { //another way (this.currency !=that.currency) 
			throw new RuntimeException("Currenies did not match "+ this.currency +":"+that.currency);
			// if we use new Exception, then it is checked exception check anotherAdd() method
		}
		this.amount= this.amount+that.amount;
	}

	public void anotherAdd(Amount that) throws CurrenciesDoNotMatchException {
		// lets say we do not have currency converter in this code , it's a future implementation and 
		// we want to throw an error when calling class uses different currency of 2 classes and trying to add
		
		if (!this.currency.equals(that.currency)) { //another way (this.currency !=that.currency) 
//			throw new Exception("Currenies did not match "+ this.currency +":"+that.currency);
			throw new CurrenciesDoNotMatchException("Currenies did not match "+ this.currency +":"+that.currency);
		}
		this.amount= this.amount+that.amount;
	}

	@Override
	public String toString() {
		return "Amount [currency=" + currency + ", amount=" + amount + "]";
	}
		
}

class CurrenciesDoNotMatchException extends Exception{
	public CurrenciesDoNotMatchException(String str) {
		super(str);
	}
}
public class ThrowingExceptionRunner {

	public static void main(String[] args) {
		Amount amount1 = new Amount("USD", 10);
//		Amount amount2 = new Amount("USD", 20);
		Amount amount2 = new Amount("INR", 20);
		
		// if we using add method, which has runtime exception is unchecked exception , no need to catch that		
//		amount1.add(amount2);
		
//		if we are using anotherAdd method, which has checked exception,calling method either has to either handle it or throw it
//		code will not compile without that
		try {
			amount1.anotherAdd(amount2);
		} catch (CurrenciesDoNotMatchException e) {
			System.out.println("Got CurrenciesDoNotMatchException");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Got exception while using anotherAdd method amount");
			e.printStackTrace();
		}
		System.out.println(amount1);

	}

}
