package com.tips.nonaccessModifiers.constants;

/*example of Public static final  value;
static means class level variable , final means cannot change in other words if I need constant values we use static final value. Usually we it static final variables in all UPPER CASE
Ex :  Interger.MIN_VALUE  which are denifed as constants in Integer class ,so we cannot change
       Interger.MAX_VALUE

Integer class Java defined as final means we cannot extend and override it's methods
*/
public class TimesRunner2 {

	
	public static void main(String[] args) {
		System.out.println("SECONDS_IN_MINUTE : "+TimesRunner.SECONDS_IN_MINUTE);

	}

}
