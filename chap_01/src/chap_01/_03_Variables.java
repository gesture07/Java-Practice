package chap_01;

public class _03_Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int, long, float, double, char, String, boolean
		
		//변수 = 데이터를 저장하는 공간
		
		//문자열 변수
		String name;
		name="dahye";
		
		
		//숫자형 변수
		int hour = 15;
		double score = 90.5;

		System.out.println(name + "님 배송이 시작됩니다." + hour +"시에 방문예정입니다.");

		//문자형 변수
		char grade ='A';
		
		name="강백호";
		
		System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
		System.out.println("학점은 " + grade +"입니다.");
		
		boolean psaa = true;
		System.out.println("이번 시험에 합격해쓸까요?");
		
		//double변수는 실수만, float변수는 실수 뒤에 f를 붙여줘야함.
		double d =3.141234678;
		float f = 3.141234678f;
		
		System.out.println(d); //9자리까지
		System.out.println(f); //7자리까지
		
		//빨간 줄이 생기는 이유는 담기지 않아서
		//int l =10000000000;
		
		//lond에는 담김.
		long l = 10000000000l;
		System.out.println(l);
	}

}
