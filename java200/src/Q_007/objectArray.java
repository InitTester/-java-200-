package Q_007;

public class objectArray {
	public static void main(String[] args) {
		// 배열, 문자열, List 계열의 인덱스는 0부터 시작
		Geo[] geo = new Geo[] { new Geo(37.5670,126.9807),
				  				new Geo(47.01,10.2),
				  				new Geo(39.9075,116.39723)};
		
		Geo[] geo2 = new Geo[3];
		geo2[0] = new Geo(37.5670,126.9807);
		geo2[1] = new Geo(47.01,10.2);
		geo2[2] = new Geo(39.9075,116.39723);
		
		System.out.printf("위도:%f, 경도:%f\n",geo[0].getLattitude(),geo[0].getLongitude());
		System.out.printf("위도:%f, 경도:%f\n",geo2[0].getLattitude(),geo2[0].getLongitude());
	}
}
