/*

 * To. �����ڴ�

���α׷��� �ϳ� �����ؾ� �մϴ�.

������ ��û�ϱ⸦ ���������� ����� ���⸦ ����� �޶��ϴ�.

������ �ʿ�� ����, ��Ģ���� �����ϰ� ��������

��� ������������ ����ϸ� �ȴ�ϴ�.

��°������ ���� ���

5 + 5 = 10

2 - 7 = -5

�̷��� �ǰ�,

10 / 3 = 3 [1] �������� �̷��� ������ �ȴ�ϴ�.

�׷��� []���� ������������ ������ �̹� �˰� �ְڴ�ϴ�.

 */

package HomeWorks02;
import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("1. + |n 2. - |n  3. / |n 4. *");

		int op = scan.nextInt();

		System.out.println("���� �Է����ּ���");

		System.out.println("ù��° ��");

		int first  = scan.nextInt();

		System.out.println("�ι�° ��");

		int sec = scan.nextInt();

		int eval = 0;

		int frag = 0;

		int result = 0;

		if (op==1){

			eval =  first + sec;

			System.out.println( first + " + " + sec + " = " + eval);

		} else if (op==2){

			eval = first - sec;

			System.out.println( first + " - " + sec + " = " + eval);

		} else if (op==3){

			eval = first / sec;

			result = first % sec;

         System.out.println( first + " / " + sec + " = " + eval + "[" + result + "]");

		} else if (op==4){

			eval = first * sec;

			System.out.println( first + " * " + sec + " = " + eval);

		} else {System.out.println("�����Դϴ�");}

	}

}