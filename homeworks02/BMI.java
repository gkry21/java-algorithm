
/*

 *  To. �����ڴ�

����� �̸��� �Է��ϰ�, ������ , Ű�� �Է��ϸ�

�ش� ����� ���°� ������ ��ü������ �˷��ִ� BMI ���� �����ϴ� ���α׷��� ����� �ּ���.

BMI ���ϴ� ������ �Ʒ��� ���ƿ�. �� �ñ��ϸ� ���⸦ Ŭ���ϼ���.

       BMI = x KG / (y M * y M)

 

Example for 175 cm height and 70 kg weight:

BMI = 70 / (1.75 * 1.75) = 22.86

 

(bmi > 30.0) ����

(bmi > 25.0) ��

(bmi > 23.0) ��ü��

(bmi > 18.5) ����

��ü��

       �̶��ϴ�.

 

 */

package HomeWorks02;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("BMI  ���� ����");

		System.out.println("�̸�");

		String name = scan.next();

		System.out.println("������");

		int weight = scan.nextInt();

		System.out.println("Ű");

		float height = scan.nextInt();

		float bmi = weight / (height /100 * height/100);

		String eval = "";

		if (bmi>30.0) {

			eval = "����";

		} else if (bmi>25.0) {

			eval = "��";

		} else if (bmi>23.0) {

			eval = "��ü��";

		} else if (bmi>18.5){

			eval = "����";

		} else if(bmi<18.5){

			eval = "��ü��";

		}

		else {System.out.println("�ý��� ����");}

		System.out.println(name + "����" + eval + "�Դϴ�");

	}
}