package chap03.test01;
//1) Scanner class import
import java.util.Scanner;
public class ScanTest_01 {
	public static void main(String[] args) {
		//2) Scanner Ŭ������ ��ü sc�� ����
		Scanner sc = new Scanner(System.in);
		//3) ȭ�鿡 �Է��ϰ��� �ϴ� ������ ���
		System.out.print("�й� : ");
		int schNum = sc.nextInt();//scanf_s("%d",&schNum);
		System.out.print("�̸� : ");
		String schName = sc.next();//scanf_s("%s",&schName);
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		//���� = ���� + ����
		int total = kor + eng;
		//��� = ���� / 2 (����) ���� / ���� = ����
		double avg = total / 2.0; // ���� / �Ǽ� = �Ǽ�
		//�Ǵ� double avg = total / (double) 2; ���������ȯ
		System.out.println();
		System.out.printf("�й� = %d, �̸� = %s\n",schNum,schName);
		System.out.printf("���� = %d, ���� = %d\n",kor,eng);
		System.out.printf("���� = %d, ��� = %.2f\n",total, avg);
		sc.close();
	}//end of main() method
}//end of class
