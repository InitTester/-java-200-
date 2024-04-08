package java200;

public class Q004 {
	/* 화씨 -> 섭씨
	 * 5/9*(fahrenheit-32)
	 *  변경
	 * */
	public static void main(String[] args) {
		long days = System.currentTimeMillis();
		int day=(int)(days/1000/24/60/60);
		
		System.out.println(toCelsius(4.9));
		System.out.println("day = " + day);
		
	}
	
	public static double toCelsius(double fahrenheit) {
		return 5.0/9 *(fahrenheit-32);
	}

}
