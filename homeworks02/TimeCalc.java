/*

 * To.�����ڴԲ�

�ʴ����� �˷��ִ� ������ �ִµ�

�� ���� ��ð� ��� �������� ��� ����ؾ� �ؼ���.

Ȥ�� �ʰ��� �Է¹����� �ڵ����� ���Ǵ� ���α׷��� ����� �� �� �������?

�׷��ϱ� 500�� �̸� �� ��ð� ��� ���ʶ�� �����ָ� ������.

 

 */

package HomeWorks02;

 

import java.util.Scanner;


public class TimeCalc {

 

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	System.out.println("�ʸ� �Է��ϼ���");

	

	int sec = scan.nextInt();

	int hh = 0;

	int mm = 0;

	int ss = 0;

	

	mm= sec / 60;

	ss = sec - (mm*60);

	hh = mm / 60;

	mm =  mm - (hh*60);

	System.out.println(hh + "�ð�" + mm + "��" + ss + "��");

	}

}