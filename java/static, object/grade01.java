import java.util.Scanner;

public class Sungjuk {

// 1번째 만듬
	//성적처리필드 만들고 성적 데이터 입력, 성적처리도 해야함->데이터 출력
	//클래스이름: Sungjuk 학번, 이름, 국, 영, 수, tot, avg, grade
	//메소드 input() 호출시 학번, 이름, 국, 영, 수 
	//메소드 process() 총점, 평균, 등급
	//메소드 output() 학번,이름, 국, 영, 수, 총점, 평균, 등급 출력
	
	//01 필드..인스턴스필드
	String hakbun, irum, grade;
	int kor, eng, math, tot;
	double avg;
	

	//01-1 정적필드 추가
	static int cnt = 0;
	static double totalAvg = 0;
	
	//디폴트 생성자를 넣는 습관을 들어야함
	Sungjuk() {
		
	}
  //다르게 할시 만드는 생성자..생성자 오버로딩으로 두 개 만들었네
	Sungjuk(String hakbun, String irum, int kor, int eng, int math) {	
	this.hakbun = hakbun;
	this.irum = irum;
	this.kor = kor;
	this.eng = eng;
	this.math = math;
	}
	//02 메소드..인스턴스메소드
	boolean input() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("학번 입력 => ");
		hakbun = in.next();
		//return값때문에 void input에서 불린 input으로 바꿈
		if (hakbun.equals("exit")) 
			return true;
		System.out.print("이름 입력 => ");
		irum = in.next();
		System.out.print("국어 입력 => ");
		kor = in.nextInt();
		System.out.print("영어 입력 => ");
		eng = in.nextInt();	
		System.out.print("수학 입력 => ");
		math = in.nextInt();
		//정적필드 cnt 증가..카운트용
		cnt++;
		
		return false;
	}
	
	void process() {
		this.tot = kor + eng + math;
		avg = tot / 3.;
		totalAvg += avg;
		switch((int) avg/10) {
		case 10:
		case 9:
			grade = "수";
			break;
		case 8:
			grade = "우";
		break;
		case 7:
			grade = "미";
		break;
		case 6:
			grade = "양";
		break;
		default:
			grade = "가";
		break;
		}
	}
	void output() {
		System.out.printf("%2s    %2s    %3d    %3d    %3d    %3d    %6.2f    %2s\n",
				  hakbun, irum, kor, eng, math, tot, avg, grade);
	}
	//02-2 정적메소드 추가
	static double getTotal() {
		return totalAvg / cnt;
	}

	
}	
	
