package com.tips.nonaccessModifiers.constants;

/*example of Public static final  value;
static means class level variable , final means cannot change in other words if I need constant values we use static final value. Usually we it static final variables in all UPPER CASE
Ex :  Interger.MIN_VALUE  which are denifed as constants in Integer class ,so we cannot change
       Interger.MAX_VALUE

Integer class Java defined as final means we cannot extend and override it's methods
*/
public class TimesRunner {

	public static final int SECONDS_IN_MINUTE = 60;
	public static final int MINUTES_IN_HOUR = 60;
	public static final int HOURS_IN_DAY = 24;
	public static final int SECONDS_IN_DAY = SECONDS_IN_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY;

	// We can use these constants anywhere in other programes like
//	TimesRunner.SECONDS_IN_MINUTE
	
	
	public static void main(String[] args) {
		//System.out.println(-2147483648);
//		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(SECONDS_IN_DAY);

	}

}
