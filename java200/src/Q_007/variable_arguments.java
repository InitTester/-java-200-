package Q_007;

public class variable_arguments {
	public static void main(String[] args) {
		Geo seoul = new Geo(37.5670,126.9807);
		Geo austria = new Geo(47.01,10.2);
		Geo newyork = new Geo(40.714086,-74.228697);
		Geo mexico = new Geo(19.42847,-99.12766);
		Geo china = new Geo(39.9075,116.39723);
		Geo rusia = new Geo(55.75222,37.61556);
		
		showGeo(seoul,seoul,newyork); // 3개인자
		showGeo(seoul,seoul,newyork,mexico,rusia,austria); // 6개인자
	}
	
	public static void showGeo(Geo ...goose) { // 인자가 여러개 와도 된다.
		for(Geo gg : goose) {
			System.out.printf("위도:%f, 경도:%f\n",gg.getLattitude(),gg.getLongitude());
		}
	}
}
