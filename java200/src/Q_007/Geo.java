package Q_007;

public class Geo { // 클래스 선언(설계도)
//	public double lattitude = 0.0;
//	public double longitude = 0.0;
	// 은닉화와 접근제한자
	// private 사용으로 인해 외부에 노출되지 않는다.
	private double lattitude = 0.0; // 위도
	private double longitude = 0.0; // 경도

//	// 기본생성자
//	public Geo() {
//		// TODO Auto-generated constructor stub
//	}
//	
	// 인자가 2개인 생성자 
	public Geo(double lattitude, double longitude) { // 생성자 선언 -> 기본 생성자가 만들어지지 않는다.(없을시 자동생성)
		// TODO Auto-generated constructor stub
		this.lattitude = lattitude; // 생성되면서 위도,경도가 멤버변수값으로 대입된다.
		this.longitude = longitude;
	}
	
	public double getLattitude() { // 멤버변수를 외부에 노출시킬 때 getter
		return lattitude; // 변수가 lattitude뿐이라서 this 필요없다.
	}
	public void setLattitude(double lattitude) { // 멤버변수에 값을 넣을 때 setter
		this.lattitude = lattitude; // 인자값을 멤버변수값에 대입한다.
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	
}
