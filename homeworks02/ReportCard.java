/*

 * To. �����ڴ�

  ����ǥ ���α׷� �� �ϳ� �����ؾ� �մϴ�.

 ������ �л��� ����, ����, ���������� �Է��ϸ�

 ����, ���, �հݿ��ΰ� ��µǴ� ���α׷� �Դϴ�.

 ������ ������ ���� ȭ�鿡 ����϶�� �մϴ�.

 

�л�           ����        ����        ����        ����        ���        �հݿ���

 =======================================================

 ȫ�浿     90       90      90     270      90       (���л�)

 

 �հݿ��δ� ������ ���ٰ� �մϴ�.

 ����� 90�� �̻��̸� ���л�

 0�� �̻� 90���̸� �̸� �հ�

 70�̸��̸� ���հ��̶�� �ϳ׿�.

 ��) ��տ��� �Ҽ������ϴ� �����Դϴ�.

 

 */

package HomeWorks02;

import java.util.Scanner;

public class ReportCard {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("�л��̸��� ����, ����, ���� ������ ���ʴ�� �Է����ּ���");
		String name = scan.next();
		int kor = scan.nextInt(), math =scan.nextInt() , eng = scan.nextInt();
		int sum = kor + math + eng;
		int avg =  sum / 3;

			if(avg>=70){
				System.out.println("�л�           ����        ����        ����        ����        ���        �հݿ���");
				System.out.println(" =======================================================");
				System.out.println(name    +    kor     +  math    + eng       + sum     + avg        + "(�հ�)");
			}
			else if(avg<=69) {
				System.out.println("�л�           ����        ����        ����        ����        ���        �հݿ���");
				System.out.println(" =======================================================");
				System.out.println(name    +     kor     +  math    + eng       + sum     + avg        + "(���հ�)");
			} 
		}	
}