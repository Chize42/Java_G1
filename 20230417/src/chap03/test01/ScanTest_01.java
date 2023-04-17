package chap03.test01;
//1) Scanner class import
import java.util.Scanner;
public class ScanTest_01 {
	public static void main(String[] args) {
		//2) Scanner 클래스형 객체 sc를 생성
		Scanner sc = new Scanner(System.in);
		//3) 화면에 입력하고자 하는 내용을 출력
		System.out.print("학번 : ");
		int schNum = sc.nextInt();//scanf_s("%d",&schNum);
		System.out.print("이름 : ");
		String schName = sc.next();//scanf_s("%s",&schName);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		//총점 = 국어 + 영어
		int total = kor + eng;
		//평균 = 총점 / 2 (주의) 정수 / 정수 = 정수
		double avg = total / 2.0; // 정수 / 실수 = 실수
		//또는 double avg = total / (double) 2; 명시적형변환
		System.out.println();
		System.out.printf("학번 = %d, 이름 = %s\n",schNum,schName);
		System.out.printf("국어 = %d, 영어 = %d\n",kor,eng);
		System.out.printf("총점 = %d, 평균 = %.2f\n",total, avg);
		sc.close();
	}//end of main() method
}//end of class
