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
 *   1.객체를 생성하면서 멤버변수에 값을 넣고 싶을 때 생성자를 사용 
 *   2.생성자는 new 키워드에 의해서만 호출되는 메서드
 *   3.생성자는 메서드 
 *   4.return이 없는 void 메서드(생략)
 *   5.생성자는 클래스와 이름이 같아야 하고 생성자가 선언되어 있지 않으면 기본(디폴트, new 클래스명()) 1개가 자동 생성된다.  
 *   
 * */

/* - 생성자 오버로딩
 * 	메서드 이름은 같고 매개변수 타입이 혹은 개수가 다르게 정의한것을 오버로딩이라고 한다.\
 * - 데이터 저장과 처리
 * 	전달객체(VO,DTO)
 * 	유동성 인자
 *  객체 배열
 *  향상된 for
 * */
