package Q_007;

public class GeoMain {
	public static void main(String[] args) {
//		Geo geo1 = new Geo();  // 객체생성, Geo 클래스를 메모리에 올려서 사용하려면 new 키워드를 이용한다.
//		geo1.lattitude = 37.52127220511242;
//		geo1.longitude = 127.0074462890625;
//		
//		System.out.printf("위도:%f, 경도:%f\n",geo1.lattitude,geo1.longitude, args);
//		
//		Geo geo2 = geo1;
//		
//		System.out.printf("위도:%f, 경도:%f\n",geo2.lattitude,geo2.longitude, args);
		
		/* 멤버변수를 보호하기 위한 private 멤버변수 선언과 public 메서드를 만들어 사용하는 방법을 은닉화
		   (중요한 멤버변수 숨기기)라고 한다.
		*/
//		Geo geo1 = new Geo();
//		geo1.setLattitude(37.52127220511242);
//		geo1.setLongitude(127.0074462890625);
//		
//		System.out.printf("위도:%f, 경도:%f\n",geo1.getLattitude(),geo1.getLongitude());
//		
//		Geo geo2 = geo1;
//		System.out.printf("위도:%f, 경도:%f\n",geo2.getLattitude(),geo2.getLongitude());
		
//		Geo geo1 = new Geo(); // 기본생성자가 없어서 new Geo() 호출 할 수 없다.
		Geo geo1 = new Geo(37.52127220511242,127.0074462890625); // 인자가 2개인 생성자

		System.out.printf("위도:%f, 경도:%f\n",geo1.getLattitude(),geo1.getLongitude());
		
		Geo geo2 = geo1;
		System.out.printf("위도:%f, 경도:%f\n",geo2.getLattitude(),geo2.getLongitude());
	}
}

/*
 * - 레퍼런스 this(자신의 주소를 참조하는 레퍼런스)
 *   멤버(멤버변수, 멤버메서드)를 의미
 * - 생성자
 *   객체를 생성하면서 멤버변수에 값을 넣고 싶을 때 생성자를 사용  
 * */
